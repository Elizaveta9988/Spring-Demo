package springhw12;
@RestController
@RequestMapping("/tasks")
@AllArgsConstructor
public class TaskController {
    private final TaskService taskService;
    private final FileGateway fileGateway;


    /**
     * Добавить задачу
     * @param task задача
     * @return заметка
     */
    @PostMapping
    public ResponseEntity<Task> addTask(@RequestBody Task task) {
        task.setCreatedDate(LocalDateTime.now());
        fileGateway.writeToFile(task.getTask_name() + ".txt", task.toString());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Добавление задачи в список
     * @param task сама задача
     * @return  возвращаем новую задачу
     */
//

    /**
     * Получение списка всех задач.
     * @return возвращаем список всех задач.
     */
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }


    /**
     * Просмотр задач по статусу
     * @param status    статус задач
     * @return список задач одного статуса
     */
    @GetMapping("/status/{status}")
    public List<Task> findByStatus(@PathVariable TaskStatus status){
        return taskService.findByStatus(status);
    }


    /**
     * Обновление статуса задачи по её id
     * @param id    id задачи
     * @param task сама задача
     * @return  вернется обновленная задача с новым статусом.
     */
    @PutMapping("/{id}")
    public Task updateTaskStatus(@PathVariable Long id, @RequestBody Task task){
        return taskService.updateTaskStatus(id,task);
    }

    /**
     * Удаление задачи по её ID
     * @param id ID задачи
     */
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
}

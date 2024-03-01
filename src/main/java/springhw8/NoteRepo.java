package springhw8;
@Repository
public class NoteRepo {
    /**
     * Найти заметку по id
     * @param id must not be {@literal null}.
     * @return возвращает заметку.
     */
    Optional<Note> findById(Long id);
}

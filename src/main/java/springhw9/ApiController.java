package springhw9;
@RestController
@RequestMapping("/serviceA")
public class ApiController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello from Microservice-1";
}

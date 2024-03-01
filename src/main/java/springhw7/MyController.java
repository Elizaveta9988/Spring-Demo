package springhw7;
@Controller
public class MyController {

    /**
     * Домашняя страница.
     * @return html файл домашней страницы из templates
     */
    @GetMapping("/")
    public String home(){
        return "home_page";
    }

    /**
     * Страница для пользователей с ролью USER.
     * @return публичное представление.
     */
    @GetMapping("/public-data")
    public String userPage(){
        return "public_page";
    }

    /**
     * Страница для пользователей с ролью ADMIN.
     * @return закрытое представление.
     */
    @GetMapping("/private-data")
    public String adminPage(){
        return "private_page";
    }

    /**
     * Аутентификация пользователя.
     * @return представление аутентификации.
     */
    @GetMapping("/login")
    public String auth(){
        return "login_page";
}

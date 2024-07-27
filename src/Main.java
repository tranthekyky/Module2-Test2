import menu.MainMenu;
import menu.MenuLogin;
import menu.MenuStudent;

public class Main {
    public static void main(String[] args) {
        MenuLogin menuLogin = new MenuLogin();
        menuLogin.handleLogin();
    }
}
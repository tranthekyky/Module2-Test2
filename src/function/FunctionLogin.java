package function;

import designversion.InterfaceLogin;
import object.User;

import java.util.ArrayList;

public class FunctionLogin implements InterfaceLogin <User> {
    ArrayList<User> users;
    public FunctionLogin() {
        users = new ArrayList<>();
    }


    @Override
    public boolean checkUser(String username, int password) {
        for (User user : users) {
            if (user.getUserName().equals(username) && user.getPassword() == password) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void registerUser(String username, int password) {
        users.add(new User(username, password));
    }

    @Override
    public void loginUser(String username, int password) {
        System.out.println("Successfully logged in");
    }

    @Override
    public ArrayList<User> getAllUser() {
        return users;
    }
}

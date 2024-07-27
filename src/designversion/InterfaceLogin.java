package designversion;

import java.util.ArrayList;

public interface InterfaceLogin <E>{
    public boolean checkUser(String username, int password);
    public void registerUser(String username, int password);
    public void loginUser(String username , int password);
    public ArrayList<E> getAllUser();

}

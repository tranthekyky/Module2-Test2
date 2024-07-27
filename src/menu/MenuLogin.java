package menu;

import function.FunctionLogin;


import java.util.Scanner;

public class MenuLogin {
    Scanner inputString = new Scanner(System.in);
    Scanner inputNumber = new Scanner(System.in);
    FunctionLogin login = new FunctionLogin();
    MainMenu mainMenu = new MainMenu();
    public void handleLogin() {
        System.out.println("Welcome to the Login Menu");
        int option ;
        do {
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("0. Exit");
            System.out.println();
            System.out.println("Please enter your option");
            option = inputNumber.nextInt();
            switch (option) {
                case 1:
                    functionLogin();
                    break;
                case 2:
                    functionRegister();
                    break;
            }
        }while(option != 0);
        System.out.println("Program stopped ... !!");
    }
    public void functionLogin() {
        System.out.println("==== LOGIN ====");
            boolean isCheck ;

            System.out.println("Enter your username :");
            String username = inputString.nextLine();
            System.out.println("Enter your password :");
            int password = inputNumber.nextInt();
            isCheck = login.checkUser(username, password);
            if (isCheck) {
                mainMenu.mainMenu();
            }else {
                System.out.println("Account does not exist !!, please try again");
            }




    }
    public void functionRegister() {
        System.out.println("==== REGISTER ====");
        System.out.println("Enter your username :");
        String username = inputString.nextLine();
        System.out.println("------------");
        System.out.println("Enter your password :");
        int password = inputNumber.nextInt();
        login.registerUser(username, password);
        System.out.println("Register successful !!");
    }
}

package menu;

import java.util.Scanner;

public class MainMenu {
    MenuStudent menuStudent = new MenuStudent();
    MenuSchool menuSchool = new MenuSchool();
    Scanner str = new Scanner(System.in);
    Scanner number = new Scanner(System.in);

    public void mainMenu () {

        int choice ;
        do {
            System.out.println("==== HOME PAGE ====");
            System.out.println("1 -- School Manager");
            System.out.println("2 -- Student Manager");
            System.out.println("0 -- Exit");
            System.out.println("Enter your choice in HOME PAGE");
            choice = number.nextInt();
               switch (choice) {
                   case 1:
                       menuSchool.handleFunctionSchool() ;
                       break;
                   case 2:
                       menuStudent.handleFunctionStudent() ;
                       break;
                    }
        }while (choice != 0);

    }
}

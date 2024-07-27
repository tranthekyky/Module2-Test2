package menu;

import function.FunctionSchool;
import object.School;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuSchool {
    FunctionSchool functionSchool = new FunctionSchool();
    Scanner inputString = new Scanner(System.in);
    Scanner inputNumber = new Scanner(System.in);
    public void handleFunctionSchool() {
        int choice ;
        do {
            menuSchool();
            System.out.println("Enter your choice: ");
            choice = inputNumber.nextInt();
                switch (choice) {
                    case 1:
                        functionAdd();
                        break;
                    case 2:
                        functionRemove();
                        break;
                    case 3:
                        functionUpdate();
                        break;
                    case 4:
                        functionFindByCode();
                        break;
                    case 5:
                        functionDisplay();
                        break;
                    case 6:
                        functionFindByChalacter();
                        break;
                }
        }while (choice != 0);
    }
    public void menuSchool() {
        System.out.println("===== Menu School =====");
        System.out.println( "1. Add school " +
                "\n2. Remove school" +
                "\n3. Update school" +
                "\n4. Find by CODE school" +
                "\n5. Display All school" +
                "\n6. Find by chalacter" +
                "\n0. Return to home page");
        System.out.println();

    }
    public void functionAdd() {
        System.out.println("-ENTER INFOMATION ADD-");
        System.out.println("Enter name : ");
        String name = inputString.nextLine();
        System.out.println("Enter code : ");
        String code = inputString.nextLine();
        System.out.println("Enter address : ");
        String address = inputString.nextLine();
        School school = new School(name, code, address);
        functionSchool.addSchool(school);
        System.out.println("Add success !! ");
    }
    public void functionRemove() {
        System.out.println("-ENTER INFOMATION REMOVE-");
        System.out.println("Enter code  : ");
        String code;
        int index ;
        do {
            code = inputString.nextLine();
            index = functionSchool.findSchoolByCode(code);
            if (index != -1) {
                functionSchool.removeSchool(code);
                System.out.println("Remove success !! ");
            }else {
                System.out.println("Code does not exist, please try again ");
            }

        }while (index == -1) ;
    }
    public void functionUpdate() {
        System.out.println("-ENTER INFOMATION UPDATE-");
        System.out.println("Enter code  : ");
        String code;
        int index ;
        do {
            code = inputString.nextLine();
            index = functionSchool.findSchoolByCode(code);
            if (index != -1) {
                System.out.println("Fill in the information that needs to be updated : ");
                System.out.println("Enter new name : ");
                String newName = inputString.nextLine();
                System.out.println("Enter new code : ");
                String newCode = inputString.nextLine();
                System.out.println("Enter new address : ");
                String newAddress = inputString.nextLine();
                School school = new School(newName, newCode, newAddress);
                functionSchool.updateSchool(code, school);
                System.out.println("Update success !! ");
            }else {
                System.out.println("Code does not exist, please try again ");
            }
        }while (index == -1) ;
    }
    public void functionFindByCode() {
        System.out.println("-ENTER INFOMATION FIND-BY-CODE-");
        System.out.println("Enter code : ");
        String code ;
        int index ;
        do {
            code = inputString.nextLine();
            index = functionSchool.findSchoolByCode(code);
            if (index != -1) {
                System.out.println("School have code : " + code + " -->");
                System.out.println(functionSchool.getAllSchool().get(index));
            }
        }while (index == -1);
    }
    public void functionDisplay() {
        System.out.println("-ENTER INFOMATION DISPLAY-");
        for (School school : functionSchool.getAllSchool()) {
            System.out.println(school);
        }
    }
    public void functionFindByChalacter() {
        System.out.println("-ENTER INFOMATION FIND-BY-CHALACTER-");
        System.out.println("Enter chalactor : ");
        ArrayList<School> schoolsNew = functionSchool.getAllSchool();
        String cha ;
        do {
            cha = inputString.nextLine();
            schoolsNew = functionSchool.findSchoolByChalacter(cha);
            if (schoolsNew != null) {
                for (School school : schoolsNew) {
                    System.out.println(school);
                }
            }else {
                System.out.println("Code does not exist, please try again ");
            }
        }while (cha == null);

    }

}

package menu;

import function.FunctionStudent;
import object.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuStudent {
    FunctionStudent functionStudent = new FunctionStudent();
    Scanner inputString = new Scanner(System.in);
    Scanner inputNumber = new Scanner(System.in);
    public void handleFunctionStudent() {

        int choice ;
        do {
            menuStudent();
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
                        functionFindById();
                        break;
                    case 5 :
                        functionDisplayAll();
                        break;
                    case 6:
                        functionFindByChalacter();
                        break;
                    case 7:
                        functionFindByScoreRange();
                        break;
                    case 8:
                        functionFindByAgeRange();
                        break;
                }
        }while (choice != 0);

    }
    public void menuStudent() {
        System.out.println("===== Menu Student =====");
        System.out.println( "1. Add student " +
                            "\n2. Remove student" +
                            "\n3. Update student" +
                            "\n4. Find by ID student" +
                            "\n5. Display All Student" +
                            "\n6. Find by chalacter" +
                            "\n7. Find by score medium range " +
                            "\n8. Find by age range" +
                            "\n0. Return to home page");
        System.out.println();
        System.out.println("Enter your choice: ");
    }
    public void functionAdd() {
        System.out.println("-ENTER INFOMATION ADD-");
        System.out.println("Enter name : ");
        String name = inputString.nextLine();
        System.out.println("Enter age : ");
        int age = inputNumber.nextInt();
        double [] score = new double [3];
        System.out.println("Enter score 1 : ");
        score[0] = inputNumber.nextDouble();
        System.out.println("Enter score 2 : ");
        score[1] = inputNumber.nextDouble();
        System.out.println("Enter score 3 : ");
        score[2] = inputNumber.nextDouble();
        Student student = new Student(name, age, score);
        functionStudent.addStudent(student);
        System.out.println("Add success !!");

    }
    public void functionRemove() {
        System.out.println("-ENTER INFOMATION REMOVE-");
        System.out.println("Enter ID : ");
        int id;
        do {
            id = inputNumber.nextInt();
            if (functionStudent.findStudentById(id) != -1) {
                functionStudent.deleteStudent(id);
                System.out.println("Remove success !!");
            }else {
                System.out.println("ID does not exist, please try again");
            }

        }while (functionStudent.findStudentById(id) == -1) ;
    }
    public void functionUpdate() {
        System.out.println("-ENTER INFOMATION UPDATE-");
        System.out.println("Enter ID : ");
        int id;
        do {
            id = inputNumber.nextInt();
            if (functionStudent.findStudentById(id) != -1) {
                System.out.println("Fill in the information that needs to be updated : ");
                System.out.println("Enter new name : ");
                String name = inputString.nextLine();
                System.out.println("Enter new age : ");
                int age = inputNumber.nextInt();
                double [] score = new double [3];
                System.out.println("Enter score 1 : ");
                score[0] = inputNumber.nextDouble();
                System.out.println("Enter score 2 : ");
                score[1] = inputNumber.nextDouble();
                System.out.println("Enter score 3 : ");
                score[2] = inputNumber.nextDouble();
                Student newStudent = new Student(name , age, score);
                functionStudent.updateStudent(id, newStudent);
                System.out.println("Update success !!");
            }
        }while (functionStudent.findStudentById(id) != -1);
    }
    public void functionFindById() {
        System.out.println("-ENTER INFOMATION FIND-BY-ID-");
        System.out.println("Enter ID : ");
        int id;
        do {
            id = inputNumber.nextInt();
            if (functionStudent.findStudentById(id) != -1) {
               Student student = functionStudent.getAllStudents().get(id);
                System.out.println("Student have ID :" + id + " -->");
               System.out.println(student);
            }else {
                System.out.println("ID does not exist, please try again");
            }

        }while (functionStudent.findStudentById(id) == -1) ;
    }
    public void functionFindByChalacter() {
        System.out.println("-ENTER INFOMATION FIND-BY-CHALACTER-");
        System.out.println("Enter chalacter : ");
        ArrayList<Student> studentsNew = functionStudent.getAllStudents();
        String cha ;
        do {
            cha = inputString.nextLine();
            studentsNew = functionStudent.getStudentsByChalacter(cha) ;
            if (studentsNew != null) {
                System.out.println("All students have chalacter :" + cha);
                for (Student student : studentsNew) {
                    System.out.println(student);
                }
            }else {
                System.out.println("Chalacter does not exist, please try again");
            }
        }while (studentsNew == null);

    }
    public void functionFindByScoreRange() {
        System.out.println("-ENTER INFOMATION FIND-BY-SCORE-RANGE-");
        ArrayList<Student> studentsNew = functionStudent.getAllStudents();
        double from ;
        double to ;
        do {
            System.out.println("From this score : ");
            from = inputNumber.nextDouble();
            System.out.println("To this score : ");
            to = inputNumber.nextDouble();
            studentsNew = functionStudent.getStudentsByScore(from, to);
            if ( studentsNew != null) {
                System.out.println("All students have score medium :" + from + " - " + to);
                for (Student student : studentsNew) {
                    System.out.println(student);
                }
            }else {
                System.out.println("Score does not exist, please try again");
            }
        }while (studentsNew == null);

    }
    public void functionFindByAgeRange() {
        System.out.println("-ENTER INFOMATION FIND-BY-AGE-RANGE-");
        ArrayList<Student> studentsNew = new ArrayList<>();
        int from ;
        int to ;
        do {
            System.out.println("From this age : ");
            from = inputNumber.nextInt();
            System.out.println("To this age : ");
            to = inputNumber.nextInt();
            studentsNew = functionStudent.getStudentsByAge(from, to);
            if ( studentsNew != null) {
                System.out.println("All students have age medium :" + from + " - " + to);
                for (Student student : studentsNew) {
                    System.out.println(student);
                }
            }else {
                System.out.println("Score does not exist, please try again");
            }
        }while (studentsNew == null);

    }
    public void functionDisplayAll() {
        for (Student student : functionStudent.getAllStudents()) {
            System.out.println(student);
        }
    }
}

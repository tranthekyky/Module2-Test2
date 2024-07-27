package function;

import designversion.InterfaceStudent;
import object.Student;

import java.util.ArrayList;

public class FunctionStudent implements InterfaceStudent <Student> {
    private ArrayList<Student> studentList ;
    public FunctionStudent() {
        studentList = new ArrayList<>();
    }
    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void deleteStudent(int id) {
        studentList.remove(id);
    }

    @Override
    public void updateStudent(int id, Student student) {
        studentList.set(id, student);
    }

    @Override
    public int findStudentById(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public double scoreMedium(double[] score) {
        double sum = 0;
        for (int i = 0 ; i < score.length ; i++) {
            sum += score[i];
        }
        return sum / 3 ;
    }

    @Override
    public ArrayList<Student> getAllStudents() {
        return studentList;
    }

    @Override
    public ArrayList<Student> getStudentsByChalacter(String cha) {
        ArrayList<Student> studentsNew = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getName().toLowerCase().contains(cha.toLowerCase())) {
                studentsNew.add(student);
            }
        }
        return studentsNew;
    }

    @Override
    public ArrayList<Student> getStudentsByScore(double minScore, double maxScore) {
        ArrayList<Student> studentsNew = new ArrayList<>();
        for (Student student : studentList) {
            if (scoreMedium(student.getScores()) >= minScore && scoreMedium(student.getScores()) <= maxScore) {
                studentsNew.add(student);
                return studentsNew ;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Student> getStudentsByAge(int minAge, int maxAge) {
        ArrayList<Student> studentsNew = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getAge() >= minAge && student.getAge() <= maxAge) {
                studentsNew.add(student);
            }
        }
        return studentsNew;
    }
}

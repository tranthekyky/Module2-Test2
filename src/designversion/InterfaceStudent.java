package designversion;

import java.util.ArrayList;

public interface InterfaceStudent <E>{
    void addStudent(E e);
    void deleteStudent(int id );
    void updateStudent(int id,E e);
    int findStudentById(int id);
    double scoreMedium(double []score);
    ArrayList<E> getAllStudents();
    ArrayList<E> getStudentsByChalacter(String cha);
    ArrayList<E> getStudentsByScore(double minScore , double maxScore);
    ArrayList<E> getStudentsByAge(int minAge, int maxAge);
}

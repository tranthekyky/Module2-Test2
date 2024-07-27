package designversion;

import java.util.ArrayList;

public interface InterfaceSchool <E>{
    void addSchool(E e);
    void removeSchool(String code);
    void updateSchool(String code,E e);
    int findSchoolByCode(String code);
    ArrayList<E> findSchoolByChalacter(String cha);
    ArrayList<E> getAllSchool();



}

package function;

import designversion.InterfaceSchool;
import object.School;

import java.util.ArrayList;

public class FunctionSchool implements InterfaceSchool <School> {
    ArrayList<School> schoolsList;
    public FunctionSchool() {
        schoolsList = new ArrayList<>();
    }
    @Override
    public void addSchool(School school) {
        schoolsList.add(school);
    }

    @Override
    public void removeSchool(String code) {
        schoolsList.remove(findSchoolByCode(code));
    }

    @Override
    public void updateSchool(String code, School school) {

    }

    @Override
    public int findSchoolByCode(String code) {
        for (int i = 0; i < schoolsList.size(); i++) {
            if (schoolsList.get(i).getSchoolCode().equals(code)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ArrayList<School> findSchoolByChalacter(String cha) {
        ArrayList<School> schoolsNew = new ArrayList<>();
        for (int i = 0; i < schoolsList.size(); i++) {
            if (schoolsList.get(i).getSchoolName().toLowerCase().contains(cha.toLowerCase())) {
                schoolsNew.add(schoolsList.get(i));
            }
        }
        return schoolsNew;
    }

    @Override
    public ArrayList<School> getAllSchool() {
        return schoolsList;
    }
}

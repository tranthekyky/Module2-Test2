package object;

import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private int age;
    private double[] scores;

    public static int count = 0;

    public Student( String name, int age, double[] scores) {
        this.id = count ;
        this.name = name;
        this.age = age;
        this.scores = scores;
        count++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    @Override
    public String toString() {
        return "Student [" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", scores=" + Arrays.toString(scores) +
                " ]";
    }
}

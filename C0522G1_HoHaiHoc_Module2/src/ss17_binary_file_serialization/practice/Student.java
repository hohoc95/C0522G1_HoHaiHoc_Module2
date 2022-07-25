package ss17_binary_file_serialization.practice;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private double score;

    public Student(){
    }

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name='" + name + ", score=" + score + "\n" ;
    }

}

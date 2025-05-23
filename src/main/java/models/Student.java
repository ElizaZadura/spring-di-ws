package models;

public class Student {
    private int id;
    private String name;

    public Student(String name) {
        this.id = (int) (Math.random() * 10000);
        this.name = name;
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
}

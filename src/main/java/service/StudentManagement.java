package service;

import models.Student;
import java.util.List;

public interface StudentManagement {
    Student createStudent(String name);
    void saveStudent(Student student);
    Student findStudent(int id);
    List<Student> findAllStudents();
    void editStudent(Student student);
}

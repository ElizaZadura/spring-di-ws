package data_access;

import models.Student;

import java.util.List;

public interface StudentDao {
    Student saveStudent(Student student);
    Student findStudent(int id);
    List<Student> findAll();
    void deleteStudent(int id);
}

package service;

import data_access.StudentDao;
import models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import util.UserInputService;

import java.util.List;

@Component
public class StudentManagementConsoleImpl implements StudentManagement {
    private final StudentDao studentDao;
    private final UserInputService userInputService;

    @Autowired
    public StudentManagementConsoleImpl(StudentDao studentDao, UserInputService userInputService) {
        this.studentDao = studentDao;
        this.userInputService = userInputService;
    }

    @Override
    public Student createStudent(String name) {
        return new Student(name);
    }

    @Override
    public void saveStudent(Student student) {
        studentDao.saveStudent(student);
    }

    @Override
    public Student findStudent(int id) {
        return studentDao.findStudent(id);
    }

    @Override
    public List<Student> findAllStudents() {
        return studentDao.findAll();
    }

    @Override
    public void editStudent(Student student) {
        // Implement edit logic if needed
    }

    public void run() {
        System.out.println("Enter student name:");
        String name = userInputService.getString();
        Student student = createStudent(name);
        saveStudent(student);
        System.out.println("Saved student: " + student.getName());
    }
}

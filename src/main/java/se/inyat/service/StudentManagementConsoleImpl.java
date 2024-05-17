package se.inyat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import se.inyat.data_access.StudentDao;
import se.inyat.exception.DataNotFoundException;
import se.inyat.models.Student;
import se.inyat.util.UserInputService;

import java.util.List;

@Component
public class StudentManagementConsoleImpl implements StudentManagement {

    //dependency injection from UserInputService and StudentDao
    UserInputService userInputService;
    StudentDao studentDao;

    @Autowired
    public StudentManagementConsoleImpl(UserInputService userInputService, StudentDao studentDao) {
        this.userInputService = userInputService;
        this.studentDao = studentDao;
    }
    @Override
    public Student create() {
        System.out.println("Enter name: ");
        String name = userInputService.getString();
        Student student = new Student(name);
        return studentDao.save(student);//return created student
    }

    @Override
    public Student save(Student student) {
        if(student == null) throw new IllegalArgumentException("Student must not be null");
        return studentDao.save(student);
    }

    @Override
    public Student find(int id) {
        if (id < 0) throw new IllegalArgumentException("Id must not be negative");
        return studentDao.find(id);
    }

    @Override
    public Student remove(int id) {
        //todo
        return null;
    }

    @Override
    public List<Student> findAll() {
        //todo
        return null;
    }

    @Override
    public Student edit(Student student) {
        //todo
        return null;
    }
}

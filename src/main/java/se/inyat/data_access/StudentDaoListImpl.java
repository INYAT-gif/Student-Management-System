package se.inyat.data_access;

import org.springframework.stereotype.Component;
import se.inyat.models.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class StudentDaoListImpl implements StudentDao {

    private final List<Student> students = new ArrayList<>();

    @Override
    public Student save(Student student) {
        Optional<Student> existingStudentOpt = students.stream()
                .filter(s -> s.getId() == student.getId())
                .findFirst();

        if (existingStudentOpt.isPresent()) {
            students.remove(existingStudentOpt.get());
        }

        students.add(student);
        return student;
    }

    @Override
    public Student find(int id) {
        return students.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(students);
    }

    @Override
    public void delete(int id) {
        students.removeIf(s -> s.getId() == id);
    }
}

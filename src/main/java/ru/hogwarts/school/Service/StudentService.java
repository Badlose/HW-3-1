package ru.hogwarts.school.Service;

import ru.hogwarts.school.Model.Student;

import java.util.Collection;

public interface StudentService {

    Student addStudent(Student student);

    void removeStudent(long id);

    Student editStudent(Student student);

    Student getStudent(long id);

    Collection<Student> getAllStudents();
}

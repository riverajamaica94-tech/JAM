package com.example.caltron.repository;

import com.example.caltron.model.Student;
import java.util.ArrayList;
import java.util.List;

public class InMemoryStudentRepository implements StudentRepository {
    private final List<Student> students = new ArrayList<>();

    @Override
    public void save(Student student) {
        students.add(student);
    }

    @Override
    public List<Student> findAll() {
        return students;
    }
}

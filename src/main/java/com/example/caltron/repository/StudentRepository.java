// File: com/example/caltron/repository/StudentRepository.java

package com.example.caltron.repository;

import com.example.caltron.model.Student;
import java.util.List;

public interface StudentRepository {
    void save(Student student);
    List<Student> findAll();
}
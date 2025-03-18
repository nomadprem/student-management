package com.example.studentmanagement.service;

import com.example.studentmanagement.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private final List<Student> students = new ArrayList<>();
    private int studentCounter = 1;  // Start ID from 1

    public List<Student> getAllStudents() {
        return students;
    }

    public void saveStudent(Student student) {
        student.setId(studentCounter++);
        students.add(student);
    }

    public void deleteStudentById(int id) {
        students.removeIf(student -> student.getId() == id);
    }
}

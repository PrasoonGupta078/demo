package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id));
    }

    public String addStudent(Student student) {
        studentRepository.save(student);
        return "Student saved: " + student.name;
    }

    public String updateStudent(Long id, Student updatedStudent) {
        Student student = studentRepository.findById(id).orElseThrow();
        student.name = updatedStudent.name;
        student.age = updatedStudent.age;
        student.course = updatedStudent.course;
        studentRepository.save(student);
        return "Student updated!";
    }

    public String deleteStudent(Long id) {
        studentRepository.deleteById(id);
        return "Student deleted!";
    }
}
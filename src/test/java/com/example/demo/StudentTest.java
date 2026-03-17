package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void studentShouldHaveCorrectName() {
        Student student = new Student("Prasoon", 21, "Backend Developer");
        assertEquals("Prasoon", student.name);
    }

    @Test
    void studentAgeShouldBeCorrect() {
        Student student = new Student("Prasoon", 21, "Backend Developer");
        assertEquals(21, student.age);
    }
}
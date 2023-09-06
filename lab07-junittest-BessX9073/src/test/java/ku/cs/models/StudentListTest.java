package ku.cs.models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentListTest {

    @Test
    void testAddNewStudent(){
        StudentList sl = new StudentList();
        sl.addNewStudent("6510000001","Heung Min son");
        sl.addNewStudent("6510000002","Ronaldo");

        ArrayList<Student> students = sl.getStudents();
        assertEquals(1, students.size());
        assertEquals("6510000001", students.get(0).getId());
        assertEquals("Heung Min son", students.get(0).getName());
    }
    @Test
    public void testAddNewStudentWithScore() {
        StudentList sl = new StudentList();
        sl.addNewStudent("6510000002", "Ronaldo", 85.0);
        ArrayList<Student> students = sl.getStudents();
        assertEquals(1, students.size());
        assertEquals("6510000002", students.get(0).getId());
        assertEquals("Ronaldo", students.get(0).getName());
        assertEquals(85.0, students.get(0).getScore(), 0.01);
    }

    @Test
    public void testFindStudentById() {
        StudentList sl = new StudentList();
        sl.addNewStudent("6510000002", "Ronaldo");
        Student foundStudent = sl.findStudentById("6510000002");
        assertNotNull(foundStudent);
        assertEquals("6510000002", foundStudent.getId());
        assertEquals("Ronaldo", foundStudent.getName());
    }

    @Test
    public void testGiveScoreToId() {
        StudentList sl = new StudentList();
        sl.addNewStudent("6510000002", "Ronaldo");
        sl.giveScoreToId("46510000002", 92.5);
        Student student = sl.findStudentById("6510000002");
        assertNotNull(student);
        assertEquals(92.5, student.getScore(), 0.01);
    }

    @Test
    public void testViewGradeOfId() {
        StudentList sl = new StudentList();
        sl.addNewStudent("6510000002", "Ronaldo", 75.5);
        String grade = sl.viewGradeOfId("6510000002");
        assertEquals("B", grade);
    }

}
package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testAddScore(){
        Student gus = new Student("6xxx","test");
        gus.addScore(45.15);
        assertEquals(45.15,gus.getScore());
    }

    @Test
    void testCalculateGrade(){
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        s.addScore(85);
        assertEquals("A", s.grade());
    }

}
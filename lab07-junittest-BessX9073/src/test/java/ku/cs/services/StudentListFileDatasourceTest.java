package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;

import static org.junit.jupiter.api.Assertions.*;
class StudentListFileDatasourceTest {
    private Datasource<StudentList> datasource;
    @Test
    void testReadData() {
        datasource = new StudentListFileDatasource("data", "student-list.csv");
        StudentList list = datasource.readData();

        String actualId = list.getStudents().get(0).getId();
        String expectedId = "6410450001";
        assertEquals(expectedId, actualId);

        String actualName = list.getStudents().get(0).getName();
        String expectedName = "Tim Berners-Lee";
        assertEquals(expectedName, actualName);

        double actualScore = list.getStudents().get(0).getScore();
        double expectedScore = 67.5;
        assertEquals(actualScore, expectedScore);
    }

    @Test
    void testWriteData() {
        datasource = new StudentListFileDatasource("data", "student-list.csv");
        StudentList list = datasource.readData();
        list.addNewStudent("1234", "gogo", 80.0);

        datasource.writeData(list);

        // new student
        String actual = list.getStudents().get(5).getName();
        String expected = "gogo";

        assertEquals(expected, actual);
    }

    @Test
    void testCheckFileIsExisted() {
        datasource = new StudentListFileDatasource("data", "student-list.csv");
        assertNotNull(datasource);
    }
}
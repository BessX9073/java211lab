package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    @DisplayName("ทดสอบ constructor เเละ getter")
    void testUser(){
        User u =new User("Ronaldo");
        User a =new User("Messi","password");
        assertEquals(u.getUsername(),"Ronaldo");
        assertEquals(u.getPassword(),null);
        assertEquals(a.getPassword(),a.getPassword());

    }
    @Test
    @DisplayName("ทดสอบตรวจสอบว่า ชื่อ user ตรงกันหรือไหม ออกเป็น Ture/False")
    void testIsUsername() {
        User u =new User("Ronaldo","ccr777");
        assertTrue(u.isUsername("Ronaldo"));
        assertFalse(u.isUsername("cr7"));
    }
    @Test
    @DisplayName("ทดสอบตรวจสอบการเปลี่ยน password")
    void testSetPassword(){
        User u =new User("Ronaldo","cr7777");
        u.setPassword("5bonlondorr");
        assertEquals(u.getPassword(),u.getPassword());
    }
    @Test
    @DisplayName("ทดสอบว่า Password ได้ validate")
    void testValidatePassword(){
        User u =new User("Ronaldo","cr7777");
        assertTrue(u.validatePassword("cr7777"));
    }
}
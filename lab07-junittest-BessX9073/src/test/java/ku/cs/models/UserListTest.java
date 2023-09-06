package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    void testUserListFindUser() {
        UserList list1 =new UserList();
        list1.addUser("Ronaldo","password");
        list1.addUser("Ronaldo","password1");
        assertEquals(list1.findUserByUsername("Ronaldo").getUsername(),"Ronaldo");
    }

    @Test
    @DisplayName("User can change password")
    void testAddUser() {
        UserList list1 =new UserList();
        list1.addUser("Ronaldo","password");
        list1.addUser("Ronaldo","password1");
        assertTrue(list1.changePassword("Ronaldo","password","oo"));
    }

    @Test
    @DisplayName("User can login")
    void testLogin(){
        UserList list1 =new UserList();
        list1.addUser("Ronaldo","password");
        assertEquals(list1.login("Ronaldo","password").getUsername(),"Ronaldo");
    }
}
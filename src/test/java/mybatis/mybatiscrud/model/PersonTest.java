package mybatis.mybatiscrud.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getId() {
        Person testPerson = new Person();
        testPerson.setId(5);
        assertTrue(testPerson.getId()==5,"ошибка");
        testPerson.setId(10);
        assertTrue(testPerson.getId()==10,"ошибка");
        testPerson.setId(-1);
        assertTrue(testPerson.getId()==-1,"ошибка");
        testPerson.setId(2147483647);
        assertTrue(testPerson.getId()==2147483647,"ошибка");
        assertFalse(testPerson.getId()==30);
        testPerson.setId(3);
        //assertEquals(4, testPerson.getId());
        assertEquals(3, testPerson.getId());
        assertEquals(3.5, testPerson.getId(), 0.6 );
    }

    @Test
    void getName(){
        Person testPerson = new Person();
        assertNotNull(testPerson.getName());
    }

    @Test
    void getName2(){
        Person testPerson = new Person();
        assertNull(testPerson.getName());
        testPerson.setName("Oleg");
    }
}
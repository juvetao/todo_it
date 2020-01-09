package se.lexicon.cheng.data;

import org.junit.Before;
import org.junit.Test;
import se.lexicon.cheng.model.Person;

import static org.junit.Assert.*;

public class PeopleTest {
    private People testObject;

    @Before
    public void before(){
        testObject = new People();
        testObject.clear();
        testObject.createPerson("Erik", "Svensson");
        testObject.createPerson("Simon", "Elrink");
        testObject.createPerson("Ulf", "Bengtsson");
    }

    @Test
    public void given_firstName_and_lastName_createPerson_add_new_person_and_return(){
        String firstName = "Test";
        String lastName = "Testsson";
        int expectedSize = testObject.size() +1;
        Person result = testObject.createPerson(firstName, lastName);

        assertNotNull(result);
        assertTrue(result.getPersonId()>0);
//        assertEquals(1, result.getPersonId());
        assertEquals(expectedSize, testObject.size());
    }

    @Test
    public void findAll_return_array_size_3(){
        Person[] result = testObject.findAll();

        assertEquals(3, result.length);
    }

    @Test
    public void given_1_findById_return_testPerson(){
        Person result = testObject.findById(1);
        assertNotNull(result);
        assertEquals(1, result.getPersonId());
        assertEquals("Erik", result.getFirstName());
        assertEquals("Svensson", result.getLastName());
    }
}

package se.lexicon.cheng.model;

import static org.junit.Assert.*;


class TodoTest {
    public void given_id_description_then_adding_assignee_successfully_creates_object(){
        Todo testObject = new Todo(1, "Clean the sewers");
        Person assignee = new Person(1, "Test", "Testsson");
        testObject.setAssignee((assignee));

        assertEquals(1, testObject.getTodoId());
        assertEquals("Clean the sewers", testObject.getDescription());
        assertNotNull(testObject.getAssignee());
        assertFalse(testObject.isDone());
    }
}
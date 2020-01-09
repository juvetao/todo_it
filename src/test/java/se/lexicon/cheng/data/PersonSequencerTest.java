package se.lexicon.cheng.data;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonSequencerTest {
    @Before
    public void setUp() throws Exception{
        TodoSequencer.reset();
    }

    @Test
    public void nextId_is_1(){
        assertEquals(1, TodoSequencer.nextTodoId());
    }

}
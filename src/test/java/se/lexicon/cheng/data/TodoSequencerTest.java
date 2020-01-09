package se.lexicon.cheng.data;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TodoSequencerTest {
    @Before
    public void setUp() throws Exception{
        TodoSequencer.reset();
    }

    @Test
    public void nextTodoId_is_1(){
        assertEquals(1, TodoSequencer.nextTodoId());
    }

}
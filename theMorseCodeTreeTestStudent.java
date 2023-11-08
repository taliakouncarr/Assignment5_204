import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class theMorseCodeTreeTestStudent {

    private MorseCodeTree morseCodeTree;

    @Before
    public void setUp() {
        morseCodeTree = new MorseCodeTree();
    }

    @Test
    public void testFetch() {
        assertEquals("e", morseCodeTree.fetch("."));
        assertEquals("t", morseCodeTree.fetch("-"));
        assertEquals("i", morseCodeTree.fetch(".."));
    }




}

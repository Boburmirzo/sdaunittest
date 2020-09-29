package ee.sdatest.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SleepInTest {

    // sleepIn(false, false) → true	true	OK
    // sleepIn(true, false) → false	false	OK
    // sleepIn(false, true) → true	true	OK
    // sleepIn(true, true) → true	true	OK

    SleepIn sleepIn;

    @BeforeEach
    public void setUp(){
        sleepIn = new SleepIn();
    }

    @Test
    public void sleepInFalseFalse(){
        boolean result = sleepIn.sleepIn(false,false);

        Assertions.assertTrue(result);
    }

    @Test
    public void sleepInTrueFalse(){
        boolean result = sleepIn.sleepIn(true,false);

        Assertions.assertFalse(result);
    }

    @Test
    public void sleepInFalseTrue(){

    }

    @Test
    public void sleepInTrueTrue(){

    }
}

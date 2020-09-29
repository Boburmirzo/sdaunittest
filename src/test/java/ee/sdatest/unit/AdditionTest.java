package ee.sdatest.unit;

// Junit 5
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AdditionTest {

    //Annotation in java
    // Starts with at symbol @

    Addition addition;

    @BeforeEach
    public void setUp(){
        System.out.println("This method is set up");
        addition = new Addition();
    }

    public int testCustom(){
        return 0;
    }

    // Unit test
    @Test
    @DisplayName("This is test for testing addition")
    void sumTest1(){
        // Initialize what resource we need
//        Addition addition = new Addition();
        System.out.println("This method is called after set up method");
        // Call a method what you want to test
        int result = addition.sum(3,2);

        // Put assertions to check if result is correct
        Assertions.assertEquals(5, result);
    }

    @Test
    void sumTest2(){
        // Initialize what resource we need
//        Addition addition = new Addition();

        // Call a method what you want to test
        int result = addition.sum(3,6);

        // Put assertions to check if result is correct
        Assertions.assertNotEquals(5, result);
    }
}

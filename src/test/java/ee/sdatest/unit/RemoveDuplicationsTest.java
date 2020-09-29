package ee.sdatest.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicationsTest {

    @Test
    public void removeDuplicates(){
        RemoveDuplications removeDuplications = new RemoveDuplications();

        String[] fruitsInput = {"apple", "apple"};
        String[] fruitsOutput = {"apple"};

        String[] actual = removeDuplications.removeDuplicates(fruitsInput);

        Assertions.assertArrayEquals(fruitsOutput, actual);
    }
}

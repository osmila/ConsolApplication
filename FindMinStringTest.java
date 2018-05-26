import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMinStringTest {

    @Test
    public void sortLinesByLengthMinToMaxTest (){
        String[] initialValues = new String[] {"123", "12", "g"};
        String[] sortedValues = new String[] {"g", "12", "123"};
        FindMinString testSorting = new FindMinString(initialValues);

        assertArrayEquals(sortedValues, testSorting.sortLinesByLengthMinToMax());
    }

}
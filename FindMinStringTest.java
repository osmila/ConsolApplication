import Lab1Code.FindMinString;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMinStringTest {

    @Test
    public void sortLinesByLengthMinToMaxTest (){
        String[] initialValues = new String[] {"123", "12", "g"};
        String minLengthLine = new String("g");
        FindMinString testSorting = new FindMinString(initialValues);

        assertEquals(minLengthLine, testSorting.findAndPrintMinStringAndLength());
    }
}

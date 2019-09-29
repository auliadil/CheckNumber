package id.ac.ui.cs.mobileprogramming;

import org.junit.Test;

import static id.ac.ui.cs.mobileprogramming.MainActivity.Number;
import static id.ac.ui.cs.mobileprogramming.MainActivity.isNumeric;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void input_isSquare() {
        Number number = new Number(4);
        assertTrue(number.isSquare());
    }

    @Test
    public void input_isNotSquare() {
        Number number = new Number(3);
        assertFalse(number.isSquare());
    }

    @Test
    public void input_isPrime() {
        Number number = new Number(2);
        assertTrue(number.isPrime());
    }

    @Test
    public void input_isNotPrime() {
        Number number = new Number(4);
        assertFalse(number.isPrime());
    }

    @Test
    public void input_isNumeric() {
        assertTrue(isNumeric("22"));
    }

    @Test
    public void input_isNotNumeric() {
        assertFalse(isNumeric("Bolehlah"));
    }

    @Test
    public void onCreate_isActive() {
        assertFalse(isNumeric("Bolehlah"));
    }
}
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class KataTests {
    @Test
    public void basicTests() {
        assertEquals(21, Kata.nextBiggerNumber(12));
        assertEquals(531, Kata.nextBiggerNumber(513));
        assertEquals(2071, Kata.nextBiggerNumber(2017));
        assertEquals(441, Kata.nextBiggerNumber(414));
        assertEquals(414, Kata.nextBiggerNumber(144));
        assertEquals(19009, Kata.nextBiggerNumber(10990));
        assertEquals(1234567908, Kata.nextBiggerNumber(1234567890));
        assertEquals(1971799619, Kata.nextBiggerNumber(1971799196));
        assertEquals(-1, Kata.nextBiggerNumber(999));
        assertEquals(-1, Kata.nextBiggerNumber(531 ));
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberFormatterTest {

    @Test
    void numberFormatTranslatorMethod1() {
        assertEquals(15, NumberFormatter.parseInt("+10") +5);
    }

    @Test
    void numberFormatTranslatorMethod2() {
        assertEquals(-7, NumberFormatter.parseInt("-10") +3);
    }

    @Test
    void numberFormatTranslatorMethod3() {
        assertEquals(24690, NumberFormatter.parseInt("12345") * 2);
    }

    @Test
    void numberFormatTranslatorMethod4() {
        assertEquals(12346, NumberFormatter.parseInt("12345") +1);
    }

    @Test
    void numberFormatTranslatorMethod5() {
        assertEquals(-12344, NumberFormatter.parseInt("-12345") +1);
    }
}

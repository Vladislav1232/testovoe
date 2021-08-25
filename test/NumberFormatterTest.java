import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class NumberFormatterTest {

    @Test
    void numberFormatTranslatorMethod1() throws ParseException {
        assertEquals(15, NumberFormatter.parseInt("+10") +5);
    }

    @Test
    void numberFormatTranslatorMethod2() throws ParseException {
        assertEquals(-7, NumberFormatter.parseInt("-10") +3);
    }

    @Test
    void numberFormatTranslatorMethod3() throws ParseException {
        assertEquals(24690, NumberFormatter.parseInt("12345") * 2);
    }

    @Test
    void numberFormatTranslatorMethod4() throws ParseException {
        assertEquals(12346, NumberFormatter.parseInt("12345") +1);
    }

    @Test
    void numberFormatTranslatorMethod5() throws ParseException {
        assertEquals(-12344, NumberFormatter.parseInt("-12345") +1);
    }
}
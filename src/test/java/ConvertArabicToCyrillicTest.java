import org.junit.Assert;
import org.junit.Test;

public class ConvertArabicToCyrillicTest {
    @Test
    public void convert_1_To_A() {
        ConvertArabicNumber convert = new ConvertArabicNumber();
        String cyrillicNumber = new ConvertArabicNumber().toCyrillic(1);
        Assert.assertEquals("А", cyrillicNumber);
    }
}

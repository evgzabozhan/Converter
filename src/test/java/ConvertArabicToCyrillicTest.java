import org.junit.Assert;
import org.junit.Test;

public class ConvertArabicToCyrillicTest {
    @Test
    public void convert_1_To_A() {
        ConvertArabicNumber convert = new ConvertArabicNumber();
        char cyrillicNumber = convert.toCyrillic(0);
        Assert.assertEquals('а', cyrillicNumber);
    }

    @Test
    public void convert_2_To_B() {
        ConvertArabicNumber convert = new ConvertArabicNumber();
        char cyrillicNumber = convert.toCyrillic(1);
        Assert.assertEquals('б',cyrillicNumber);
    }

    @Test
    public void convert_2_To_V() {
        ConvertArabicNumber convert = new ConvertArabicNumber();
        char cyrillicNumber = convert.toCyrillic(2);
        Assert.assertEquals('в',cyrillicNumber);
    }

    @Test
    public void convert_2_To_G() {
        ConvertArabicNumber convert = new ConvertArabicNumber();
        char cyrillicNumber = convert.toCyrillic(3);
        Assert.assertEquals('г',cyrillicNumber);
    }
}

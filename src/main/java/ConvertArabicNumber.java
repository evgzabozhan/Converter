import java.util.ArrayList;
import java.util.List;

public class ConvertArabicNumber {
    public char toCyrillic(int arabicNumber) {

        char[] russianAlphabet = "абвгдежзийклмнопрстуфхцчшщъыьэюя".toCharArray();

        List<PairOfDigits> digits = new ArrayList<>();

        for (int i = 0; i < russianAlphabet.length; i++) {
            digits.add(new PairOfDigits(i,russianAlphabet[i]));
        }

        return digits.get(arabicNumber).getCyrillic();
    }
}

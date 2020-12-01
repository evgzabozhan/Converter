import java.util.Objects;

public class PairOfDigits {
    private int arabic;
    private char cyrillic;

    public PairOfDigits(int arabic, char cyrillic) {
        this.arabic = arabic;
        this.cyrillic = cyrillic;
    }

    public int getArabic() {
        return arabic;
    }

    public void setArabic(int arabic) {
        this.arabic = arabic;
    }

    public char getCyrillic() {
        return cyrillic;
    }

    public void setCyrillic(char cyrillic) {
        this.cyrillic = cyrillic;
    }
}

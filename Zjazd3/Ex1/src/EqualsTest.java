import java.util.Objects;

public class EqualsTest {
    String name;
    Integer number;
    char letter;

    EqualsTest(String name, Integer number, char letter){
        this.name = name;
        this.number = number;
        this.letter = letter;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EqualsTest)) return false;
        EqualsTest that = (EqualsTest) o;
        return letter == that.letter &&
                Objects.equals(name, that.name) &&
                Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, number, letter);
    }
}

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametersTest {

    Feline feline = new Feline();
    private final String sex;
    private final boolean expected;

    public LionParametersTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getGender() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void createGenderTest() throws Exception {
        Lion lion = new Lion(sex,feline);
        assertEquals(expected, lion.doesHaveMane());
    }

}
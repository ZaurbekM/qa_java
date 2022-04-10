import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.junit.runners.Parameterized;
import java.util.List;


 @RunWith(Parameterized.class)
   public class LionTest {

    private final int countKittens;

    public LionTest(int countKittens) throws Exception {
        this.countKittens = countKittens;
    }

 @Parameterized.Parameters
    public static Object[] getCountKittens() {
        return new Object[][] {
                {4},
                {5}, // передали тестовые данные
        };
    }

 @Test
    public void testGetKittensWithParameters() throws Exception{
        Lion lion = new Lion("Самец");
        int actual = lion.getKittens(countKittens);
        Assert.assertEquals(countKittens,actual);
    }

 @Test
    public void testGetFoodMethod()throws Exception{
        Lion lion = new Lion("Самец");
        List<String>expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String>actualFood = lion.getFood("Хищник");
        Assert.assertEquals("Еда не соответствует виду животного",expectedFood,actualFood);
    }



 @Test(expected = Exception.class)
    public void testException()throws Exception{
     Lion lion = new Lion(" ");
     lion.doesHaveMane();

    }

}

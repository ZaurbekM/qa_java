import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.Assert;
import java.util.List;


    public class LionTest {

    Feline feline = new Feline();

 @Test
    public void testGetFoodMethod()throws Exception{
        Lion lion = new Lion("Самец",feline);
        List<String>expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String>actualFood = lion.getFood();
        Assert.assertEquals("Еда не соответствует виду животного",expectedFood,actualFood);
    }

 @Test(expected = Exception.class)
    public void testException()throws Exception {
     Lion lion = new Lion(" ", feline);
     lion.doesHaveMane();
    }

 @Test
     public void lionGenderTest()throws Exception {
         Lion lion = new Lion("Самец", feline);
         boolean expected = true;
         boolean actual = lion.doesHaveMane();
         Assert.assertEquals(expected, actual);
     }



}

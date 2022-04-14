import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;


  public class CatTest {

    Feline feline = new Feline();
    Cat cat = new Cat(feline);

    @Test
      public void testGetFoodMethod()throws Exception{
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String>actualFood = cat.getFood();
        Assert.assertEquals("Еда не соответствует виду животного",expectedFood,actualFood);
    }
    @Test
      public void testCatSound(){
        String catSound = "Мяу";
        Assert.assertEquals(catSound,cat.getSound());
    }

}


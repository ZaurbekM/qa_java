import com.example.Animal;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


  @RunWith(MockitoJUnitRunner.class)
    public class FelineTest {

       Feline feline = new Feline();

  @Mock
  private Animal animal;

  @Test
    public void testGetFoodMethod()throws Exception{
      List<String>expectedFood = List.of("Животные", "Птицы", "Рыба");
      List<String>actualFood = feline.getFood("Хищник");
      Assert.assertEquals("Еда не соответствует виду животного",expectedFood,actualFood);
  }

  @Test
    public void testFamily()throws Exception{
      Mockito.when(animal.getFamily()).thenReturn("заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи");
      String expected = "заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
      String actual = feline.getFamily();
      Assert.assertTrue("Семейство животного не входит в список семейств животных",expected.contains(actual.toLowerCase()));
    }



  }

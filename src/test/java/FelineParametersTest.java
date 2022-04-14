import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

 @RunWith(Parameterized.class)
   public class FelineParametersTest {

     private final int expected;

     public FelineParametersTest(int expected) {
         this.expected = expected;
     }

     @Parameterized.Parameters
     public static Object[][] getCountKittens() {
         return new Object[][]{
                 {1},
                 {5},

         };
     }
     @Test
     public void testCountKittens(){
     Feline feline = new Feline();
     int actual = feline.getKittens(expected);
        Assert.assertEquals(expected, actual);
     }

 }

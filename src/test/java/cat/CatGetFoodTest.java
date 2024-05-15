package cat;
import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.ArrayList;
import java.util.List;
@RunWith(MockitoJUnitRunner.class)
public class CatGetFoodTest {
    @Mock
    Feline feline;
    @Test
public void CatGetFood() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Животные");
        expectedResult.add("Птицы");
        expectedResult.add("Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedResult);
        Assert.assertEquals("Ожидаемый результат не соответствует фактическому: ",expectedResult,cat.getFood());
    }
}

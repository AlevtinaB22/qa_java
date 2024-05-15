package lion;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.ArrayList;
import java.util.List;
@RunWith(MockitoJUnitRunner.class)
public class LionGetFoodTest {
    @Spy
    Feline feline;
    @Test
    public void LionGetFood() throws Exception {
        Lion lion = new Lion("Самец",feline);
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Животные");
        expectedResult.add("Птицы");
        expectedResult.add("Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedResult);
        List<String> actualResult = lion.getFood();
        Assert.assertEquals("Ожидаемый результат не соответствует фактическому: ",expectedResult,actualResult);
    }
}

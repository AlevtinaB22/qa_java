package feline;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.ArrayList;
import java.util.List;
@RunWith(MockitoJUnitRunner.class)
public class FelineEatMeatTest {
    @Spy
    Feline feline = new Feline();
    @Test
    public void FelineEatMeat() throws Exception {
        List<String> expectedResult = new ArrayList<>(3);
        expectedResult.add("Животные");
        expectedResult.add("Птицы");
        expectedResult.add("Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedResult);
        List<String> actualResult = feline.eatMeat();
        Assert.assertEquals("Ожидаемый результат не соответствует фактическому: ",expectedResult,actualResult);
    }
}

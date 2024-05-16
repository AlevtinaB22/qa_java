package lion;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
public class LionGetFoodTest {
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void lionGetFood() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion("Самец",feline);
        List<String> expectedResult = List.of("Животные","Птицы","Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedResult);
        List<String> actualResult = lion.getFood();
        Assert.assertEquals("Ожидаемый результат не соответствует фактическому: ",expectedResult,actualResult);
    }
}

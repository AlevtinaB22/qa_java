package alexTest;
import com.example.Alex;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.util.ArrayList;
import java.util.List;
public class AlexGetFoodTest {
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void getFoodTest() throws Exception {
        Feline faline = Mockito.mock(Feline.class);
        Alex alex = new Alex(faline);
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Животные");
        expectedResult.add("Птицы");
        expectedResult.add("Рыба");
        Mockito.when(faline.getFood("Хищник")).thenReturn(expectedResult);
        Assert.assertEquals("Ожидаемый результат не соответствует фактическому: ",expectedResult,alex.getFood());
    }
}

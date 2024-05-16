package cat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

public class CatTests {
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void catGetFood() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Cat cat = new Cat(feline);
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedResult);
        Assert.assertEquals("Ожидаемый результат не соответствует фактическому: ", expectedResult, cat.getFood());
    }

    @Test
    public void getSoundTest() {
        Feline feline = Mockito.mock(Feline.class);
        Cat cat = new Cat(feline);
        Assert.assertEquals("Мяу", cat.getSound());
    }
}

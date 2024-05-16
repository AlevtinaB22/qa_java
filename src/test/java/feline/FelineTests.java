package feline;

import com.example.Feline;
import net.datafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTests {
    @Spy
    Feline feline = new Feline();

    @Test
    public void felineEatMeat() throws Exception {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedResult);
        List<String> actualResult = feline.eatMeat();
        Assert.assertEquals("Ожидаемый результат не соответствует фактическому: ", expectedResult, actualResult);
    }

    @Test
    public void felineGetKittens() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void felineGetKittensWithParameters() {
        Faker faker = new Faker();
        int randomkittensCount = faker.number().numberBetween(1, 10);
        Assert.assertEquals(randomkittensCount, feline.getKittens(randomkittensCount));
    }

    @Test
    public void felineGetFamily() {
        Feline felineNew = new Feline();
        Assert.assertEquals("Кошачьи", felineNew.getFamily());
    }
}

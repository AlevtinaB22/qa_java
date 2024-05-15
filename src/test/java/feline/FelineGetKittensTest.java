package feline;
import net.datafaker.Faker;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)
public class FelineGetKittensTest {
    @Spy
    Feline feline = new Feline();
    @Test
    public void felineGetKittens(){
        feline.getKittens();
        Mockito.verify(feline,Mockito.times(1)).getKittens(1);
    }
    @Test
    public void felineGetKittensWithParameters(){
        Faker faker = new Faker();
        int randomkittensCount = faker.number().numberBetween(1,10);
        Assert.assertEquals(randomkittensCount,feline.getKittens(randomkittensCount));
    }
}

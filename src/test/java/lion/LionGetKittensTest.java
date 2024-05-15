package lion;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)
public class LionGetKittensTest {
@Mock
Feline feline;
@Test
    public void LionGetKittens() throws Exception {
    Lion lion = new Lion("Самец",feline);
    Mockito.when(feline.getKittens()).thenReturn(2);
    Assert.assertEquals("Ожидаемый результат не соответствует фактическому:",2,lion.getKittens());
}
}

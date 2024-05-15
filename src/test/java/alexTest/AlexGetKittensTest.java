package alexTest;
import com.example.Alex;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
public class AlexGetKittensTest {
    Feline faline;
    @Test
    public void getKittensTest() throws Exception {
        Alex alex = new Alex(faline);
        Assert.assertEquals(0,alex.getKittens());
    }
}
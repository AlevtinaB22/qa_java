package alexTest;
import com.example.Alex;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
public class AlexDoesHaveManeTest {
    Feline faline;
    @Test
    public void doesHaveManeTest() throws Exception {
        Alex alex = new Alex(faline);
        Assert.assertTrue(alex.doesHaveMane());
    }
}
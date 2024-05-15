package alexTest;
import com.example.Alex;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
public class GetPlaceOfLivingTest {
    Feline faline;
    @Test
    public void AlexGetPlaceOfLivingTest() throws Exception {
        Alex alex = new Alex(faline);
        Assert.assertEquals("New York zoo",alex.getPlaceOfLiving());
    }
}
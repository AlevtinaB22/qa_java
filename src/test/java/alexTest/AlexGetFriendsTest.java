package alexTest;
import com.example.Alex;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
public class AlexGetFriendsTest {
    Feline faline;
    @Test
    public void getFriendsTest() throws Exception {
        Alex alex = new Alex(faline);
        ArrayList<String> expectedResults = new ArrayList<>(3);
        expectedResults.add("zebra Marty");
        expectedResults.add("hippopotamus Glory");
        expectedResults.add("giraffe Melman");
        Assert.assertEquals(expectedResults,alex.getFriends());
    }
}

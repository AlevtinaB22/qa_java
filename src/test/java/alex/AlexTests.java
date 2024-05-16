package alextest;
import com.example.Alex;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.util.List;
public class AlexGetFriendsTest {
    Feline faline;
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void getFoodTest() throws Exception {
        Feline faline = Mockito.mock(Feline.class);
        Alex alex = new Alex(faline);
        List<String> expectedResult = List.of("Животные","Птицы","Рыба");
        Mockito.when(faline.getFood("Хищник")).thenReturn(expectedResult);
        Assert.assertEquals("Ожидаемый результат не соответствует фактическому: ",expectedResult,alex.getFood());
    }
    @Test
    public void getFriendsTest() throws Exception {
        Alex alex = new Alex(faline);
        List<String> expectedResults = List.of("zebra Marty","hippopotamus Glory","giraffe Melman");
        Assert.assertEquals(expectedResults,alex.getFriends());
    }
    @Test
    public void getKittensTest() throws Exception {
        Alex alex = new Alex(faline);
        Assert.assertEquals(0,alex.getKittens());
    }
    @Test
    public void alexGetPlaceOfLivingTest() throws Exception {
        Alex alex = new Alex(faline);
        Assert.assertEquals("New York zoo",alex.getPlaceOfLiving());
    }
    @Test
    public void doesHaveManeTest() throws Exception {
        Alex alex = new Alex(faline);
        Assert.assertTrue(alex.doesHaveMane());
    }
}

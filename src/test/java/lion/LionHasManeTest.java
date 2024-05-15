package lion;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
@RunWith(Parameterized.class)
public class LionHasManeTest {
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Parameterized.Parameter(0)
    public String sex;
    @Parameterized.Parameter(1)
    public boolean hasMane;
    @Parameterized.Parameters(name = "{index}.sex={0},hasMane={1}")
    public static Object[][] getData(){
        return new Object[][]{
                {"Самец",true},
                {"Самка",false},
                {"Некто",false}
        };
    }
    @Test
    public void LionHasMane() {
        Feline animal = Mockito.mock(Feline.class);
        try {
            Lion lion = new Lion(sex,animal);
            Boolean actualResult = lion.doesHaveMane();
            Assert.assertEquals("Ожидаемый результат не соответствует фактическому: ",hasMane,actualResult);
        }
        catch (Exception exception){
            String message = exception.getMessage();
            Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка",message);
        }
    }
}

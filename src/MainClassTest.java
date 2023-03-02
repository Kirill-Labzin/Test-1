import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    MainClass Main = new MainClass();
    @Test
    public void firstTest(){
        int a = Main.getLocalNumber();

        Assert.assertTrue("variable 'a' not equal 14",a == 14);
    }
}

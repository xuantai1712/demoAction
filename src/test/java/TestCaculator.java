import org.example.Caculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaculator {

    @Test
    public void testCaculator() {
        Caculator caculator = new Caculator();
        Assert.assertEquals(caculator.sum(3,4), 7);
    }

    @Test
    public void testCaculator2() {
        Caculator caculator = new Caculator();
        Assert.assertEquals(caculator.sub(1,1), 2);
    }
}

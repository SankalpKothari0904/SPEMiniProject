import org.junit.Test;
import com.example.SPEMiniProject;
import org.junit.Assert;

public class SPEMiniProjectTest {
    // testing factorial for 10
    @Test
    public void testfactorial_1(){
        int observed = SPEMiniProject.Factorial(10);
        int expected = 3628800;
        Assert.assertEquals(observed, expected);
    }
    
    // testing factorial for negative number
    @Test
    public void testfactorial_2(){
        int observed = SPEMiniProject.Factorial(-1);
        int expected = -1;
        Assert.assertEquals(observed, expected);
    }

    // testing factorial for 0
    @Test
    public void testfactorial_3(){
        int observed = SPEMiniProject.Factorial(0);
        int expected = 1;
        Assert.assertEquals(observed, expected);
    }

    // testing square root for 3
    @Test
    public void testsqrt_1(){
        double observed = SPEMiniProject.Square_Root(3);
        double expected = 1.7320508075688772;
        Assert.assertEquals(observed, expected,1e-10);
    }

    // testing square root for 0
    @Test
    public void testsqrt_2(){
        double observed = SPEMiniProject.Square_Root(0);
        double expected = 0;
        Assert.assertEquals(observed, expected,1e-10);
    }

    // testing square root for negative number
    @Test
    public void testsqrt_3(){
        double observed = SPEMiniProject.Square_Root(-10);
        double expected = Double.NaN;
        Assert.assertEquals(observed, expected,1e-10);
    }

    // testing natural logarithm for 1
    @Test
    public void testlog_1(){
        double observed = SPEMiniProject.Logarithm(1);
        double expected = 0;
        Assert.assertEquals(observed, expected,1e-10);
    }

    // testing natural logarithm for 0
    @Test
    public void testlog_2(){
        double observed = SPEMiniProject.Logarithm(0);
        double expected = Double.NEGATIVE_INFINITY;
        Assert.assertEquals(observed, expected,1e-10);
    }

    // testing natural logarithm for negative number
    @Test
    public void testlog_3(){
        double observed = SPEMiniProject.Logarithm(-10);
        double expected = Double.NaN;
        Assert.assertEquals(observed, expected,1e-10);
    }

    // testing power for 2^3
    @Test
    public void testpower_1(){
        double observed = SPEMiniProject.Power(2,3);
        double expected = 8;
        Assert.assertEquals(observed, expected,1e-10);
    }

    // testing power for 0^0
    @Test
    public void testpower_2(){
        double observed = SPEMiniProject.Power(0,0);
        double expected = 1;
        Assert.assertEquals(observed, expected,1e-10);
    }

    // testing power for 0^3
    @Test
    public void testpower_3(){
        double observed = SPEMiniProject.Power(0,3);
        double expected = 0;
        Assert.assertEquals(observed, expected,1e-10);
    }
}

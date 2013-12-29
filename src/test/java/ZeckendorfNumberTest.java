import org.junit.Assert;
import org.junit.Test;

public class ZeckendorfNumberTest {

    private void zeckendorfNumberFor(int n, int zeck) {
        Assert.assertEquals(zeck, ZeckendorfNumber.create(n));
    }

    @Test
    public void testZeckendorfNumberConversions() {
        zeckendorfNumberFor(0, 0);
        zeckendorfNumberFor(1, 1); // fibonacci #1
        zeckendorfNumberFor(2, 10); // fibonacci #2
        zeckendorfNumberFor(3, 100); // fibonacci #3
        zeckendorfNumberFor(4, 101);
        zeckendorfNumberFor(5, 1000); // fibonacci #4
        zeckendorfNumberFor(6, 1001);
        zeckendorfNumberFor(7, 1010);
        zeckendorfNumberFor(8, 10000); // fibonacci #5
        zeckendorfNumberFor(9, 10001);
        zeckendorfNumberFor(10, 10010);
        zeckendorfNumberFor(11, 10100);
        zeckendorfNumberFor(12, 10101);
        zeckendorfNumberFor(13, 100000); // fibonacci #6
        zeckendorfNumberFor(14, 100001);
        zeckendorfNumberFor(15, 100010);
        zeckendorfNumberFor(16, 100100);
        zeckendorfNumberFor(17, 100101);
        zeckendorfNumberFor(18, 101000);
        zeckendorfNumberFor(19, 101001);
        zeckendorfNumberFor(20, 101010);
    }

}

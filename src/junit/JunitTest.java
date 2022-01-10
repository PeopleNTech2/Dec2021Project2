package junit;

import org.junit.Assert;
import org.junit.Test;

public class JunitTest {

    @Test
    public void test () {

        int a = 5;
        int b = 10;

        int actualTotal;

        int expectedTotal = 15;

        actualTotal = a + b;

        Assert.assertEquals(expectedTotal, actualTotal);

        System.out.println("test 1 passed");
    }

    @Test
    public void test1 () {

        int a = 5;
        int b = 10;

        int actualTotal;

        int expectedTotal = 15;

        actualTotal = a + b;

        Assert.assertEquals(expectedTotal, actualTotal);

        System.out.println("test 2 passed");
    }

}

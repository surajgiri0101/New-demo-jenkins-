package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {

    @Test
    public void demoTest() {
        System.out.println("Running demo test on Jenkins...");
        Assert.assertTrue(true, "Sample assertion passed!");
    }
}

package utilities.jshop2;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

class MyJSHOP2Test {
    @Test
    public void testSingleton() {
        MyJSHOP2 first = MyJSHOP2.getInstance();
        Assert.assertNotNull(first);
        MyJSHOP2 second = MyJSHOP2.getInstance();
        Assert.assertEquals(first, second);
    }
}
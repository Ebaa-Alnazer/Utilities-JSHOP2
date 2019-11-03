package utilities.jshop2;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

class FactoryTest {
    @Test
    public void testFactory() {
        Factory.getInstance().setIsJSHOP2(false);
        Assert.assertEquals(MyJSHOP2.getInstance(), Factory.getInstance().getAlgorithm());
        Factory.getInstance().setIsJSHOP2(true);
        Assert.assertEquals(JSHOP2.getInstance(), Factory.getInstance().getAlgorithm());
    }

    @Test
    public void testSingleton() {
        Factory first = Factory.getInstance();
        Assert.assertNotNull(first);
        Factory second = Factory.getInstance();
        Assert.assertEquals(first, second);
    }
}
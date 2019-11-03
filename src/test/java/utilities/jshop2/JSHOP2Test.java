package utilities.jshop2;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JSHOP2Test {
    @Test
    public void testSingleton() {
        JSHOP2 first = JSHOP2.getInstance();
        Assert.assertNotNull(first);
        JSHOP2 second = JSHOP2.getInstance();
        Assert.assertEquals(first, second);
    }
}
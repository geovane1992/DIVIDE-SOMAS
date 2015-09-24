
package dividesomas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class DivideSomasTest {
    
    public DivideSomasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    @Test
    public void testDivideSomas() {
        System.out.println("divideSomas");
        double x = 6;
        double y = 3;
        double expResult = 0.0;
        double result = DivideSomas.divideSomas(x, y);
        assertEquals(expResult, result, 0.0);

    }

    
}

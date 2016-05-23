package kolokwium.a.pl.edu.us.awpto;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FizzBuzzTest
{
	private int i;
	
	private FizzBuzz  fizz;
	
	public FizzBuzzTest(int i) {
        this.i = i;
        System.out.println("[" + i + "] Constructor");
    }
	
	 @BeforeClass
	    public static void setUpClass() {
	        
	    }
	
	@Parameters
    public static Collection data() {
        System.out.println("@Parameters data()");
        Object[][] data = new Object[][] {{5}, 
                                          {15},{3},{2}};
        return Arrays.asList(data);
    }
	
	
	
	@Test
    public void test1() {
        assertEquals("FizzBuzz", fizz.calculate(i));
       
    }
	
	@Test
    public void test2() {
        assertEquals("Fizz", fizz.calculate(i));
        
    }
	
	@Test
    public void test3() {
        assertEquals("Buzz", fizz.calculate(i));
        
    }
	
	@Test
    public void test4() {
        assertEquals(i, fizz.calculate(i));
       
    }
	
	
	
	
	
}
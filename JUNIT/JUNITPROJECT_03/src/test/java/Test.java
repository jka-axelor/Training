import static org.junit.jupiter.api.Assertions.assertEquals;

import com.Axelor.Demo.Maths;


public class Test {

private	 Maths maths = new Maths();

            @org.junit.jupiter.api.Test
			public void tstadd()
			{
				assertEquals(2,maths.add(1, 1));
			}
            
            @org.junit.jupiter.api.Test
			public void testSub()
			{
				assertEquals(2,maths.subtract(4, 2));
			}
            
            @org.junit.jupiter.api.Test
			public void testby()
			{
				assertEquals(2,maths.by(4, 2));
			}
            
            @org.junit.jupiter.api.Test
			public void testpro()
			{
				assertEquals(4,maths.mltiply(2, 2));
			}
            
            @org.junit.jupiter.api.Test
			public void testsqure()
			{
				assertEquals(4,maths.squre( 2));
			}

}

package Java_Assignment_annotations;

import org.aspectj.lang.annotation.Before;

public class OutputFileTest		
{
	private File output; 
	@Before public void createOutputFile() 
	 { 
   output = new File(...);
	}

@After 
public void deleteOutputFile() 
		{
    output.delete(); 
	} 
 
@Test public void testFile1() 
		{
   
		} 
@Test public void testFile2() 
	 {
   
		}
}
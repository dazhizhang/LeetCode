package assign2.assign2;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testContainsDuplicate() {
	//	fail("Not yet implemented");
		Solution su = new Solution();
    	int[] nums = new int[] {1,2,3,4,12,2};
   	    boolean result = su.containsDuplicate(nums);
		 assertEquals(true, result);
		 
	}

	@Test
	public void testIsAnagram() {
	//	fail("Not yet implemented");
		Solution su = new Solution();
		String s = "rat", t = "car";
		boolean result = su.isAnagram(s, t);
 //   	System.out.println(result);
    	assertEquals(false, result);
	}

}

package assign2.assign2;
import java.util.ArrayList;
import java.util.List;
/**
 * Solution!
 *
 */
public class Solution {
    
	public boolean containsDuplicate(int[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++ )
			{
				if (nums[i] == nums[j]) {
					return true;
				}
			}
		}
        return false;
    }
	
    public boolean isAnagram(String s, String t) {
	
    	List<String> s_array = new ArrayList<String>();
    	List<String> t_array = new ArrayList<String>();
    	
    	for (int i = 0; i < s.length(); i ++) {
    		s_array.add( s.substring(i,i+1) );
    	}
    	for (int i = 0; i < t.length(); i ++) {
    		t_array.add( t.substring(i,i+1) );
    	}
    	
    	for (int i = 0; i < s_array.size(); i ++) {
    		if (t_array.contains(s_array.get(i))) {
    			t_array.remove(s_array.get(i));
    		}
    		else {
    			return false;
    		}
    	}
    	
    	if (t_array.size() == 0) {
    		return true;
    	}
        return false;
    }
    
    public static void main(String[] args) {
    	Solution su = new Solution();
    	int[] nums = new int[] {1,2,3,4,12,23};
   	    boolean result = su.containsDuplicate(nums);
    	System.out.println(result);
    	
    	String s = "rat", t = "car";
    	result = su.isAnagram(s, t);
    	System.out.println(result);
    }
}
package leetCodeProblem;

//Using brute force approach
public class twoSum {
	 public static void main(String[] args){
	        int[] nums = {1,2,3,4};
	        int target = 7;
	        twoSum obj = new twoSum();
	        int[] arr = obj.retunArray(nums,target);
	        System.out.print("the result found at the following indeces :");
	        for (int i = 0; i < arr.length; i++) {
				System.out.print(" "+arr[i]);
			}
	        
	    }
	    
	    public int[] retunArray(int[] nums, int target) {
	        for(int i=0; i<nums.length; i++){
	            for(int j=1; j<nums.length; j++){
	                if(nums[i]+nums[j]==target) {
	                	return new int[] {i,j};
	                }   	
	            }
	        }
			return nums;
	    }
}

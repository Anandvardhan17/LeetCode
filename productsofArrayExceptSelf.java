
public class productsofArrayExceptSelf {
   
public static int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];
        int[] res = new int[nums.length];
         pre[0]= 1;
         suf[nums.length-1]= 1;
         for(int i = 1 ; i < nums.length ; i++) {
        	 pre[i] = pre[i-1] * nums[i-1]; 
         }
         
         for(int i = nums.length-2 ; i >= 0 ; i--) {
        	 suf[i] = suf[i+1] * nums[i+1];
        	 
         }
         
         for(int i = 0 ; i < nums.length ; i++) {
        	 res[i] = pre[i] * suf[i]; 
        	 }
         for(int m= 0 ; m< nums.length ; m++) {
        	 System.out.println(res[m]);
         }
         
         return res;
    }

      public static void main(String[] Args) {
	   int[] nums = {1,2,3,4};
	   productExceptSelf(nums);
   }
}

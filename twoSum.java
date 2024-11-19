import java.util.Arrays;

class twoSum {
    public static int[] sum(int[] nums, int target) {
        int start =0;
        int end =nums.length;
        for(int i=start;i<end;i++){
            for (int j=start+1;j<end;j++){
           if(target== nums[i]+nums[j]){
            return  new int[]{i,j};
           }
        }
        
    }
    return new int[]{0,0};
}
    
    public static void main(String[] Args) {
    	int[] nums = {6,3,4,5,2,1,9};
    	int target = 7;
			int[] result = sum(nums ,target);
			System.out.println(Arrays.toString(result));
    }
}
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class medianInTwosortedArrays {
	public static ArrayList<Integer> findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0;
        ArrayList<Integer> sortedArray =  new ArrayList<Integer>();
       while (sortedArray.toArray().length <= nums1.length + nums2.length) {
    	   if(nums1[i]<nums2[j]) {
    		   sortedArray.add(nums1[i]);
    		   i++;
    	   }
    	   else{
    		   sortedArray.add(nums2[j]);
    		   j++;
    	   }
    	   
       }
       return sortedArray;

    }
    
    public static void main(String[] args) {
    	int[] nums1 = {1,2,3,4};
    	int[] nums2 = {5,6,7,8};
    	System.out.println(findMedianSortedArrays(nums1,nums2));

    }
}
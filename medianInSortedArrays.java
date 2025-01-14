
public class medianInSortedArrays {

	public static double median(int[] nums1 , int[] nums2) {
     if(nums2.length < nums1.length) {
    	 return median(nums2,nums1);
     }
     int x = nums1.length;
     int y = nums2.length;
     int start=0;
     int end =x;
     while(start<=end) {
    	 int partX = (start+((end-start)/2));
    	 int partY = ((x+y+1)/2)- partX;
    
    	 int maxLeftX =(partX ==0) ? Integer.MIN_VALUE : nums1[partX-1];
    	 int minRightX = (partX ==x)? Integer.MAX_VALUE : nums1[partX];
    	 int maxLeftY= (partY ==0)? Integer.MIN_VALUE : nums2[partY-1];
    	 int minRightY =(partY ==y)? Integer.MAX_VALUE:nums2[partY];
    	 
    	 if(maxLeftX <= minRightY && maxLeftY <= minRightX) {
    		 if((x+y)%2 ==0) {
    			 return (double)(Math.max(maxLeftX, maxLeftY)+ Math.min(minRightX, minRightY))/2;
    		 }
    		 else {
    			 return (double)Math.max(maxLeftX, maxLeftY);
    		 }
    	 }
    	 if(maxLeftX > minRightY) {
    		 end = partX-1;
    				 
    	 }
    	 else {
    		 start = partX+1;
    	 }
    	 
     }
		return -1;
		
	}
		
	 public static void main(String[] args) {
	    	int[] nums1 = {2};
	    	int[] nums2 = {};
	    	System.out.println(median(nums1,nums2));

	    }
}

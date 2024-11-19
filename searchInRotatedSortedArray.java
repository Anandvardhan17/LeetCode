
public class searchInRotatedSortedArray {
	
	 public static  int search(int[] nums, int target) {
		 int pivot =findPivot( nums);
		 if (nums[pivot]== target) {
			 return pivot;
		 }
		 if (nums[0]== target) {
			 return 0;
		 }
		 if (nums[nums.length-1]== target) {
			 return nums.length-1;
		 }
		 if (target > nums[0]) {
			 return binarySearch(nums,target,0,pivot-1);
		 }
		 
			 return binarySearch( nums, target,pivot+1,nums.length-1);

	 }
	
  public static int findPivot(int[] nums) {
	  int start =0;
	  int end = nums.length -1 ;
	  if(nums.length==0) {
		  return -1;
	  }
	  if(nums[end]> nums[start]) {
		  return end;
	  }
	  while(start < end) {
		  int mid = start + (end-start)/2;
		  if(mid < end && nums[mid]> nums[mid+1]) {
			  return mid;
		  }
		  if(start < mid && nums[mid]< nums[mid-1]) {
			  return mid-1;
		  }
		  if( nums[mid]> nums[start]) {
			  start = mid+1;
		  }
		  else {
			  
			  end = mid-1;
		  }
	  }
	  return start;
	  
  }
  public static int binarySearch(int[] nums, int target,int start,int end) {

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				end = mid - 1;
			} else if (nums[mid] < target) {
				start = mid + 1;
			}

		}
		return -1;
  }
  
  
  public static void main(String[] args) {
  	int[] nums= {4,5,6,7,0,1,2};
  	System.out.println(search(nums,0));
  }
}

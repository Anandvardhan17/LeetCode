import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class topKElementsInList {
	    public static int[] topKFrequent(int[] nums, int k) {
	        Map<Integer, Integer> frequencyMap = new TreeMap<>();
//	        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
//	                (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
//	        List<Integer>  result  = new ArrayList<>();
	        for(int n : nums){
	            frequencyMap.put(n,frequencyMap.getOrDefault(n, 0)+1);
	        }
//	        maxHeap.addAll(frequencyMap.entrySet());
//	        for(int i=1 ; i<=k ; i++) {
//	        	result.add(maxHeap.poll().getKey());
//	        }
	        List<Integer>[] result = new List [nums.length];
	        System.out.println(nums.length);
	        for(Integer i : frequencyMap.keySet()) {
	        	if(result[frequencyMap.get(i)] == null) {
	        		result[frequencyMap.get(i)] = new ArrayList<>();
	        	}
	        		result[frequencyMap.get(i)].add(i);
	        }
	        int count =0;
	        int[] res = new int[k];
	        for(int j = nums.length-1 ; j >= 0 && count < k ; j--  ) {
	        	if(result[j] != null) {
	        		for(Integer l :result[j] )
	        		res[count++] = l;
	        	}
	        }
//	        return result.stream().mapToInt(i -> (int)i).toArray();
	        return res;
	    }
	    
	    public static void main(String[] Args) {
	    	int[] nums = {1,1,1,2,2,3};
	    	int h = 7;
	    	topKFrequent(nums,h);
	    }
	}


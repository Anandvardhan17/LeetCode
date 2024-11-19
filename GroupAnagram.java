import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GroupAnagram {

	
public static List<List<String>> groupAnagrams(String[] strs) {
	Map<String , List<String>> resultMap = new HashMap<>();
	for(String str : strs) {
		String frequencyString = frequencyWord(str);
		if(null != resultMap.get(frequencyString)){
			resultMap.get(frequencyString).add(str);
		}
		else {
			List<String> stringList = new ArrayList<String>();
			stringList.add(str);
			resultMap.put(frequencyString, stringList);
		}
	}
	System.out.println(new ArrayList(resultMap.values()));
	     return new ArrayList(resultMap.values()) ;
        
    }

 public static String frequencyWord(String str) {
	 List<Character> c = str.chars().mapToObj( m->(char)m).toList();
	 Map<Character,Integer> wordMap = new TreeMap<>();
	 StringBuilder s = new StringBuilder();
	 for(Character letter : c) {
		 wordMap.put(letter, wordMap.getOrDefault(letter, 0)+1);
	 }
	 for(Character k : wordMap.keySet()) {
		 s.append(k);
		 s.append(wordMap.get(k));
	 }
	 return s.toString();
 }
 
 public static void main(String[] args) {
 	String[] str = {"eat","tea","tan","ate","nat","bat"};
 	groupAnagrams(str);
 	
 }
     
}

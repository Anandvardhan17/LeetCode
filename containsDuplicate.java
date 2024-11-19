import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class containsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		List<Integer> list = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());
        Set<Integer> find = new HashSet<Integer>(list);
        if(find.size() != nums.length){
            return true ;
        }
        return false;
    }
}

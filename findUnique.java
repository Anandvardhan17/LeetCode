//code
public class findUnique {
public static void main (String [] args) {
	int unique =0;
	int[] arr = {2,3,3,4,2,6,4,7,7};
	for(int i : arr) {
		unique ^= i;
	}
	System.out.println(unique);
}
}

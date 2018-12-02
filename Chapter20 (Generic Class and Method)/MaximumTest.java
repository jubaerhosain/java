package Ch20;

// Generic method maximum returns the largest of three objects
public class MaximumTest {
	public static void main(String[] args) {
		System.out.printf("Maximum of %d, %d and %d is %d%n", 3, 4, 5, maximum(3, 4, 5));
		System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f%n", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));
		System.out.printf("Maximum of %s, %s and %s is %s%n", "pear", "apple", "orange", maximum("pear", "apple", "orange"));
	}
	
	// determines the largest of three Comparable objects
	public static <T extends Comparable<T>> T maximum(T x, T y, T z){
		T max = x; // assume x is initially the largest
		
		if(y.compareTo(max) > 0) {
			max = y; // y is the largest so far
		}
		
		if(z.compareTo(max) > 0) {
			max = z;
		}
		
		return max;
	}
	
	// benefit of implementing interface Comparable<T> is that Comparable<T> objects can
	// be used with the sorting and searching methods of class Collections
	public static Comparable maximum1(Comparable x, Comparable y, Comparable z){
		Comparable max = x; // assume x is initially the largest
		
		if(y.compareTo(max) > 0) {
			max = y; // y is the largest so far
		}
		
		if(z.compareTo(max) > 0) {
			max = z;
		}
		
		return max;
	}
}

public class MaximumTest1 {

	public static Comparable maximum(Comparable x, Comparable y, Comparable z) {
		Comparable max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}

	public static void main(String args[]) {
		System.out.printf("Maximum of %d , %d and %d is %d\n\n", 3, 4, 5, maximum(3, 4, 5));
		System.out.printf("Maximum of %.1f , %.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7, maximum(6.6, 7.7, 8.8));
		System.out.printf("Maximum of %s , %s and %s is %s\n\n", "pear", "apple", "orange",
				maximum("pear", "apple", "orange"));

	}

}

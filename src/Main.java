import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// get first string
		System.out.print("Enter first string: ");
		String s1 = scan.nextLine();

		// split into halves
		System.out.println("First half: " + s1.substring(0, s1.length() / 2));
		System.out.println("Second half: " + s1.substring(s1.length() / 2));

		// get second string
		System.out.print("Enter second string: ");
		String s2 = scan.nextLine();

		// which is longer or not
		if (s1.length() > s2.length()) {
			System.out.println(s1 + " is longer");
		} else if (s1.length() < s2.length()) {
			System.out.println(s2 + " is longer");
		} else {
			System.out.println("Both strings have the same length");
		}

		// equality or compare
		if (s1.equals(s2)) {
			System.out.println("Both strings have the exact same characters");
		} else if (s1.compareTo(s2) < 0) {
			System.out.println(s1 + " is first alphabetically");
		} else {
			System.out.println(s2 + " is first alphabetically");
		}

		// where s2 in s1 or not
		int idxFound = s1.indexOf(s2);
		if (idxFound != -1) {
			System.out.println(s2 + " is found in " + s1 + " at index " + idxFound);
		} else {
			System.out.println(s2 + " is NOT found in " + s1);
		}
	}
}

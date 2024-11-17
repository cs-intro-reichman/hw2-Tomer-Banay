// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int sum = Integer.parseInt(args[0]);
		String mode = args[1];
		boolean flag = false;

		// loop through number from i to sum
		for (int i = 1; i <= sum; i++) {
			int n = i;
			String output = n + " ";
			int count = 1;
			
			// collatz sequence
			while (n != 1 || !flag) {
				if (!flag) {
				flag = true;
				}

				if (n % 2 == 0) {
					n /= 2;
					output += ( n + " ");
				} else { 
					n = (3 * n) + 1;
					output += ( n + " ");
				}
				count++; // count the number of sequences
			}
		if (mode.equals("v")) {
			System.out.println(output + "(" + count + ")");
		}
	}
		// summary line
		System.out.println ("Every one of the first " + sum +
		" hailstone sequences reached 1.");
	}
}



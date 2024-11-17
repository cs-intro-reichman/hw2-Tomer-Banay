// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int n = Integer.parseInt(args[0]);
		double sumApprox = 0.0;
		double pi = Math.PI;


		for (int i = 0; i < n ; i++) {
			if (i % 2 == 0) {
				sumApprox += 1.0 / (2 * i + 1);
			} else {
				sumApprox -= 1.0 / (2 * i + 1);
			}
		}
		sumApprox *= 4.0;
		System.out.println ("pi according to Java: " + pi);
		System.out.println ("pi, approximated:     " + sumApprox);
	}
}

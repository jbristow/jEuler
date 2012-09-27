package euler;

public class Euler02 extends EulerProblem {

	@Override
	public void solve() {
		long n1 = 1;
		long n2 = 1;
		long sum = 0;
		while (n2 < 4000000) {
			long temp = n1;
			n1 = n2;
			n2 = temp + n1;
			if (n2 % 2 == 0)
				sum += n2;
		}
		print(sum);
	}

	public static void main(String[] args) {
		new Euler02().run();
	}
}


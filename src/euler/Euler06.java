package euler;

public class Euler06 extends EulerProblem {

	@Override
	public void solve() {
		long sum_of_squares = 0;
		long sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum_of_squares += i * i;
			sum += i;
		}
		print((sum * sum) - sum_of_squares);
	}
	
	public static void main(String[] args) {
		new Euler06().run();
	}
}

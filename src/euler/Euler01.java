package euler;

public class Euler01 extends EulerProblem {

	@Override
	public void solve() {
		int sum = 0;
		for (int i = 1; i <= 999; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				sum += i;
		}
		print(sum);
	}

	public static void main(String[] args) {
		new Euler01().run();
	}
}

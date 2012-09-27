package euler;

public class Euler09 extends EulerProblem {

	@Override
	public void solve() {
		int answer = 0;
		for (int a = 1; a < 999; a++) {
			boolean found = false;
			for (int b = a + 1; b <= 999; b++) {
				int c = 1000 - a - b;
				if (a * a + b * b == c * c) {
					found = true;
					answer = a * b * c;
					break;
				}
			}
			if (found) {
				break;
			}
		}
		print(answer);
	}

	public static void main(String[] args) {
		new Euler09().run();
	}
}

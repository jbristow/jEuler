package euler;

public class Euler03 extends EulerProblem {

	@Override
	public void solve() {
		long num = 600851475143L;
		long curr = num;
		long n = 2;
		long maxPrime = 0;
		while (n * n < num) {
			if (curr % n == 0) {
				maxPrime = n;
				while (curr % n == 0) {
					curr /= n;
				}
			}
			n += 1;
		}
		print(maxPrime);
	}
	
	public static void main(String[] args) {
		new Euler03().run();
	}
}

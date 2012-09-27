package euler;

import java.util.ArrayList;
import java.util.List;

public class Euler10 extends EulerProblem {

	private static final int MAX = 2000000;

	@Override
	public void solve() {
		List<Integer> primes = new ArrayList<Integer>();
		int possible = 3;
		while (possible < MAX) {

			if (isPrime(possible, primes)) {
				primes.add(possible);
			}

			possible += 2;

		}

		print(2 + sum(primes));
	}

	private boolean isPrime(int possible, List<Integer> primes) {
		if (primes.isEmpty() && possible == 3) {
			return true;
		}
		for (Integer prime : primes) {
			if (prime * prime <= possible) {
				if (possible % prime == 0) {
					return false;
				}
			} else {
				return true;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		new Euler10().run();
	}
}

package euler;

import java.util.ArrayList;
import java.util.List;

public class Euler08 extends EulerProblem {

	@Override
	public void solve() {
		List<Long> primes = new ArrayList<Long>();
		primes.add(2L);
		int numPrimes = 10001;

		long curr = 3;

		while (primes.size() < numPrimes) {
			boolean primality = true;
			for (Long p : primes) {
				if (curr % p == 0) {
					primality = false;
					break;
				}
			}
			if (primality) {
				primes.add(curr);
			}
			curr += 2;
		}
		print(primes.get(primes.size() - 1));
	}

	public static void main(String[] args) {
		new Euler08().run();
	}
}

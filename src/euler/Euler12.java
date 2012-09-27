package euler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Euler12 extends EulerProblem {

	@Override
	public void solve() {
		int max = 500;

		int counter = 1;
		int divisorcount = numberOfDivisors(triangle(counter));
		while (divisorcount < max) {
			counter += 1;
			divisorcount = numberOfDivisors(triangle(counter));
			//puts(counter, triangle(counter), divisorcount);
		}
		print(triangle(counter));
	}

	long triangle(int n) {
		return (n * (n + 1)) / 2;
	}

	List<Integer> divisorsOf(int n) {
		List<Integer> divisors = new ArrayList<Integer>();
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				divisors.add(i);
			}
		}
		return divisors;
	}

	int numberOfDivisors(long n) {
		if (n == 1) {
			return 1;
		} else if (n == 3) {
			return 2;
		} else {
			Map<Long, Integer> primes = new HashMap<Long, Integer>();
			long possible = 2;
			long remaining = n;
			while (possible <= remaining) {
				while (remaining % possible == 0) {
					if (primes.get(possible) == null) {
						primes.put(possible, 1);
					} else {
						primes.put(possible, primes.get(possible) + 1);
					}
					remaining /= possible;
				}
				possible++;
			}
			int factors = 1;
			for (Integer value : primes.values()) {
				factors *= (1 + value);
			}
			return factors;
		}
	}

	public static void main(String[] args) {
		new Euler12().run();
	}
}

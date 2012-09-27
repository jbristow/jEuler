package euler;

import java.util.ArrayList;
import java.util.List;

public class Euler05 extends EulerProblem {

	@Override
	public void solve() {
		long n = 2;
		List<Long> arr = new ArrayList<Long>();

		while (n <= 20) {
			long currn = n;
			for (int i = 0; i < arr.size(); i++) {
				if (currn > 1 && currn % arr.get(i) == 0) {
					currn /= arr.get(i);
				}
			}
			arr.add(currn);
			n += 1;
		}

		print(product(arr));
	}

	public static void main(String[] args) {
		new Euler05().run();
	}
}

package euler;

import java.util.Arrays;
import java.util.List;

abstract class EulerProblem {

	private static final int RUNS = 50;

	public abstract void solve();

	public void run() {
		double[] times = new double[RUNS];
		for (int i = 0; i < RUNS; i++) {
			long start = System.nanoTime();
			solve();
			long end = System.nanoTime();
			times[i] = (end - start) / 1000000.0;

		}
		Arrays.sort(times);
		print("Mean: " + sum(times) / RUNS);
		if (RUNS % 2 == 0) {
			print("Median: " + (times[RUNS / 2 - 1] + times[RUNS / 2]) / 2.);
		} else {
			print("Median: " + times[RUNS / 2]);
		}

	}

	long product(List<Long> arr) {
		long prod = 1;
		for (Long a : arr) {
			prod *= a;
		}
		return prod;
	}

	double sum(double[] items) {
		double sum = 0;
		for (double item : items) {
			sum += item;
		}
		return sum;
	}

	long sum(List<Integer> items) {
		long sum = 0;
		for (int item : items) {
			sum += item;
		}
		return sum;
	}

	void print(Object o) {
		System.out.println(o);
	}

	void puts(Object... args) {
		System.out.print("puts: ");
		for (Object o : args) {
			System.out.print(o);
			System.out.print("\t");
		}
		System.out.println();

	}
}

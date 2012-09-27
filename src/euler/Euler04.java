package euler;

public class Euler04 extends EulerProblem {

	@Override
	public void solve() {
		int maxprod = 0;
		for (int a = 999; a >= 100; a--) {
			for (int b = 999; b >= 100; b--) {
				String forwards = String.valueOf(a * b);
				String backwards = reverse(String.valueOf(a * b));
				if (forwards.equals(backwards)) {
					maxprod = (maxprod > (a * b)) ? (maxprod) : (a * b);
				}
			}
		}
		print(maxprod);
	}

	private String reverse(String valueOf) {
		StringBuilder out = new StringBuilder();
		out.append(valueOf);
		return out.reverse().toString();
	}

	public static void main(String[] args) {
		new Euler04().run();
	}
}

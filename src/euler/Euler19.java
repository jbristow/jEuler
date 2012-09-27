package euler;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Euler19 extends EulerProblem {

	@Override
	public void solve() {
		Calendar start = new GregorianCalendar();
		start.set(Calendar.YEAR, 1901);
		start.set(Calendar.MONTH, Calendar.JANUARY);
		start.set(Calendar.DAY_OF_MONTH, 1);

		Calendar end = new GregorianCalendar();
		end.set(Calendar.YEAR, 2000);
		end.set(Calendar.MONTH, Calendar.DECEMBER);
		end.set(Calendar.DAY_OF_MONTH, 31);

		int numMondays = 0;
		while (start.before(end)) {
			if (start.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				numMondays++;
			}
			start.add(Calendar.MONTH, 1);
		}
		print(numMondays);
	}

	public static void main(String[] args) {
		new Euler19().run();
	}
}

package euler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Euler13 extends EulerProblem {

	@Override
	public void solve() {

		try {
			File file = new File("euler13.txt");
			BufferedReader r = new BufferedReader(new FileReader(file));
			String l = r.readLine();

			List<String> lines = new ArrayList<String>();

			while (l != null) {
				lines.add(l);
				l = r.readLine();
			}
			List<List<Integer>> splitLines = new ArrayList<List<Integer>>();
			for (String line : lines) {
				List<Integer> splitLine = new ArrayList<Integer>();
				for (String s : line.split("")) {
					if ("".equals(s)) {
						continue;
					}
					splitLine.add(Integer.valueOf(s));
				}
				splitLines.add(splitLine);
			}

			long sum = 0;
			for (List<Integer> splitLine : splitLines) {
				long temp = 0;
				for (int i = 0; i < 10; i++) {
					temp = 10 * temp + splitLine.get(i);
				}
				sum += temp;
			}
			print(String.valueOf(sum).substring(0, 10));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new Euler13().run();
	}
}

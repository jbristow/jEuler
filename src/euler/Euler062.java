package euler;

import java.util.*;

public class Euler062 extends EulerProblem {
    @Override
    public void solve() {
        Map<String, List<Long>> map = new HashMap<String, List<Long>>();
        for (long i = 1000; i < 10000; i++) {
            Long cube = i * i * i;
            char[] charArray = cube.toString().toCharArray();
            Arrays.sort(charArray);
            String sortedCube = String.valueOf(charArray);

            if (!map.containsKey(sortedCube)) {
                List<Long> list = new ArrayList<Long>();
                map.put(sortedCube, list);
            }
            map.get(sortedCube).add(cube);
        }

        List<Long> minList = new ArrayList<Long>();
        for (Map.Entry<String, List<Long>> entry : map.entrySet()) {
            if (entry.getValue().size() == 5) {
                minList.add(entry.getValue().get(0));
            }
        }
        if (!minList.isEmpty()) {
            System.out.println(Collections.min(minList));
        }
    }

    // Mean: 23.73870982
    // Median: 7.1200385
    public static void main(String[] args) {
        new Euler062().run();
    }
}

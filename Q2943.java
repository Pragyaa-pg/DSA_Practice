import java.util.*;

class Q2943 {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        int maxH = maxGap(hBars);
        int maxV = maxGap(vBars);

        int side = Math.min(maxH, maxV);
        return side * side;
    }

    private int maxGap(int[] bars) {
        Arrays.sort(bars);

        int longest = 1;
        int current = 1;

        for (int i = 1; i < bars.length; i++) {
            if (bars[i] == bars[i - 1] + 1) {
                current++;
                longest = Math.max(longest, current);
            } else {
                current = 1;
            }
        }

        return longest + 1;
    }

    // ✅ Entry point
    public static void main(String[] args) {
        Q2943 sol = new Q2943();

        int n = 2, m = 1;
        int[] hBars = {2, 3};
        int[] vBars = {2};

        int result = sol.maximizeSquareHoleArea(n, m, hBars, vBars);
        System.out.println(result); // Expected: 4
    }
}

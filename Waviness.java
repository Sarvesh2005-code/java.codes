package com.sarvesh.javabasics;

public class Waviness {

    public static void main(String[] args) {
        Waviness engine = new Waviness();
        System.out.println(engine.totalWaviness(1, 1000)); 
    }

    public long totalWaviness(long num1, long num2) {
        return getWaves(num2) - getWaves(num1 - 1);
    }

    private long getWaves(long num) {
        String s = String.valueOf(num);
        if (s.length() < 3) return 0;
        return helper(s, 0, true, 10, 10, true, new long[s.length()][11][11][2][2], new boolean[s.length()][11][11][2])[1];
    }

    private long[] helper(String s, int idx, boolean isBound, int two, int one, boolean lz, long[][][][][] dp, boolean[][][][] vis) {
        if (idx == s.length()) return lz ? new long[]{0, 0} : new long[]{1, 0};
        
        int lzIdx = lz ? 1 : 0;
        if (!isBound && vis[idx][two][one][lzIdx]) return dp[idx][two][one][lzIdx];

        int upper = isBound ? s.charAt(idx) - '0' : 9;
        long totalCount = 0, totalWaves = 0;

        for (int i = 0; i <= upper; i++) {
            long wave = 0;
            int nTwo, nOne;

            if (lz) {
                nTwo = 10;
                nOne = (i == 0) ? 10 : i;
            } else {
                nTwo = one;
                nOne = i;
                if (two != 10 && one != 10 && ((one > two && one > i) || (one < two && one < i))) {
                    wave = 1;
                }
            }

            long[] sub = helper(s, idx + 1, isBound && i == upper, nTwo, nOne, lz && i == 0, dp, vis);
            totalCount += sub[0];
            totalWaves += sub[1] + sub[0] * wave;
        }

        long[] res = {totalCount, totalWaves};
        if (!isBound) {
            vis[idx][two][one][lzIdx] = true;
            dp[idx][two][one][lzIdx] = res;
        }
        return res;
    }
}
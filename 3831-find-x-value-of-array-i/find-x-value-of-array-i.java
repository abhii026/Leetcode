class Solution {
    public long[] resultArray(int[] nums, int k) {

        long[] result = new long[k];
        long[] dp = new long[k];

        for (int num : nums) {

            long[] newDp = new long[k];

            int rem = num % k;
            newDp[rem]++;

            for (int r = 0; r < k; r++) {
                int newRem = (int)((r * (long) rem) % k);
                newDp[newRem] += dp[r];
            }

            for (int r = 0; r < k; r++) {
                result[r] += newDp[r];
            }

            dp = newDp;
        }

        return result;
    }
}
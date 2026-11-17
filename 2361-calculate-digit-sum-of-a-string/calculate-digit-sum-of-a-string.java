
class Solution {
    public String digitSum(String s, int k) {
        int l = s.length();

        if (l <= k) {
            return s;
        }

        StringBuilder n = new StringBuilder();

        for (int i = 0; i < l; i += k) {
            int sum = 0;

            for (int j = i; j < Math.min(i + k, l); j++) {
                sum += s.charAt(j) - '0';
            }

            n.append(sum);
        }

        return digitSum(n.toString(), k);
    }
}

import java.util.*;

class Solution {

    static class Node {
        int l, r, w, idx;

        Node(int l, int r, int w, int idx) {
            this.l = l;
            this.r = r;
            this.w = w;
            this.idx = idx;
        }
    }

    static class Result {
        long score;
        List<Integer> list;

        Result(long score, List<Integer> list) {
            this.score = score;
            this.list = list;
        }
    }

    public int[] maximumWeight(List<List<Integer>> intervals) {

        int n = intervals.size();

        Node[] a = new Node[n];

        for (int i = 0; i < n; i++) {
            a[i] = new Node(
                intervals.get(i).get(0),
                intervals.get(i).get(1),
                intervals.get(i).get(2),
                i
            );
        }

        Arrays.sort(a, (x, y) -> {
            if (x.l != y.l)
                return Integer.compare(x.l, y.l);

            return Integer.compare(x.idx, y.idx);
        });

        int[] start = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = a[i].l;
        }

        int[] next = new int[n];

        for (int i = 0; i < n; i++) {
            next[i] = upperBound(start, a[i].r);
        }

        Result[][] dp = new Result[n + 1][5];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = new Result(0, new ArrayList<>());
        }

        for (int k = 1; k <= 4; k++) {
            dp[n][k] = new Result(0, new ArrayList<>());
        }

        for (int i = n - 1; i >= 0; i--) {

            for (int k = 1; k <= 4; k++) {

                Result skip = dp[i + 1][k];

                Result nextResult = dp[next[i]][k - 1];

                List<Integer> list = new ArrayList<>();

                list.add(a[i].idx);
                list.addAll(nextResult.list);

                Result take = new Result(
                    a[i].w + nextResult.score,
                    list
                );

                dp[i][k] = better(skip, take);
            }
        }

        List<Integer> ans = new ArrayList<>(dp[0][4].list);

        Collections.sort(ans);

        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }

    static Result better(Result a, Result b) {

        if (a.score > b.score)
            return a;

        if (a.score < b.score)
            return b;

        List<Integer> x = new ArrayList<>(a.list);
        List<Integer> y = new ArrayList<>(b.list);

        Collections.sort(x);
        Collections.sort(y);

        for (int i = 0; i < Math.min(x.size(), y.size()); i++) {

            if (!x.get(i).equals(y.get(i))) {
                return x.get(i) < y.get(i) ? a : b;
            }
        }

        return x.size() <= y.size() ? a : b;
    }

    static int upperBound(int[] arr, int target) {

        int left = 0;
        int right = arr.length;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
class Solution {
    static class Node {
        int prod;
        int[] pref;

        Node(int k) {
            pref = new int[k];
        }
    }

    int n, k;
    int[] nums;
    Node[] tree;

    Node merge(Node left, Node right) {
        if (left == null) return right;
        if (right == null) return left;

        Node res = new Node(k);

        // Product of complete segment
        res.prod = (left.prod * right.prod) % k;

        // Prefixes completely inside left
        for (int r = 0; r < k; r++) {
            res.pref[r] += left.pref[r];
        }

        // Prefixes = entire left + prefix of right
        for (int r = 0; r < k; r++) {
            int newRem = (left.prod * r) % k;
            res.pref[newRem] += right.pref[r];
        }

        return res;
    }

    void build(int idx, int l, int r) {
        if (l == r) {
            tree[idx] = new Node(k);

            int rem = nums[l] % k;

            tree[idx].prod = rem;
            tree[idx].pref[rem] = 1;

            return;
        }

        int mid = (l + r) / 2;

        build(idx * 2, l, mid);
        build(idx * 2 + 1, mid + 1, r);

        tree[idx] = merge(tree[idx * 2], tree[idx * 2 + 1]);
    }

    void update(int idx, int l, int r, int pos, int value) {
        if (l == r) {
            int rem = value % k;

            tree[idx] = new Node(k);
            tree[idx].prod = rem;
            tree[idx].pref[rem] = 1;

            return;
        }

        int mid = (l + r) / 2;

        if (pos <= mid) {
            update(idx * 2, l, mid, pos, value);
        } else {
            update(idx * 2 + 1, mid + 1, r, pos, value);
        }

        tree[idx] = merge(tree[idx * 2], tree[idx * 2 + 1]);
    }

    Node query(int idx, int l, int r, int ql, int qr) {
        if (qr < l || r < ql) {
            return null;
        }

        if (ql <= l && r <= qr) {
            return tree[idx];
        }

        int mid = (l + r) / 2;

        Node left = query(idx * 2, l, mid, ql, qr);
        Node right = query(idx * 2 + 1, mid + 1, r, ql, qr);

        return merge(left, right);
    }

    public int[] resultArray(int[] nums, int k, int[][] queries) {
        this.nums = nums;
        this.n = nums.length;
        this.k = k;

        tree = new Node[4 * n];

        build(1, 0, n - 1);

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][0];
            int value = queries[i][1];
            int start = queries[i][2];
            int x = queries[i][3];

            // Persistent update
            nums[index] = value;
            update(1, 0, n - 1, index, value);

            // Get [start ... n-1]
            Node res = query(1, 0, n - 1, start, n - 1);

            ans[i] = res.pref[x];
        }

        return ans;
    }
}
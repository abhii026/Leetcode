import java.util.*;

class Solution {

    public int[] assignTasks(int[] servers, int[] tasks) {
        PriorityQueue<long[]> busy = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));

        PriorityQueue<int[]> idle = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        for (int i = 0; i < servers.length; i++) {
            idle.offer(new int[] { servers[i], i });
        }

        long ts = 0;
        int[] ans = new int[tasks.length];

        for (int i = 0; i < tasks.length; i++) {
            ts = Math.max(ts, i);
            release(busy, idle, servers, ts);
            if (idle.isEmpty()) {
                ts = busy.peek()[0];
                release(busy, idle, servers, ts);
            }

            int[] server = idle.poll();
            int idx = server[1];
            ans[i] = idx;
            busy.offer(new long[] { ts + tasks[i], idx });
        }

        return ans;
    }

    private void release(
        PriorityQueue<long[]> busy,
        PriorityQueue<int[]> idle,
        int[] servers,
        long ts
    ) {
        while (!busy.isEmpty() && busy.peek()[0] <= ts) {
            long[] server = busy.poll();
            int idx = (int) server[1];
            idle.offer(new int[] { servers[idx], idx });
        }
    }
}

import java.util.*;

class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("C")) {
                st.pop();
            }

            else if (operations[i].equals("D")) {
                int peek = st.peek();
                int mul = peek * 2;
                st.add(mul);
            }

            else if (operations[i].equals("+")) {
                int first = st.pop();
                int sec = st.peek();

                int sum = first + sec;

                st.add(first);
                st.add(sum);
            }

            else {
                int num = Integer.parseInt(operations[i]);
                st.add(num);
            }
        }

        int sum = 0;

        while (!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }
}

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse from last digit backwards
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // increment current digit
                return digits; // no carry, return result
            }
            digits[i] = 0; // set current to 0 and carry continues
        }
        
        // If all digits were 9, we reach here
        int[] result = new int[n + 1];
        result[0] = 1; // e.g. 999 + 1 = 1000
        return result;
    }
}

class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            char ch1 = Character.toLowerCase(arr[left]);
            char ch2 = Character.toLowerCase(arr[right]);

            if (ch1 != 'a' && ch1 != 'e' && ch1 != 'i' && ch1 != 'o' && ch1 != 'u') {
                left++;
            }
            else if (ch2 != 'a' && ch2 != 'e' && ch2 != 'i' && ch2 != 'o' && ch2 != 'u') {
                right--;
            }
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        return new String(arr);
    }
}

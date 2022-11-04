class Solution {

    // Approach:
    // Use two pointers to traverse from left and right towards to center.
    // Swap when both position contains vowels "aeiouAEIOU".

    public String reverseVowels(String s) {

        // Convert the string to charArray.
        char[] chars = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        // When both pointers meet, we know all the vowels are swapped.
        while (left < right) {
            // If chars[left] is not vowel, continue to move right.
            while (left < right && !isVowel(chars[left])) {
                left++;
            }
            // If chars[right] is not vowel, continue to move left.
            while (left < right && !isVowel(chars[right])) {
                right--;
            }

            // Swap the vowels.
            if (left < right) {
                char temp = chars[left];
                chars[left++] = chars[right];
                chars[right--] = temp;
            }
        }
        return new String(chars);
    }

    // Return true if char is a vowel.
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
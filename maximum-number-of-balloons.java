class Solution {
    public int maxNumberOfBalloons(String text) {

        // Store frequency of each character
        int[] freq = new int[26];

        // Count characters in the input string
        for (char ch : text.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Calculate how many times each required character
        // can contribute to forming "balloon"
        int b = freq['b' - 'a'];
        int a = freq['a' - 'a'];
        int l = freq['l' - 'a'] / 2; // need 2 l's
        int o = freq['o' - 'a'] / 2; // need 2 o's
        int n = freq['n' - 'a'];

        // The minimum among them determines the answer
        return Math.min(Math.min(b, a), Math.min(Math.min(l, o), n));
    }
}
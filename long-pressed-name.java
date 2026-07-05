class Solution {
    public boolean isLongPressedName(String name, String typed) {
        // Pointer for 'name'
        int i = 0;

        // Pointer for 'typed'
        int j = 0;

        // Traverse the typed string
        while (j < typed.length()) {

            // If current characters match,
            // move both pointers forward
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            }

            // If characters don't match,
            // check whether current typed character
            // is the same as the previous typed character.
            // If yes, it is a valid long press.
            else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            }

            // If neither condition is true,
            // typed contains an invalid character.
            else {
                return false;
            }
        }

        // All characters of 'name' must be matched.
        // If i reached the end of name, return true.
        return i == name.length();
    }
}
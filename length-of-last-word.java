class Solution {
    public int lengthOfLastWord(String s) {
        int last = s.length()-1;        //last character

        while(last >=0 && s.charAt(last)==' ')   
        {
            last--;         //if any space is at last leave
        }

        int count=0;

        while (last >= 0 && s.charAt(last)!=' ') 
        {
            count++;
            last--;
        }
        return count;
    }
}
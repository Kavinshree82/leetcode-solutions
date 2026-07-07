class Solution {
    public char kthCharacter(int k) {
        StringBuilder word=new StringBuilder("a");

        while(word.length() < k)
        {
            int size=word.length();

            for(int i=0;i<size;i++)
            {
                char c=word.charAt(i);

                if(c=='z')
                    word.append('a');
                else
                    word.append((char)(c+1));
            }
        }
        return word.charAt(k-1);
    }
}
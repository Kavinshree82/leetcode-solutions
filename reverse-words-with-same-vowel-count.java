class Solution {
    public String reverseWords(String s) 
    {
        String[] words = s.trim().split("\\s+");
        int targetVowels=countVowels(words[0]);

        for(int i=1;i<words.length;i++)
        {
            if(countVowels(words[i])==targetVowels)
            {
                words[i]=reverse(words[i]);
            }
        }
        return String.join(" ",words);  // Join the words back into a string
    }

    private int countVowels(String s)
    {
        int cnt=0;
        for(int i=0;i<s.length();i++)
        {
            if(isVowel(s.charAt(i)))
            {
                cnt++;
            }
        }
        return cnt;
    }
    
    private boolean isVowel(char ch)
    {
        char c=Character.toLowerCase(ch);
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }

    private String reverse(String s)
    {
        char[] arr=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            char t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
        return new String(arr); 
    }


}
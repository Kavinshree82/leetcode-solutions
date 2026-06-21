class Solution {
    public String reversePrefix(String word, char ch) 
    {
        int idx=word.indexOf(ch);
        if(idx==-1)
        {
            return word;
        }

        char[] arr=word.toCharArray();

        int i=0;
        int j=idx;

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
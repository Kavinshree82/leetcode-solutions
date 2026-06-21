class Solution {
    public String reversePrefix(String s, int k) {
        char[] arr = s.toCharArray();
        int i=0;
        int j=k-1;

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
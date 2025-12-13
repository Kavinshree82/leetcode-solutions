class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
     {
        int[] res=new int[nums1.length+nums2.length];

        int k=0;

        for(int i=0;i<nums1.length;i++)
        {
            res[k++]=nums1[i];
        }

        for(int j=0;j<nums2.length;j++)
        {
            res[k++]=nums2[j];
        }

        Arrays.sort(res);

        int len=res.length;

        if( len%2 ==0 )
        {
            
            return (res[len/2-1]+res[len/2])/2.0;
           
        }
        else
        {
             return res[len/2];
        }
     }
}
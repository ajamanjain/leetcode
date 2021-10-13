class Solution 
{
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int lengthOfTwo = m+n;
        int c = 0;
        int[] arr = new int[lengthOfTwo];
        
        for(int i=0; i<m; i++)
        {
            arr[i] = nums1[i];
        }
        
        for(int j=m; j<lengthOfTwo; j++)
        {
            arr[j] = nums2[c++];
        }
        
        Arrays.sort(arr);
        
        for(int i=0; i<lengthOfTwo; i++)
        {
            nums1[i] = arr[i];
        }
        
    }
}

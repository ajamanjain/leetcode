class Solution 
{
    public int[] singleNumber(int[] nums) 
    {
        int len = nums.length;
        int k=0;
        int[] arr = new int[2];
        
        for(int i=0; i<len; i++)
        {
            int count=0;
            
            for(int j=0; j<len; j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
            if(count == 1)
            {
                arr[k] = nums[i];
                k++;
            }
        }
        
        return arr;
    }
}

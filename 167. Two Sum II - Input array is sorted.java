class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        int len=numbers.length;
        int[] arr = new int[2];
        int beg=0, end=len-1;
        
        for(int i=0; i<len; i++)
        {
              if(numbers[beg]+numbers[end]==target)
              {
                  arr[0]=beg+1;
                  arr[1]=end+1;
                  break;
              }
             else if(numbers[beg]+numbers[end]>target)
             {
                end--;
             }
             else
             {
               beg++;
             }
         }        
        return arr;
    }
}

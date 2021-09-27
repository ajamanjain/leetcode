
import java.util.Scanner;

class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {int[] arr = new int[2];
        for(int i=0; i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int sum = nums[i]+nums[j];
                if(sum==target)
                {
                      arr[0]=i;
                      arr[1]=j;
                      break;
                }
            }
        }
     return arr;
    }
}
public class TwoSum
{
    public static void main(String args[])
    {
        int[] nums=new int[20];
        int target,ArraySize;
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of Array");
        ArraySize=sc.nextInt();
        System.out.println("The target of Sum");
        target=sc.nextInt();
        System.out.println("Insert an Array");
        for(int i=0;i<ArraySize;i++)
        {
          nums[i]=sc.nextInt();
        }
        Solution s = new Solution();
        s.twoSum(nums,target);
    }
}

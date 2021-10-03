class Solution 
{
    public int reverse(int x) 
    {
        int temp=0;
        int rev=0;
        int n=0;
        while(x!=0)
        {
        temp = x%10;
        rev = rev*10 + temp;
          if((rev-temp)/10 != n)
           {
              return 0;
            }
        n = rev;
        x = x/10;

        }
        return rev;
    }
}

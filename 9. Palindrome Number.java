class Solution 
{
    public boolean isPalindrome(int x) 
    {
        if(x<0)
        {
            return false;
        }

            int a=0,rev=0;
            
            int temp=x;
            
            while(x!=0)
            {
            a=x%10;
            rev = rev*10+a;
            x=x/10;
            }
            if(rev==temp)
                return true;
            else
                return false;         
        
    }
}

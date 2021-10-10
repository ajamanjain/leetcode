class Solution 
{
    public int lengthOfLastWord(String s) 
    {
        int count=0;
        s = s.trim();
        int i=s.length()-1;

        for(int j=i; j>=0; j--)
        {
            if(s.charAt(j)!=' ')
            {  
              count++;
            }
            else
            {
             if(s.charAt(j)==' ')
               {
                   return count;
               }
            }
            
        }
        return count;
    }
}

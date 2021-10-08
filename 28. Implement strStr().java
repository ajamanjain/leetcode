class Solution 
{
    public int strStr(String haystack, String needle) 
    {
        int j=0;
        
        if(needle.length()==0)
            return 0;        
        else
        {
          if(haystack.length()<needle.length())
            return -1;
          else
             return haystack.indexOf(needle);
        }     
    }
}

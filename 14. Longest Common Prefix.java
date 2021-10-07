class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
     String result="";
        
        for(int i=0;i<strs[0].length();i++)
        {
            char str = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++)
            {
                try
                {
                  if(strs[j].charAt(i)!=str)
                  {
                    return result;
                  }
                }
                catch(Exception ae)
                {
                    return result;
                }
            }
            result+=str;
            
        }
        return result;
    }
}

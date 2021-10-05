class Solution
{
    public int romanToInt(String s)
    {int[] val = new int[7];
     val[0]=1;
     val[1]=5;
     val[2]=10;
     val[3]=50;
     val[4]=100;
     val[5]=500;
     val[6]=1000;
        int t=0,before=0,result=0;
        while(t!=s.length())
        {
            char c = (char)s.charAt(t);
           switch(c)
            {
               case 'I': 
                       result += val[0];
                       before='I';
                       break;
                   
               case 'V':
                       if(before=='I')
                       {
                           result += 3;
                       }
                       else
                       {
                           result+=val[1];
                       }
                        before='V';
                        break;
                   
               case 'X':
                       if(before=='I')
                       {
                           result += 8;
                       }
                       else
                       {
                           result+=val[2];
                       }
                       before='X';
                       break;
                   
               case 'L':
                       if(before=='X')
                       {
                           result += 30;
                       }
                       else
                       {
                           result+=val[3];
                       }
                       before='L';
                        break;
                   
               case 'C':
                       if(before=='X')
                       {
                           result += 80; 
                       }
                       else
                       {
                           result+=val[4];
                       }
                       before = 'C';
                         break;
                   
               case 'D':
                       if(before=='C')
                       {
                           result+=300;
                       }
                       else
                       {
                          result+=val[5];
                       }
                       before='D';
                       break;

               case 'M':
                       if(before=='C')
                       {
                           result+=800;
                       }
                       else
                       {
                           result+=val[6];
                       }
                       before='M';
                       break;
            }
            
            t++;
        }
     return result;
    }
}

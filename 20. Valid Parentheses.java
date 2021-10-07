class Solution 
{
    public boolean isValid(String s) 
    {
        class Stack
        {
            final int MAX=5000;
            int top;
            char[] a = new char[MAX];
            public Stack()
            {
                top=0;
            }
           public void push(char input)
           {              
                   a[++top]=input;
           }
           public void pop()
            {                               
                  top--;       
            }
          public char peek()
          {
              return a[top];
          }
        }
        
        Stack stck = new Stack();
        
        for(int i=0; i<s.length();i++)
        {
            if(s.charAt(i)==')')
            {
                if(stck.peek()=='(')
                {
                    stck.pop();
                }
                else
                {
                    stck.push(s.charAt(i));
                }
            }
            else if(s.charAt(i)=='}')
            {
                if(stck.peek()=='{')
                {
                    stck.pop();
                }
                else
                {
                    stck.push(s.charAt(i));
                }
            }
            else if(s.charAt(i)==']')
            {
                if(stck.peek()=='[')
                {
                    stck.pop();
                }
                else
                {
                    stck.push(s.charAt(i));
                }
            }
            else
            {
                stck.push(s.charAt(i));
            }
 
        }
       
        if(stck.top==0)
             return true;
        else
            return false;
    }
}

import java.util.*;
class postFixExpression
{
     static int postfix(String exp)
    {
        Stack<Integer> stack=new Stack<>(); 
        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);

            if(c-'0'>=0 && c-'0'<=9)
            stack.push(c-'0');

            else{
                int var1=stack.pop();
                int var2=stack.pop();

                switch(c){
                    case '*':
                    stack.push(var2*var1);
                    break;

                    case '-':
                    stack.push(var2-var1);
                    break;

                    case '+':
                    stack.push(var2+var1);
                    break;

                    case '/':
                    stack.push(var2/var1);
                    break;
                }
            }
        }
        return stack.pop(); 
    }
    public static void main(String args[])
    {
        String exp="231*+9-";
        System.out.print(" "+postfix(exp));
    }
}
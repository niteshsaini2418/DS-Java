import java.util.*;
class anagramString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter two strings");
        String str=sc.nextLine();
        String str2=sc.nextLine();
        int count =0; int x =str.length();
        int y=str.length();
        if(x!=y)
        {System.out.println("Not Anagram");}
        else
        {
          for(int i=0;i<str.length();i++)
          {
          for(int j=0;j<str2.length();j++)
         {
          if(str.charAt(i)==str2.charAt(j))
           {count++;}
}
          }
        }
if(count==x)
System.out.println("YES Anagram");
else 
System.out.println("Not Anamgram");
    }
}
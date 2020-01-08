import java.util.*;
class missingElementInArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of test cases");
        int tcases=sc.nextInt();
       for(int a=0;a<tcases;a++)
       {
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        size=size-1;
        int array[]=new int[size];
        int temp=0;
       System.out.println("************");
        for(int i=0;i<size;i++)
        array[i]=sc.nextInt();
      
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(array[i+1]==array[j])
                {}
                else
                {
                    temp=array[i+1];
                    break;
                }

            }
        }
        
        System.out.println("Missing element "+(temp-1));
    }
    
    }
}
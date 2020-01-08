import java.util.*;
class sorting01array{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();
int count=0;
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]==0)
           count++;
        }
        for(int i=0;i<count;i++)
        {
            arr[i]=0;
        }
        for(int i=count;i<arr.length;i++)
        {
            arr[i]=1;
        }
        for(int i=0;i<arr.length;i++)
        System.out.print(" "+arr[i]);


    }
}
import java.util.*;
class fibonacci{

    static int fiboFun(int num)
    {
        if(num==1|| num==2)
        return 1;
        else
        return(fiboFun(num-1)+fiboFun(num-2)); 
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.print(fiboFun(i)+" ");
        }

    }
}
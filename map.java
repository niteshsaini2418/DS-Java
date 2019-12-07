import java.util.*;
public class map
{
    public static void main(String args[])
    {
        HashMap<Integer,String> ma =new HashMap<>();
        ma.put(0,"Estilo");
        ma.put(1,"Maruti800");
        ma.put(2,"MarutiVan");
        ma.put(3,"Swift");
        System.out.print(ma.get(3)); 
        System.out.println(ma.containsKey(4));
        ma.put(2,"Maruti800");
        System.out.println(ma.get(2));
    }
}
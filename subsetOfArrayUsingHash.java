import java.util.HashSet; 
class subsetOfArrayUsingHash
{ 
    
    static boolean subset(int array1[], int array2[], int size1, int size2) 
    { 
        HashSet<Integer> hashset= new HashSet<>(); 
          
        
        for(int i = 0; i < size1; i++) 
        { 
            if(!hashset.contains(array1[i])) 
                hashset.add(array1[i]); 
        } 
               
        for(int i = 0; i < size2; i++) 
        { 
            if(!hashset.contains(array2[i])) 
                return false; 
        } 
        return true; 
    }  
  
    public static void main(String[] args)  
    {  
        int array1[] = {10, 30, 20, 25, 35, 70}; 
        int array2[] = {30, 70, 10}; 
          
        int size1 = array1.length; 
        int size2 = array2.length; 
              
        if(subset(array1, array2, size1, size2)) 
        System.out.println("Array2 is a subset of Array1"); 
        else
        System.out.println("Array2 is not a subset of Array1"); 
    } 
} 
class subsetOfArray { 

    static boolean subset(int array1[],  
                int array2[], int size1, int size2) 
    { 
        int i = 0; 
        int j = 0; 
        for (i = 0; i < size2; i++) 
        { 
            for (j = 0; j < size1; j++) 
                if(array2[i] == array1[j]) 
                    break; 
              
            
            if (j == size1) 
                return false; 
        } 
          
    
        return true; 
    } 
      
 
    public static void main(String args[]) 
    { 
        int array1[] = {11, 1, 13, 21, 3, 7}; 
        int array2[] = {11, 3, 7, 1}; 
          
        int size1 = array1.length; 
        int size2 = array2.length; 
      
        if(subset(array1, array2, size1, size2)) 
            {System.out.print("Array2[] is "+ "subset of Array1[] ");} 
        else
           { System.out.print("Array2[] is "+ "not a subset of Array1[]");}  
    } 
}
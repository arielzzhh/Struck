package maman13;
public class Main {
    public static void main(String[] args) {
        
        //info ex
        int[] arr = {1, 2, 3, 4, 5};
        int med = 3;
    }

    
    
    public static int[] specialArr(int[] arr, int med) {
        int count = 0;
        for (int num : arr) {
            if (num < med) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num < med) {
                result[index++] = num;
            }
        }

        return result;
    }
    
    
    public static int first (int [] arr) {
    
        int first = 5 ;
        
        
        
    }
    
    
    
    
    
    
    
}
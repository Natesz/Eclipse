public class IR {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2a = {4, 5, 6, 7, 8, 1, 2, 3};
        // isRotation(array1, array2a) should return false.
        int[] array2b = {4, 5, 6, 7, 1, 2, 3};
        // isRotation(array1, array2b) should return true.
        int[] array2c = {4, 5, 6, 9, 1, 2, 3};
        // isRotation(array1, array2c) should return false.
        int[] array2d = {4, 6, 5, 7, 1, 2, 3};
        // isRotation(array1, array2d) should return false.
        int[] array2e = {4, 5, 6, 7, 0, 2, 3};
        // isRotation(array1, array2e) should return false.
        int[] array2f = {1, 2, 3, 4, 5, 6, 7};
        // isRotation(array1, array2f) should return true.
        
        System.out.println(isRotation(array1,array2a));
    }

    // Implement your solution below.
    public static Boolean isRotation(int[] array1, int[] array2) {
        int p1 = 0;
        if(array1.length!=array2.length){
            return false;
        }
        
        for(int i=0;i<array1.length;i++){
            if(array1[i]==array2[0]){
                p1=i;
            }
        }
        
        for(int j:array2){
            if(j==array1[p1 % array1.length]){
                p1++;
            }else{
                return false;
            }
        }
        return true;
    }
}
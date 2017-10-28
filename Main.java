public class Main {

    public static void main(String[] args) {
        Integer [] array = {7,11,31,56,76,123,128,189,234,246,251,253,366,424,576,634,658,786};
        int recursiveBinarySearch = recursiveBinarySearch(array,246,0,array.length-1);
        int binarySearch = binarySearch(array,31,0,array.length-1);

        System.out.printf(recursiveBinarySearch == -1 ? "Number  was not found\n" : "%d was found at index %d in the array using recursive binary search.\n",246,recursiveBinarySearch);
        System.out.printf(binarySearch == -1 ? "Number was not found\n" : "%d was found at index %d in the array using binary search.\n",31,binarySearch);
        
    }

    private static int binarySearch(Integer[] array, int numberToFind, int p, int r){
        while(p<=r){
            int q = (p + r)/2;
            if(array[q] == numberToFind){
                return q;
            } else if(array[q] > numberToFind){
                r = q - 1;
            } else{
                p = q + 1;
            }
        }
        return -1;
    }

    private static int recursiveBinarySearch(Integer array[], int numberToFind, int p, int r){
        if(p<=r){
            int q = (p + r)/2;
            if(array[q] == numberToFind){
                return q;
            } else if(array[q] > numberToFind){
                return recursiveBinarySearch(array,numberToFind, p,q - 1);
            } else{
                return recursiveBinarySearch(array,numberToFind, q + 1,r);
            }
        } else {
            return -1;
        }
    }

}

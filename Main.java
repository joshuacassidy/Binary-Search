
public class Main {
    public static void main(String[] args) {
        Integer [] a = {7,11,31,56,76,123,128,189,234,246,251,253,366,424,576,634,658,786};

        System.out.println(recursiveBinarySearch(a,246,0,a.length-1));
    }
    public static int binarySearch(Integer[] a, int numberToFind, int p, int r){
        while(p<=r){
            int q = (p + r)/2;
            if(a[q] == numberToFind){
                return q;
            } else if(a[q] > numberToFind){
                r = q - 1;
            } else{
                p = q + 1;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(Integer a[], int numberToFind, int p, int r){
        if(p<=r){
            int q = (p + r)/2;
            if(a[q] == numberToFind){
                return q;
            } else if(a[q] > numberToFind){
                return recursiveBinarySearch(a,numberToFind, p,q - 1);
            } else{
                return recursiveBinarySearch(a,numberToFind, q + 1,r);
            }
        }
        return -1;
    }

}

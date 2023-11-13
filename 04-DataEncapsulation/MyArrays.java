package bin;

public class MyArrays {
    static int odd(int[] x) {
        int sum = 0;
        for(int i=0;i<x.length;i++) {
            if (x[i]%2!=0 && x[i]>0) {
                sum++;
            }
        }
        return sum;
    }

    static int above(int[] x) {
        int sum = 0;

        for(int i=0;i<x.length;i++) {
            sum+=x[i];
        }

        sum = sum/x.length;
        int result = 0;

        for(int j=0;j<x.length;j++) {
            if(x[j]>sum) {
                result+=x[j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {3,2,-5,4,1,-7};
        int[] arr2 = {5,2,7,4,2};
        System.out.println(MyArrays.odd(arr1));
        System.out.println(MyArrays.above(arr2));

    }
}

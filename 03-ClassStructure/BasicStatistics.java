public class BasicStatistics {
    static String NumberOfItems(int x,int y) {
        int sum = 0;
        for(int i = x; i<=y;i++) {
            sum++;
        }
        return String.format("The number of items in range <%d,%d> is %d",x,y,sum);
    }

    static String SumOfNumbers(int x,int y) {
        int sum = 0;
        for(int i = x; i<=y; i++) {
            sum+=i;
        }
        return String.format("The sum of given numbers in range <%d,%d> is %d", x,y,sum);
    }

    static String ArithmeticOfNum(int x,int y) {
        int sum = 0;
        int items = 0;
        for(int i=x; i<=y;i++){
            sum+=i;
            items++;
        }
        float result = sum/items;
        return String.format("Arithmetic mean of the numbers in the given range <%d,%d> is %.1f%n", x,y,result);
    }

    public static void main(String[] args) {
        System.out.println(NumberOfItems(5, 10));
        System.out.println(SumOfNumbers(5, 10));
        System.out.println(ArithmeticOfNum(5, 10));
    }
}

/**
 * Created by Praktika on 11.11.2016.
 */
public class exercise 67 {
    public static void main(String[] args) {
        int n = 5;
        if(n % 2 == 0) {
            System.out.println("Sisesta ainult paaritu arv");
        } else {
            oddSum(n);
        }
        System.out.println(oddSum(n));
    }
    public static int oddSum(int n) {
        if(n <= 0) {
            return 0;
        } else {
            return(n + oddSum(n - 2));
        }
    }
}

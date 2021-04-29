import java.util.Arrays;
import java.util.Scanner;

public class Smartphone {

    public static void main (String[] args)
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ");

        int n = sc.nextInt();
        long[] bud = new long[n];

        for (int i=0;i<n;i++) {
            bud[i] = sc.nextLong();
            //System.out.println(bud[i]);
        }

        Arrays.sort(bud);

        long price = Long.MIN_VALUE;
        int mul =n;
        for (int i=0;i<n;i++) {
            price = Math.max(price,bud[i]*mul);
            mul--;
        }
        System.out.println(price);

    }
}
import java.util.Arrays;
import java.util.Scanner;

public class ChefOnIsland {

    public static void main (String[] args)
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ");

        int n = sc.nextInt();


        for (int i=0;i<n;i++) {
            double[] bud = new double[5];
            for(int j=0; j<5;j++){
                bud[j] = sc.nextDouble();
            }

            //main logic
            double food = bud[0]/bud[2];
            double water = bud[1]/bud[3];

            double minDays = Math.min(food,water);

            if(minDays >= bud[4]){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }



    }
}
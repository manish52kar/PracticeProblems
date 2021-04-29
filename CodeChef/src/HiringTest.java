import java.util.Scanner;

public class HiringTest {

    public static void main (String[] args)
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i=0;i<n;i++) {//testcases

            int[] bud = new int[4];

            for(int j=0; j<4;j++){
                bud[j] = sc.nextInt();
            }

            for(int k = 0 ; k < 6; k++){ //students
                int countF=0;
                int countP=0;
                int countU=0;

                String res = sc.nextLine();
                String res1 = sc.nextLine();
                String res2 = sc.nextLine();
                String res3 = sc.nextLine();
                String res4 = sc.nextLine();
                System.out.println(k+" "+res);
                if(res.isEmpty()){
                    continue;
                }

                for(int l=0; l < res.length(); l++){

                    if(res.charAt(l)== 'F'){
                        countF++;
                    }else if(res.charAt(l)== 'P'){
                        countP++;
                    }else if(res.charAt(l)== 'U'){
                        countU++;
                    }
                }
                //System.out.println(countF);
               /* if((countF >= bud[2]) || ((countP == (bud[2]-1))&&(countU >= bud[3] ))){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }*/
                // System.out.println(countF);
                //System.out.println(countF);

            }




        }



    }
}
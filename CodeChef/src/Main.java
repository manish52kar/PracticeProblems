import java.util.Arrays;

public class Main {

    public static void main (String[] args)
    {
        // your code goes here
        String test = "abcde";
        //char[] a = test.toCharArray();
        int length = test.length();
        int mid = length / 2;
        if(length % 2 == 0){
            int step = 0;
            verifyString(test,mid,step);
        }else{
            int step = 1;
            verifyString(test,mid,step);
        }

    }

    private static void verifyString(String test, int mid, int step) {

        char[] aa = test.substring(0,mid).toCharArray();
        char[] bb = test.substring(mid+step).toCharArray();
        Arrays.sort(aa);
        Arrays.sort(bb);
        if((new String(aa)).equals(new String(bb))){
            System.out.println("Yes");
        }else{
            System.out.println("NO");
        }
    }
}

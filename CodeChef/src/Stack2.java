import java.util.Stack;

public class Stack2 {

    public static void main (String[] args)
    {
        //Find just greater number on right side

        int[] arr = { 4, 5, 2, 25 };

        nextGreater(arr,arr.length);
    }

    private static void nextGreater(int[] arr, int n) {

        Stack<Integer> s = new Stack<>();

        int[] arr1 = new int[n];

        for (int i = n -1 ; i >= 0 ; i--) {

            while(!s.isEmpty() && s.peek() <= arr[i]){
                s.pop();
            }

            if(s.empty()){
                arr1[i] = -1;
            }else {
                arr1[i] = s.peek();
            }

            s.push(arr[i]);
        }

        for (int i = 0; i < n; i++) {

            System.out.println(arr[i]+" --> "+arr1[i]);
        }
    }


}
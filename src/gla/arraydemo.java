package gla;
import java.util.Arrays;
public class arraydemo {
    public static void main(String args[]){
        int[] my_arr={25,14,15,36,56,77,18,29,49};
        int pos=2;
        int newv=5;
        System.out.println("original array:"+ Arrays.toString(my_arr));
        for (int i=my_arr.length-1;i>pos;i--){
            my_arr[i]=my_arr[i-1];

        }
        my_arr[pos]=newv;
        System.out.println("newArray:" +Arrays.toString(my_arr));

    }
}

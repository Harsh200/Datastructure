import java.util.*;
import java.util.ArrayList;
public class javaArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
     //   list.add(42);
        for(int i=0;i<10;i++){
            list.add(i,i+1);
        }
        list.remove(9);
        for(Integer integer:list){
            System.out.println(integer);
        }
    }


}

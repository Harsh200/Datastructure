import java.util.*;
public class List {
    int[] a=new int[10];
    public static void main(String[] args) {
        List li = new List();
        System.out.println(Arrays.toString(li.a));
        li.insert(42);
        System.out.println(Arrays.toString(li.a));
    }
        void insert(int value){
            for(int i=0;i<a.length;i++){
                if(a[i]==0){
                    a[i]=value;
                    break;
                }
            }

        }

    }



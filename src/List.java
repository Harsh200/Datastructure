import java.util.*;
public class List {
    int[] a = new int[10];

    public static void main(String[] args) {
        List li = new List();
        System.out.println(Arrays.toString(li.a));
        for (int i = 0; i < 10; i++) {
            li.insert(42+i);
        }
        System.out.println(Arrays.toString(li.a));
        li.remove(2);
        System.out.println(Arrays.toString(li.a));
    }

    void insert(int value) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = value;
                break;
            }

        }

    }

    void remove(int index) {

for(int i = index; i<a.length-1;i++)

    {
        a[i] = a[i + 1];
    }

    a[a.length-1]=0;

}
    }



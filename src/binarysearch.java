import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter no of element");
        int size=scanner.nextInt();

    //    int size = 10;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            array[i]=i+1;
        }
        int value=4;
        int pos=binarySearch(array,value);
        if(pos==-1){
            System.out.println(value +"not found in the array");
        }
        else {
            System.out.println(value +"found at index"+pos);
        }

    }
    public static int binarySearch(int []array,int value){
        int beg=0;
        int end=array.length-1;
        int mid=(beg+end)/2;
        int pos=-1;
        for(int i=0;beg<=end;i++) {
        if(array[mid]==value){
            pos=mid;
            break;
        }
        else if(array[mid]>value){
            end=mid-1;
        }
        else{
            beg=mid+1;
        }
        }
            return pos;



    }
}

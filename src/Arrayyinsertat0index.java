public class Arrayyinsertat0index {
    public static void main(String[] args) {
        int n=(int)(Math.random()*100);
        int [] array=new int[n];
        for (int i = 0; i < n; i++) {
            array[i]=(int)(Math.random()*100);
        }
        for(int i:array){
            System.out.println(i);
        }
        System.out.println("total values is" + n);
    }
}

public class Myqueue {
    public int[]q;
    public int size;
    public int total;
    public int front;
    public int rear;
    public Myqueue(){
        size=10;
        total=0;
        front=-1;
        rear=-1;
        q=new int[size];
    }
}

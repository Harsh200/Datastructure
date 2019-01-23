public class Mystack {
    int size;
    int top=-1;
    int stackarray[];
    public Mystack(int size){
   this.size=size;
        stackarray=new int[size];
    }
    public void push(int value){
        // check is the array is already full
        if(!isfull()){
            top++;
            stackarray[top]=value;
        }
        boolean isfull(){

            boolean response;
           if((stackarray[size-1]!=0) && (top==(stackarray.length-1))){
               response=true;
           }
           return response;
        }
    }
    public int pop(){
        int response;
        if(!isEmpty()){
            stackarray[top]=0;

        }
    }



}

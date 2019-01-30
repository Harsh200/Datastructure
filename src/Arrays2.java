public class Arrays2 {
    public static void main(String[] args) {
        // now we are implementing
        Student[] studentArray;
        int bottom;
        Arrays2(int numberOfStudent){
            studentArray=new Student[numberOfStudent];
            bottom=-1;
        }
        Student student =new Student();
        student.setRollno(1);
        student.setName("Bablu");
        System.out.println(student);
  /*      student.name="GUDDU";
        student.rollno=123;
        Student[] students=new Student[47];
        for(int i=0;i<students.length;i++){
            students[i]=new Student();
            students[i].rollno=i+1;
            students[i].name="GUDDU"+i;
        }
       for (Student student1: students){
            System.out.println(student1);
            }
*/

        }
    }

class Student{
   private int rollno;
private String name;
 public int getRollno(){
    return  rollno;
}
public String getName() {
    return name;
}
public void setRollno(int rollno){
this.rollno=rollno;
}
public void setName(String name){
     this.name=name;
}

    @Override
    public String toString() {
        return (rollno +", " +name);
    }
}
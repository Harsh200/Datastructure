public class Arrays2 {
    public static void main(String[] args) {
        Student student =new Student();
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

    @Override
    public String toString() {
        return (rollno +", " +name);
    }
}
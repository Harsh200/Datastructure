//import java.util.*;
//public class Linearsearchnonprimitive {
//    public static void main(String[] args) {
//        int size=10;
//        Scanner sc=new Scanner(System.in);
//        car[] cars=new car[size];
//        for (int i = 0; i < cars.length; i++) {
//            cars[i]=new cars ("Name"+i,"Model"+i,i*1000);
//
//
//
//        }
//        for(car Car:cars)
//        {
//            System.out.println(Car);
//            }
//        int pos=linearsearch(cars,500);
//        if(pos==-1){
//            System.out.println("No car is available in 500");
//        }
//        else {
//            System.out.println(cars[pos].getModel()+"from" +cars[pos].getName()+"is avaliable for 500");
//        }
//
//        sc.close();
//    }
//
//
//
//    public static int linearsearch(car[] cars, int value) {
//        int pos=-1;
//        for (int i = 0; i < marks.length; i++) {
//            if(cars[i].getprice()==value){
//                pos=i;
//
//                break;
//            }
//        }
//        return pos;
//    }
//}
//class car{
//    private String name;
//    private String model;
//    private int price;
//    public car(String model,int price) {
//        this.model = model;
//        this.price = price;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public int getPrice() {
//        return price;
//    }
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String name) {
//        this.model = model;
//    }
//}
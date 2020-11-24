public abstract class Vehicle {
    public void No0fwheels(){}
    public static void main(String[] str){
        Car n12=new Car();
        Motorbike n012=new Motorbike();
        n12.No0fwheels();
        n012.No0fwheels();
    }
}
class Car extends Vehicle{
    public void No0fwheels(){
        System.out.println("四轮车");
    }
}
class Motorbike extends Vehicle{
    public void No0fwheels(){
        System.out.println("二轮车");
    }
}
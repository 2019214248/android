package dingting;

public class Vehicles {
    public String brand;
    public String color;
    public void run(){
        System.out.println("我已经开动了");
    }
    public void showinfo(){
        System.out.println("商标:"+this.brand+" 颜色:"+this.color);
    }
    public Vehicles(String brand,String clor){
        this.brand=brand;
        this.color=clor;
    }
    public static void main(String []args){
        Vehicles a=new Vehicles("奔驰","黑色");
        a.showinfo();
        car b=new car("大众","白色",4);
        b.showCar();
        Truck c=new Truck("一汽","灰色",1);
        c.showTruck();
    }
}
class car extends Vehicles{
    private int seats;
    public void showCar(){
        System.out.println("商标:"+this.brand+" 颜色:"+this.color+" 座位:"+this.seats);
    }
    public car (String a,String b,int c){ //因为父类没有无参数的构造器，故子类一定要调用有参数的构造器，否则会报错
        super(a,b);
        this.seats=c;
    }
}
class Truck extends Vehicles{
    private float load;
    public void showTruck(){
        System.out.println("商标:"+this.brand+" 颜色:"+this.color+" 载重:"+this.load);
    }
    public Truck (String a,String b,float c){
        super(a,b);
        this.load=c;
    }
}

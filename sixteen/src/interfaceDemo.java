interface vehicle2//注意命名别重复了
{
    public void start();
    public void stop();
}
public class interfaceDemo {
    public static void main(String[] str)
    {
        Bike bike=new Bike();
        bike.start();
        bike.stop();
        Bus bus=new Bus();
        bus.start();
        bus.stop();
    }
}
class Bike implements vehicle2
{
    public void start()
    {
        System.out.println("骑自行车");
    }
    public void stop()
    {
        System.out.println("自行车停车");
    }
}
class Bus implements vehicle2
{
    public void start()
    {
        System.out.println("做公交车");
    }
    public void stop()
    {
        System.out.println("公交车停车");
    }
}

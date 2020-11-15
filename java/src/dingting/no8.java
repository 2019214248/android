package dingting;

public class no8 {
        static class car8{
        private int num;
        private String color;
        private double weight;
        public car8(){}
        public car8(int a,String b,double c) {
            num=a;
            color=b;
            weight=c;
            System.out.println(num+"轮"+color+weight+"吨");
        }
        public void SpeedUp() {
            System.out.println("汽车加速");
        }
        public void SpeedDown()
        {
            System.out.println("汽车减速");
        }
        public void Stop()
        {
            System.out.println("汽车停车");
        }
    }
    public static void main(String []args)
    {
        //car8 c=new no8().new car8();// 外部类调用内部类，方法一如左，方法二：将内部类设为static类
       // car8 c1=new no8().new car8(4,"黑色",1.5);
        car8 c=new car8();
        car8 c1=new car8(4,"黑色",1.5);
        c.SpeedUp();
        c.SpeedDown();
        c.Stop();
    }
}

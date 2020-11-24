public class Auto {
    public int count;
    public String color;
    public double weight;
    public double speed;
    public Auto(){}
    public Auto(int a,String b){
        count=a;
        color=b;
        System.out.println("轮胎个数："+count+"\n汽车颜色："+color);
    }
    public void jiasu(){
        System.out.println("加速中");
    }
    public void jiansu(){
        System.out.println("减速中");
    }
    public void tingche(){
        System.out.println("已停车");
    }
    public static void main(String[] str){
        car n11=new car();//通过子类实例化对象
        Auto n011=new Auto(4,"red");
        Auto n111=new Auto();//通过父类实例化对象
        n11.jiasu();//子类的方法
        n11.jiansu();
        n111.jiasu();//父类中的方法
        n111.jiansu();
    }
}
class car extends Auto{
    public String kongtiao;
    public String CD;
    public void jiasu(){
        System.out.println("取消加速");
    }
    public void jiansu(){
        System.out.println("取消减速");
    }
}

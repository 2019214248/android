interface step{
    public void huanchong();
    public void guolv();
    public void jiare();
    public void fangtang();
}
public abstract class water {
    public void getwater(){}
    public static void main(String[] str){
        water2 n16=new water2();
        n16.getwater();
        n16.huanchong();
        n16.guolv();
        n16.jiare();
        n16.fangtang();
    }
}
class water2 extends water implements step{
    public void getwater(){
        System.out.println("取水");
    }
    public void huanchong(){
        System.out.println("缓冲");
    }
    public void guolv(){
        System.out.println("过滤");
    }
    public void jiare(){
        System.out.println("加热");
    }
    public void fangtang(){
        System.out.println("放糖");
    }
}

package dingting;

public class no4 {
    public static void main(String []args){
        WuMingFen f1=new WuMingFen("番茄",1,true);
        WuMingFen f3=new WuMingFen(true,"麻辣",3);
        f3.check();
        f1.check();
    }
}
class WuMingFen{
    private String theMa;
    private int quantity;
    private boolean likeSoup;
    public WuMingFen(String a,int b,boolean c){
        theMa=a;
        quantity=b;
        likeSoup=c;
    }
    public  WuMingFen(String a,int b){
        theMa=a;
        quantity=b;
    }
    public WuMingFen(boolean a,String b,int c){
        likeSoup=a;
        theMa=b;
        quantity=c;
        if(a){
            System.out.println(theMa+quantity+"两"+"带汤的");
        }
    }
    public void check(){
        if(likeSoup){
            System.out.println(theMa+quantity+"两"+"带汤的");
        }
        else {
            System.out.println(theMa+quantity+"两"+"带汤的");
        }
    }
}
package dingting;
public class no1 {
    public static void main(String []args){
        Number calculate=new Number(11,13);
        System.out.println("相加"+calculate.addition());
        System.out.println("相减"+calculate.subtration());
        System.out.println("相乘"+calculate.multiplication());
        System.out.println("相除"+calculate.division());
    }
}
class Number{
    private int n1;
    private int n2;
    public Number(int a,int b){
        n1=a;
        n2=b;
    }
    public int addition(){
        return n1+n2;
    }

    public int subtration() {
        return n1-n2;
    }

    public int multiplication() {
        return n1*n2;
    }

    public double division() {
        return (double)n1/n2;
    }
}
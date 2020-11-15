package dingting;

public class no9 {
    public static void main(String[] dasd) {
        n9 c=new n9(11,13);
        n9 c1=new n9(11,12,13);
        n9 c2=new n9("ding","ting");
    }
}
class n9 {
    public n9(int x, int y) {
        if (x > y)
            System.out.println("max=" + x);
        else
            System.out.println("max=" + y);
    }

    public n9(double a, double b, double c) {
        System.out.println("multiply result =" + a * b * c);
    }

    public n9(String s1, String s2) {
        if (s1.equals(s2))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
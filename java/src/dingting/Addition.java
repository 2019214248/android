package dingting;
public class Addition {
    public int addint(int x,int y) {
       return x+y;
    }
    public long addlong(long x,long y) {
        return x+y;
    }
    public float addfloat(float x,float y) {
        return x+y;
    }
    public double adddouble(double x,double y) {
        return x+y;
    }
    public String addstring(String x,String y) {
        return x+y;
    }
    public static void main(String []args)
    {
        Addition n7=new Addition();
        System.out.println(n7.addint(11,13));
        System.out.println(n7.addstring("11","13"));
    }
}


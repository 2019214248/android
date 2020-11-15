package dingting;

public class no10 {
    static class StaticDemo {
        private static int x= 10;
        private int y = 5;
    }
    public static void main(String []args) {
        StaticDemo n10=new StaticDemo();
        System.out.println("The static="+n10.x+"\nthe normal="+n10.y);
    }
}

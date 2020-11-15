package dingting;

public class no6 {
    public static void main(String []args){
        custom n6=new custom("dingting","123456","@haha.com");
        custom n=new custom("dingting","56789");
    }
}
class custom{
    private String id;
    private String code;
    private String email;
    public custom(String a,String b,String c){
        id=a;
        code=b;
        email=c;
        System.out.println("用户账号为:"+id+" 密码为:"+code+" 邮箱为:"+email);
    }
    public custom(String a,String b){
        id=a;
        code=b;
        email="@gameschool.com";
        System.out.println("用户账号为:"+id+" 密码为:"+code+" 邮箱为:"+email);
    }
}
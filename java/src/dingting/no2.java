package dingting;

public class no2 {
    public static void main(String []args){
        Person no=new Person("ding ting",19);
        no.display();
    }
}
class Person{
    private String name;
    private int age;
    public Person(String a,int b){
        name=a;
        age=b;
    }
    public void display(){
        System.out.println("姓名:"+name+"\n"+"年龄:"+age);
    }
}

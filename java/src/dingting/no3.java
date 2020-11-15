package dingting;

public class no3 {
    public static void main(String []args){
        No ting=new No("ding ting");
    }
}
class No{
    private String name;
    public No(String a){
        name=a;
        No ding=new No();
        ding.setname(name);
        System.out.println(ding.getname());
    }
    public  No(){

    }
    public void setname(String a){
        name=a;
    }
    public String getname(){
        return name;
    }
}
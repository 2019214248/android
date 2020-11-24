interface function{
    public void theftproof();
    public void waterproof();
    public void fireproof();
    public void bulletproof();
}
public abstract class door {
    public void openDoor(){}
    public void closeDoor(){}
    public static void main(String[] str){
    door2 n15=new door2();
    n15.opendoor();
    n15.closedoor();
    n15.theftproof();
    }
}
class door2 extends door implements function{
    public void opendoor(){
        System.out.println("开门");
    }
    public void closedoor(){
        System.out.println("关门");
    }
    public void theftproof(){
        System.out.println("防盗功能");
    }
    public void waterproof(){
        System.out.println("防水功能");
    }
    public void fireproof(){
        System.out.println("防火功能");
    }
    public void bulletproof(){
        System.out.println("防子弹功能");
    }
}


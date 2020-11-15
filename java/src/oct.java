import java.util.*;
public class oct {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
    System.out.print("请分别输入需要抽取的个数和总个数");
    int k=in.nextInt(),n=in.nextInt();
    int []numbers=new int[n]; //动态初始化数组
    for(int i=0;i<numbers.length;i++)
        numbers[i]=i+1;
    int[] result=new int[k];
    for(int i=0;i<result.length;i++)
    {
        int r=(int) (Math.random()*n);
        result[i]=numbers[r];
        numbers[r]=numbers[n-1];//不重复抽取
        n--;
    }
    Arrays.sort(result);
    for(int r: result)
        System.out.println(r);
    }
}

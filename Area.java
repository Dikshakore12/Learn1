import java.util.Scanner;

public class Area{
    public static void main(String args[]){
        //Area of Cicle
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius:");
        float rad=sc.nextFloat();
        float area=3.14f*rad*rad;
        System.out.println("Area of Circle: "+area);
    }
}
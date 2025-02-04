import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args){
        float a,b,c;
        System.out.println("Enter the length of cuboid:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        System.out.println("Enter the breadth of cuboid:");
        b = sc.nextFloat();
        System.out.println("Enter the height of cuboid:");
        c = sc.nextFloat();
        float volume = a*b*c;
        System.out.println("The volume of cuboid is: "+volume);
    }
}

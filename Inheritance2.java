// program to define a class volume and compute volume of sphere and cube using class and object
import java.util.Scanner;
public class Inheritance2 {
    public static void main(String[] args) {
    volume x1 = new volume();
    x1.inputSphere();
    x1.inputCube(); 
    }
}

class volume{
 Scanner in = new Scanner(System.in);
 final double pi= 3.14;
 float r, a;
 double volumeOfSphere , volumeOfCube;
 void inputSphere(){
    System.out.println("Enter radius of Sphere");
    r= in.nextFloat();
    volumeOfSphere= (4*pi*r)/3;
    System.out.println("Volume of Sphere ="+ volumeOfSphere);
     }
 void inputCube(){
    System.out.println("Enter side of cube");
    a= in.nextFloat();
    volumeOfCube= a*a*a;
    System.out.println("Volume of Sphere ="+ volumeOfCube);
 }
 
}

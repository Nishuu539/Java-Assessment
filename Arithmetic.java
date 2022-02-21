import java.util.Scanner;
import java.util.Collections;

class Arithmetic{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First number: ");
        int a=sc.nextInt();
        System.out.println("Enter Second number: ");
        int b=sc.nextInt();
        System.out.println("Enter Third number: ");
        int c=sc.nextInt();
        int sum=a+b+c;
        int average=sum/3;
        int pro=a*b*c;
        System.out.println("Addition of three numbers is: "+ sum);
        System.out.println("Average of three numbers is: "+ average);
        System.out.println("Product of three numbers is: "+ pro);
        if(a>b && a>c){
            System.out.println("A is largest");
        }
        else if(b>a && b>c){
            System.out.println("B is largest");
        }
        else{
            System.out.println("C is largest");
        }
        if(a<b && a<c){
            System.out.println("A is smallest");
        }
        else if(b<a && b<c){
            System.out.println("B is smallest");
        }
        else{
            System.out.println("C is smallest");
        }
    }
}
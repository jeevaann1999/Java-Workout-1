import java.util.Scanner;

public class Celsius {
    public static void main(String[] args){
        double f,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit");
        f=sc.nextDouble();
        System.out.println("Temperature in celsius="+celsius(f));

    }
    static double celsius(double f) {
        return (f-32)*5/9;
    }

}

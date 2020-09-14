import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double n = Math.random() * x;
        double m = (n + x/n) / 2;
        while (Math.abs(m - n) > 0.00001){
            n = m;
            m = (n + x/n) / 2;
        }
        return n;
        
    }

    // Calculates the factorial of a number
    public static double factorial(int x) {
        int a = 1;


        while (x > 1){
            a = a * (x * (x-1));
            x-=2;
        }
        return a;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double e = 0;
        int i = 0;
        while(Math.abs(Math.E - e) > 0.00000000001){
            e = e + (1/factorial(i));
            i++;
        }
        return e;

    

    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a positive number");
        int numb = scan.nextInt();
        System.out.println("The squareroot of " + numb +  " is " + babylonian(numb));
        System.out.println("The value of e is roughly : " + factorial(numb));
        


        scan.close();
    }
}

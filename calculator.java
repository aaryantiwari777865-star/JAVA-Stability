import java.util.Scanner;

public class calculator {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1 for sum\n2 for substract\n3 for divison\n");

        int a = sc.nextInt();

        System.out.println("now enter the two numbers");

        float b = sc.nextInt();

        float c = sc.nextInt();

          float sum = b+c;

        float sub = b-c;

        float div = b/c;


        switch (a) {
            case 1: System.out.println("sum"+sum);
                
                break;
        
            case 2: System.out.println("substract"+sub);
            break;

            case 3: System.out.println("division"+div);
            break;

            default:System.out.println("invalid  ");
    
        }

      sc.close();
    }
    
}

import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        System.out.println("Welcome to my calculator");
        System.out.println("input a number");
        Scanner others = new Scanner( System.in);
        int firstDIGIT = others.nextInt();
        System.out.println("input second number");
        int secondDIGIT = others.nextInt();
        Scanner o = new Scanner(System.in);
        System.out.println("Which operator");
        String operator = o.nextLine();
        System.out.println("calculating...");
        if (operator.equals("+")){
            System.out.println(firstDIGIT + secondDIGIT);
        }
        else if(operator.equals("-")){
            System.out.println(firstDIGIT - secondDIGIT);
        }
        else if(operator.equals("/")){
            System.out.println(firstDIGIT / secondDIGIT);
        }
        else {
            System.out.println("error");
        }
    }
}

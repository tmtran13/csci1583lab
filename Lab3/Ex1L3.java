/*
    Exercide One
    Lab Three
    Arthur Tien Tran
*/
    
import java.util.Scanner;

public class Ex1L3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number;
        
        System.out.println("Enter a Number");
        number = input.nextInt();
        
        System.out.println("before the if statement");
        
        if (number % 10 == 0){
            System.out.println("yep it's a multiple of 10");
        }
        
        System.out.println("after the if statement");
        
    }
}
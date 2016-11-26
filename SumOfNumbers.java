/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nilima M
 */
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] arg)
    {
    Scanner input = new Scanner(System.in);
    int sum=0;
    System.out.print("Enter a positive nonzero integer value : ");
    int num = input.nextInt();
    for(int i=1;i<=num;i++)
        {
            sum=sum+i;
        }
    System.out.println("The sum is "+ sum);
    }
}

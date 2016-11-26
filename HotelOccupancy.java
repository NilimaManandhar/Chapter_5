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
public class HotelOccupancy {
    public static void main(String[] args)
    {
        System.out.println("Enter the number of the floor : ");
        Scanner input = new Scanner(System.in);
        int numfloors = input.nextInt();
        if(numfloors<1)
        {
            System.out.println("Invalid input. Restart the program. UGH");
            System.exit(0);
        }
        int rooms=0;int totalrooms=0;
        int occupied=0;int totaloccupied=0;
        double rate=0.0;
        for(int i=1; i<=numfloors;i++)
        {
            System.out.print("Enter the number of rooms : ");
            rooms=input.nextInt();
            totalrooms=+rooms;
            System.out.print("Enter how many are occupied ; ");
            occupied=input.nextInt();
            totaloccupied+=occupied;
            
        }
        rate=totaloccupied/totalrooms;
        System.out.println("Total number of rooms : "+ totalrooms);
        System.out.println("Total Vacant : "+ (totalrooms-totaloccupied));
        System.out.println("The occupancy rate is "+ rate);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nilima M
 */
import java.io.*;
import java.util.Scanner;

public class DistanceTraveled {
    private int speed;
    private int hours;
    public void setSpeed(int s)
    {
        this.speed=s;
    }
    public int getSpeed(){return speed;}
    public int getHours(){return hours;}
    public void setHours(int h)
    {
        this.hours=h;
    }
    public int getDistance(int s, int h)
    {
       int distance = s*h;
       return distance;
    }
    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the speed : ");
        int userSpeed = input.nextInt();
        System.out.print("Enter the time : ");
        int time=input.nextInt();
        DistanceTraveled obj = new DistanceTraveled();
        obj.setHours(time);
        obj.setSpeed(userSpeed);
        System.out.println("HOURS "+"\t DISTANCE TRAVELLED");
        for(int i=1; i<=obj.getHours(); i++)
        {
            System.out.println(i+ "\t"+ obj.getDistance(userSpeed, i));
        }
        
    }
    
}

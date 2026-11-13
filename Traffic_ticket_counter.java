
package traffic_ticket_counter;

import java.util.Scanner;

public class Traffic_ticket_counter {

    public static void main(String[] args) {
        System.out.println("Traffic ticket counter for cars");
        
        Scanner input = new Scanner(System.in);
        
        int speed_limit, car_speed, speeding, fine;
        
        System.out.print("Enter speed limit: ");
        speed_limit = input.nextInt();
        
        System.out.print("Enter car speed: ");
        car_speed = input.nextInt();
        
        speeding = car_speed - speed_limit;
        
        if (speeding <= 0){
            fine = 0;
        }
        else if (speeding <= 10){
            fine = 10000;
        }
        else if (speeding <= 20){
            fine = 20000;
        }
        else if (speeding <= 30){
            fine = 30000;
        }
        else if (speeding <= 40){
            fine = 50000;
        }
        else {
            fine = 100000;
        }
        
        System.out.println("\n-----The ticket-----");
        System.out.println("The speed limit: " + speed_limit + " km/h");
        System.out.println("The actual speed: " + car_speed + " km/h");
        
        if (speeding > 0){
            System.out.println("The speeding: " + speeding + " km/h");
        }
        else {
            System.out.println("The speeding: No speeding");
        }
        
        System.out.println("The fine amount: " + fine + " HUF");
        
        input.close();
    }  
}

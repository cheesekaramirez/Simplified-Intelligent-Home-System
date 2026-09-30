
import java.util.Scanner;

public class HomeApp {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Light light = new Light();
        TV tv = new TV();
        AirConditioning aircon = new AirConditioning();
        HomeInterface hInterface = new HomeInterface(light, tv, aircon);
        while (true) { 
             System.out.println("--Home App--");
            System.out.println("[1] Turn On Light");
            System.out.println("[2] Turn Off Light");
            System.out.println("[3] Turn On TV");
            System.out.println("[4] Turn Off TV");
            System.out.println("[5] Turn On Aircon");
            System.out.println("[6] Turn Off Aircon");
            System.out.println("[7] Turn On All Appliances");
            System.out.println("[8] Turn Off Appliances");
            System.out.println("[9] Exit");
            System.out.print("Pick the number of your desired choice: ");
            int choice = scn.nextInt();

            switch (choice) {
                case 1:
                    hInterface.turnOnLight();
                    break;
                case 2:
                    hInterface.turnOffLight();
                    break;
                case 3:
                    hInterface.turnOnTV();
                    break;
                case 4:
                    hInterface.turnOffTV();
                    break;
                case 5:
                    hInterface.turnOnAircon();
                    break;
                case 6:
                    hInterface.turnOffAircon();
                    break;
                case 7:
                    hInterface.turnOnAll();
                    break;
                case 8:
                    hInterface.turnOffAll();
                    break;
                case 9:
                    scn.close();
                    System.exit(0);
                default:
                    System.out.println("Please choose a valid number.");
            }
        }
       
        
        
    }
}
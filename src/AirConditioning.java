public class AirConditioning implements HomeService{
 @Override
    public void turnOn() {
       System.out.println("The aircon has been turned on!");
    }

    @Override
    public void turnOff() {
        System.out.println("The aircon has been turned off!");
    }
    
    
}
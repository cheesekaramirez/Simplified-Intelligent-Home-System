public class TV implements HomeService{

    @Override
    public void turnOn() {
       System.out.println("The TV has been turned on!");
    }

    @Override
    public void turnOff() {
        System.out.println("The TV has been turned off!");
    }
    
}
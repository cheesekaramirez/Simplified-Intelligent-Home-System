public class HomeInterface {
    Light l;
    TV tv;
    AirConditioning aircon;

    public HomeInterface(Light l, TV tv, AirConditioning aircon){
        this.l =l;
        this.tv= tv;
        this.aircon = aircon;
    }

    public void turnOnLight(){
        l.turnOn();
    }

    public void turnOffLight(){
        l.turnOff();
    }

    public void turnOnTV(){
        tv.turnOn();
    }

    public void turnOffTV(){
        tv.turnOff();
    }

    public void turnOnAircon(){
        aircon.turnOn();
    }

    public void turnOffAircon(){
        aircon.turnOff();
    }


    public void turnOnAll() {
        l.turnOn();
        tv.turnOn();
        aircon.turnOn();
    }

    public void turnOffAll() {
        l.turnOff();
        tv.turnOff();
        aircon.turnOff();
    }
    
}
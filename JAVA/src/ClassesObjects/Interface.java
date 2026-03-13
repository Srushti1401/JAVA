package ClassesObjects;

interface SmartDevice{
    void turnOn();
    void turnOff();
}

class SmartLight implements SmartDevice{

    public void turnOn(){
        System.out.println("Light On");
    }

    public void turnOff(){
        System.out.println("Light Off");
    }
}

public class Interface{
    public static void main(String[] args){
        SmartLight l=new SmartLight();
        l.turnOn();
        l.turnOff();
    }
}
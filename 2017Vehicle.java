
public class TestVehicle {
    public static void main()
    {
        Vehicle ship = new Ship();
        ship.transportMode();
        Vehicle vehicle = new Vehicle();
        vehicle.transportMode();
        Vehicle plane = new Plane();        
        plane.transportMode();
    } 
}

class Vehicle
{
    public String toString()
    {
        return "vehicle";
    }
    
    final void transportMode()
    {
        if ( this.toString().equals("ship") )
            System.out.println("travels in water only");
            
        if ( this.toString().equals("vehicle") )
            System.out.println("travels on land only");
        
        if ( this.toString().equals("plane") )
            System.out.println("travels in air only");
    }
}

class Plane extends Vehicle
{
    public String toString()
    {
        return "plane";
    }

}

class Ship extends Vehicle
{
    public String toString()
    {
        return "ship";
    }
}

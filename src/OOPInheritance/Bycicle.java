package OOPInheritance;

public class Bycicle extends Vehicle{
    //attributes:
    int speed = 30;
    int wheels = 2;
    int pedals = 2;

    //methods:
    // this subclass is giving her own implemention on the vehicle's method, because of that we use @override
    @Override
    void go(){
        System.out.println("This Bycicle is moving!");
    }

    @Override
    void stop(){
        System.out.println("This Bycicle is stopped!");
    }
}

package OOPInheritance;

public class Car extends Vehicle {
    // attributes
    int speed = 240;
    int wheels = 4;
    int doors = 4;

    //methods:
    // this subclass is giving her own implemention on the vehicle's method, because of that we use @override
    @Override
    void go(){
        System.out.println("This Car is moving!");
    }

    @Override
    void stop(){
        System.out.println("This Car is stopped!");
    }
}

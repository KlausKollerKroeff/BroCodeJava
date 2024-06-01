package OOPInheritance;

public class Main {
    public static void main (String[] args){

        // inheritance = 	the process where one class acquires,
        //					the attributes and methods of another.

        //instanciando
        Car myCar = new Car();
        Bycicle myBycicle = new Bycicle();

        myCar.go();
        myBycicle.go();

        System.out.println(myCar.doors);
        System.out.println(myBycicle.wheels);

    }
}

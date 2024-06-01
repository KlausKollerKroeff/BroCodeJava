package OOPInheritance;

public class Main {
    public static void main (String[] args){

        //instanciando
        Car myCar = new Car();
        Bycicle myBycicle = new Bycicle();

        myCar.go();
        myBycicle.go();

        System.out.println(myCar.doors);
        System.out.println(myBycicle.wheels);

    }
}

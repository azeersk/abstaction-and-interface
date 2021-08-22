public abstract class AbstractionOne {
    abstract void vehicle(int s);
    public String drive(){
        return "please go slow your family is waiting for you.";
    }
}
class Car extends AbstractionOne{
    public void vehicle(int a){
        System.out.println("car starts with kye!");
        System.out.println(a);
    }


}
class scooter extends AbstractionOne{
    public void vehicle(int r){
        System.out.println("Scooter starts with kick.");
        System.out.println(r);
    }
}

class Vehicle{
    public static void main(String[] args){
        Car objOf = new Car();
        objOf.vehicle(25);
        System.out.println(objOf.drive());
        scooter objOf2 = new scooter();
        objOf2.vehicle(45);
        objOf.vehicle(22);
        objOf2.vehicle(12);
        System.out.println(objOf2.drive());
    }
}

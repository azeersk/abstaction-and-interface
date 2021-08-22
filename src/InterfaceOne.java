interface InterfaceOne {
    void Vehicle();


}
interface InterfaceTwo{
    void model();
}
class VehicleOf implements InterfaceOne,InterfaceTwo{
    public void Vehicle(){
        System.out.println("go slow");
    }
    public void model(){
        System.out.println("R15");
    }
}
class MainVehicle{
    public static void main(String[] args){
        VehicleOf obj = new VehicleOf();
        obj.Vehicle();
        obj.model();
        System.out.println("successfully done. ");
    }
}
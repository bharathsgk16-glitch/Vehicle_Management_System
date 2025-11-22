public class Bike extends Vehicle{
    private int cc;
    public Bike(String model,String brand,double price,int cc){
       super(model,brand,price);
        this.cc=cc;
    }
    public void display(){
        super.display();
        System.out.println("CC: "+cc);
    }
}

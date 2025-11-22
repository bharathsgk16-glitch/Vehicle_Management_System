public class Car extends Vehicle {
    private String fullType;
    public Car(String model,String brand,double price,String fullType){
        super(model, brand, price);
        this.fullType=fullType;

    }
    public void display(){
        super.display();
        System.out.println("Fuel: "+fullType);
    }
}

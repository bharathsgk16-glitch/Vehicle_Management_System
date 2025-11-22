public class Vehicle{
    protected String model,brand;
    protected double price;
    public Vehicle(String model,String brand,double price){
        this.model=model;
        this.brand=brand;
        this.price=price;

    }
    public void display(){
        System.out.println("Brand: "+brand+",Model: "+model+",Price: "+price);
    }
}
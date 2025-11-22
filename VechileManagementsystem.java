

import java.util.*;


public class VechileManagementsystem {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    List<Vehicle> list=new ArrayList<>();
    while (true) {
        System.out.println("1 Add Car 2 Add Bike 3 View All 0 Exit" );
        int ch=sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Brand: ");
                String brand=sc.nextLine();
                sc.next();
                System.out.println("Model: ");
                String model=sc.nextLine();
                sc.next();
                System.out.println("Price: ");
                double price=sc.nextDouble();
                sc.next();
                System.out.println("Fuel Type: ");
                String fullType=sc.nextLine();
                list.add(new Car(model, brand, price, fullType));
                break;
                case 2:
                     System.out.println("Brand: ");
                brand=sc.nextLine();
                System.out.println("Model: ");
                 model=sc.nextLine();
                System.out.println("Price: ");
                 price=sc.nextDouble();
                System.out.println("CC: ");
                int cc=sc.nextInt();
                 list.add(new Bike(model, brand, price, cc));
                 break;
                case 3:
                 list.forEach(Vehicle::display);
                 break;
                 case 0:System.exit(0);
            default:
                break;
        }
    }
}
    
}
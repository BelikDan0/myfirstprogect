import java.util.Scanner;

public class RoadController {
    private static int passengerCarMaxWeight = 3500;
    private static int cargoCarMaxWeight = 30_000; //kg
    private static int passengerCarMaxHeight = 2000;
    private static int controllerMaxHeight = 4000; //mm
    private static int passengerCarPrice = 3000;
    private static int cargoCarPrice = 4000; //rub
    private static int vehicleAdditionalPrice = 200;


    public static void main(String[] args) {
        System.out.print("Введите количество автомобилей:");
        int count = new Scanner(System.in).nextInt();
        for (int i = 0; i < count; i++) {
            Car car =Camera.getNextCar();
            System.out.println(car);
            int curerentPrice=calculetarPrice(car);
            if(curerentPrice==-1){
                continue;
            }
            System.out.println("Price: " + curerentPrice);
        }
    }
    private static  int calculetarPrice(Car car){
        int price = -1;

        if (car.getHeight()>=controllerMaxHeight){
            System.out.println("Height your car very big sorry(");
            return price;

        }
        if(car.getWeight()>passengerCarMaxWeight){
            price = cargoCarPrice;
            if (car.isHasVehicle()) {
                price += vehicleAdditionalPrice;
                System.out.println("your car very heavy so have to give "+price+" RUB");
            }

        }else if(car.getWeight()>600 && car.getWeight()==cargoCarMaxWeight){
            price=passengerCarPrice;
            System.out.println("Price:"+price);
        }
        return price;
    }
}
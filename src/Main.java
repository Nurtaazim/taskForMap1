import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(GeneradId.generateId(), "07kg007nur");
        Car car2 = new Car(GeneradId.generateId(), "05kg005nur");
        Car car3 = new Car(GeneradId.generateId(), "07kg005mnn");
        CarInfo carInfo1 = new CarInfo("Mercedes", 2023, "black" , BigDecimal.valueOf(100000));
        CarInfo carInfo2 = new CarInfo("Toyota", 2023, "black" , BigDecimal.valueOf(100000));
        CarInfo carInfo3 = new CarInfo("BMW", 2023, "black" , BigDecimal.valueOf(100000));

        Map<Car, CarInfo> carCarInfoMap = new HashMap<>();
        carCarInfoMap.put(car1, carInfo1);
        carCarInfoMap.put(car2, carInfo2);
        carCarInfoMap.put(car3, carInfo3);
        System.out.println(carCarInfoMap.entrySet());
    }
}
package web.services;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {

    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<Car>();
        cars.add(new Car(1,"Tesla",2020));
        cars.add(new Car(2,"BMW",2022));
        cars.add(new Car(3,"Ford",2021));
        cars.add(new Car(4,"KIA",2019));
        cars.add(new Car(5,"Toyota",2024));
    }

    public List<Car> getCars(int count) {
        if (count > cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }

    public List<Car> getAllCars() {
        return cars;
    }
}

package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;

@Component
public class CarServiceImpl implements CarService {

    private ArrayList<Car> cars = new ArrayList<>(5);

    {
        cars.add(new Car(1L, "Renault", "Logan"));
        cars.add(new Car(2L, "Nissan", "Kaptur"));
        cars.add(new Car(3L, "Renault", "Logan2"));
        cars.add(new Car(4L, "UAZ", "Patriot"));
        cars.add(new Car(5L, "Renault", "Logan3"));
    }

    @Override
    public ArrayList<Car> getLimitCarList(int count) {
        return (count >= 0 && count <= 5) ? (ArrayList<Car>) cars.subList(0, count) : cars;
    }
}

package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<>(5);

    {
        cars.add(new Car(1, "Renault", "Logan"));
        cars.add(new Car(2, "Nissan", "Kaptur"));
        cars.add(new Car(3, "Renault", "Logan2"));
        cars.add(new Car(4, "UAZ", "Patriot"));
        cars.add(new Car(5, "Renault", "Logan3"));
    }

    @Override
    public List<Car> getLimitCarList(int count) {
        return (count >= 0 & count <= 5) ? cars.subList(0, count) : cars;
    }
}

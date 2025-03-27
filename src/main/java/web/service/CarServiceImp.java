package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Component
public class CarServiceImp implements CarService {

    private final List<Car> cars;

    public CarServiceImp() {
        this.cars = new ArrayList<>() {{
            add(new Car("Tesla Model-X, 2017", "100000 km", 30000));
            add(new Car("Kia Optima, 2020", "170400 km", 25000));
            add(new Car("Toyota Supra, 2004", "320800 km", 32000));
            add(new Car("lamborghini Aventador, 2018", "7460 km", 400000));
            add(new Car("Kia Sportage 3, 2015", "148700 km", 20000));
        }};
    }

    @Override
    public List<Car> getListCarsFromCount(int count) {
        return this.cars.subList(0, count >= this.cars.size() ? this.cars.size() : Math.abs(count));
    }

}

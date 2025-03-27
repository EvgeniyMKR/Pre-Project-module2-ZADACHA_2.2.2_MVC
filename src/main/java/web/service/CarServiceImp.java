package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Component
public class CarServiceImp implements CarService {
    @Override
    public List<Car> getListCarsFromCount(List<Car> cars, int count) {

        if (count >= cars.size()) {
            return cars;
        } else if (count > 0) {
            List<Car> resultList = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                resultList.add(cars.get(i));
            }
            return resultList;
        }
        return Collections.EMPTY_LIST;
    }

}

package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    CarService carService;

    @Autowired
    public CarController(@Qualifier("carServiceImp") CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String printListCars(@RequestParam("count") int count, ModelMap model ) {

        List<Car> listCars = new ArrayList<>() {{
            add(new Car("Tesla Model-X, 2017", "100000 km", 30000));
            add(new Car("Kia Optima, 2020", "170400 km", 25000));
            add(new Car("Toyota Supra, 2004", "320800 km", 32000));
            add(new Car("lamborghini Aventador, 2018", "7460 km", 400000));
            add(new Car("Kia Sportage 3, 2015", "148700 km", 20000));

        }};

        model.addAttribute("listCars",carService.getListCarsFromCount(listCars, count));

        return "car"; // имя представления
    }
}

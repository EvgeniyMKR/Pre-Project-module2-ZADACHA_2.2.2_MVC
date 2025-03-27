package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    // value - шаблон запроса, это значит что данный контролер примет запрос, который соответсвует /, тоесть абсолютно любой
    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("-----АВТОСАЛОН \"SpringMVC\"-----");
        messages.add("Автомобили в наличии и под заказ!");
        messages.add("Контакты: email @JavaSpring.com");
        model.addAttribute("messages", messages);
        return "index"; // имя представления

        //данный метод возвращает пользователю представление, которое лежит в папке webapp/WEB-INF/pages/index.html
    }

}
package pl.walaszek.thymeleafcar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    public List<Car> cars;

    public CarController() {
        Car car1=new Car("M3","BMW");
        Car car2=new Car("M2","BMW");
        Car car3=new Car("3","Mazda");
        Car car4=new Car("A3","Audi");
        cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
    }

    @GetMapping("/car")
    public String getCar(Model model){
        model.addAttribute("cars",cars);
        model.addAttribute("newCar",new Car());
        return "car";
    }

    @PostMapping("/add-car")
    public String addCar(@ModelAttribute Car car){
        cars.add(car);
        return "redirect:/car";
    }

}

package pl.walaszek.thymeleafcar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/car")
    public String getCar(Model model){
        Car car1=new Car("M3","BMW");
        Car car2=new Car("M2","BMW");
        Car car3=new Car("3","Mazda");
        Car car4=new Car("A3","Audi");
        List<Car> cars = Arrays.asList(car1,car2,car3,car4);

        model.addAttribute("cars",cars);

        return "car";
    }

}

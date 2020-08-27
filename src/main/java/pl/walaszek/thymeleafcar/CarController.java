package pl.walaszek.thymeleafcar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {

    @GetMapping("/car")
    public String getCar(Model model){
        Car car=new Car("M3","BMW");
        model.addAttribute("car",car);
        return "car";
    }

}

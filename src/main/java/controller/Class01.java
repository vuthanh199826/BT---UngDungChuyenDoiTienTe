package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Class01 {
    @PostMapping("/hello")
    public String func1(@RequestParam double num,String type, Model model){
        String s1 = null;
        String s2 = null;
        double kq =0 ;
            switch (type){
                case "toUSD":
                    kq = num / 23000;
                    s1 = "VND";
                    s2 = "USD";
                    break;
                case "toVND":
                    kq = num * 23000;
                    s1 = "USD";
                    s2 = "VND";
                    break;
            }
            model.addAttribute("kq",kq);
            model.addAttribute("num", num);
            model.addAttribute("s1",s1);
            model.addAttribute("s2",s2);
        return "index1";
    }
}

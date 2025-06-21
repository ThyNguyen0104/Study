package com.baothy.coffee.controller.web;

import com.baothy.coffee.entity.Coffee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //1 bean đc new từ đầu bởi Container chuyên trar lời các http request đến từ url của trình duyệt của user
//có nhìu url khác nhau, thì ứng vs nhìu hàm trong class này
//các hàm trả về html, trang web lung linh
public class CoffeeWebController {

    @GetMapping("/") //user gõ localhost::6969/ nghĩa là nhảy đến hàm này
    public String home(Model model){
        model.addAttribute("cup1", "Cafe Java đậm đà vị Genshin");
        model.addAttribute("cup2",new Coffee("JC","Cafe Java mướt mượt Genshin",29_000));
        return "index"; //tar về tên trang cho trình duyệt
    }
}

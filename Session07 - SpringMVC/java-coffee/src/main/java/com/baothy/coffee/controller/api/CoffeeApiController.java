package com.baothy.coffee.controller.api;

import com.baothy.coffee.entity.Coffee;
import org.springframework.web.bind.annotation.*;

@RestController //phuc vụ các url mà muốn data thô, trả về json or nhận jsson từ
@RequestMapping("/api/v1")
public class CoffeeApiController {
    @GetMapping("/cup") //localhost:6969/api/v1/cup
    public Coffee getACup(){
        return new Coffee("JCNT","Cafe Java topping lung linh Genshin Impact",29_000);
    }
    @PostMapping("/add")
    public Coffee addACup(@RequestBody Coffee cup){
        //sửa object đã nhận, xong trả về
        String oldName = cup.getName();
        String newName = oldName + " | Wibu never die, I love Genshin";;
        cup.setName("newName");
        return cup;
    }
}

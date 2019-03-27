package com.zxy.bookmark;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author yang.zhou
 * @date 2019/3/13
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String getUsers(){
        return "Hello Spring!";
    }


}

package com.xinzheng.mq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MqController {
	 @RequestMapping(value = "/main")
     public String index() {
        return "main";
     }

}

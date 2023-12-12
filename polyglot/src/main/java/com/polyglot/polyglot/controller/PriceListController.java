package com.polyglot.polyglot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PriceListController {

    @GetMapping("/priceList")
    public String priceList(){
        return "priceList";
    }
}

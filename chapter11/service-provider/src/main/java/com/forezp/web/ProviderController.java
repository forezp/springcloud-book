package com.forezp.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by forezp on 2017/7/2.
 */
@RestController
public class ProviderController {
    @GetMapping("/provider")
    public String provider(){
        return "hi, I'm provider ,from 8762";
    }

}

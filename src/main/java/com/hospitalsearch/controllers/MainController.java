package com.hospitalsearch.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;


/**
 * Created by speedfire on 4/28/16.
 */

@Controller
public class MainController {

    @RequestMapping(value = "/{Bla}",method = RequestMethod.GET)
    public String index(Map<String,Object> model,@PathVariable(value="Bla")String q){
        model.put("q",q);
        return  "index";
    }



}

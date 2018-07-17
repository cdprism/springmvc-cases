package org.shancm.springmvc.convert.controller;

import org.shancm.springmvc.convert.entity.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author shancm
 * @pachage org.shancm.springmvc.controller
 * @description:
 * @date 2018/6/12
 */
@RestController
@RequestMapping(value = "/convert")
public class EntranceControl {



    /*@RequestMapping(value = "/index")
    public String index(){
        return "convert";
    }*/

    @RequestMapping(value = "/index")
    public ModelAndView postPerson(Person person){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("person");
        return modelAndView;
    }


}

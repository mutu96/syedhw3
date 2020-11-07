package com.syedcoolapphw3.syedhw3.Controllers;
import com.syedcoolapphw3.syedhw3.Models.EventsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

   /* @GetMapping("/")
    public String home(){
        return "index";
    }*/

    @Autowired
    EventsRepo EventsRepo;

    @RequestMapping("/")
    public ModelAndView doHome(){
        //calling index.jsp for html page
        ModelAndView mv = new ModelAndView("index");
        //calling information from Events table
      mv.addObject("Eventslist", EventsRepo.findAll());
        return mv;
    }


}
package jp.co.oasys.sample.motocatalog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MotoController {

  @RequestMapping("/test")
  public String test(@RequestParam String name, Model model) {
    model.addAttribute("name", name);
    return "test";
  }
  
}

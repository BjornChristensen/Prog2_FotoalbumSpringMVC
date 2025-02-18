package org.example.fotoalbumspringmvc.controller;

import org.example.fotoalbumspringmvc.repository.BridgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  @Autowired
  BridgeRepository bridgeRepository;

  @GetMapping("/")
  public String gethome(Model model) {
    System.out.println("gethome()");
    System.out.println(bridgeRepository.getAllBridges());
    model.addAttribute("bridgeList", bridgeRepository.getAllBridges());
    return "home";
  }
}

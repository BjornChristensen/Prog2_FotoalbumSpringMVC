package org.example.fotoalbumspringmvc.controller;

import org.example.fotoalbumspringmvc.model.Bridge;
import org.example.fotoalbumspringmvc.repository.BridgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BridgeController {
    @Autowired
    BridgeRepository bridgeRepository;

    @GetMapping("/bridge")
    public String showBridge(@RequestParam("name") String name, Model model) {
        System.out.println("showBridge " + name);
        Bridge bridge=bridgeRepository.getBridge(name);
        if(bridge!=null) {
            model.addAttribute("bridge", bridge);
        }
        System.out.println(bridge);
        return "bridge";
    }
}

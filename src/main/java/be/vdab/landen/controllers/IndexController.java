package be.vdab.landen.controllers;

import be.vdab.landen.services.LandService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

@Controller
@RequestMapping("/")
class IndexController {
    private final LandService landService;

    public IndexController(LandService landService) {
        this.landService = landService;
    }

    @GetMapping
    public ModelAndView index() {
        return new ModelAndView("index", "aantalLanden", landService.findAantal());
    }
}

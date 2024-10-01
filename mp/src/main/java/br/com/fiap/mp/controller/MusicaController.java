package br.com.fiap.mp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/music") // localhost:8080/musicd
public class MusicaController {

    @GetMapping
    public String music(Model model){
        model.addAttribute("nome", "Molly");
        return "I feel sorrow no more\n" +
                "The calm after the storm\n" +
                "And peace belongs to me\n" +
                "\n" +
                "Until my tears run dry\n" +
                "And clouds fall from the sky\n" +
                "And all my fears, they disappear\n" +
                "And I see silver lines\n" +
                "\n" +
                "Oh-oh-oh-oh, oh\n" +
                "Oh-oh-oh-oh, oh\n" +
                "\n" +
                "A smile, I welcome you\n" +
                "A darkness, I've long forgotten you, yeah\n" +
                "And peace belongs to me\n" +
                "\n" +
                "Until my tears run dry\n" +
                "And clouds fall from the sky\n" +
                "And all my fears, they disappear\n" +
                "And I see silver lines\n" +
                "\n" +
                "Oh-oh-oh-oh, oh\n" +
                "Oh-oh-oh-oh, oh\n" +
                "\n" +
                "Look at those light rays, no dark days anymore\n" +
                "Looking alive, ain't no zombies anymore\n" +
                "Don't need no battles\n" +
                "Ain't tryna start no war\n" +
                "'Cause peace belongs to me\n" +
                "\n" +
                "Oh-oh-oh-oh, oh\n" +
                "Oh-oh-oh-oh, oh";
    }
}

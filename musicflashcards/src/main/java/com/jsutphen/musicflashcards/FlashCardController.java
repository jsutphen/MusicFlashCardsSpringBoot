package com.jsutphen.musicflashcards;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FlashCardController {

    @ModelAttribute("response")
    public Response getResponse() {
        return new Response(flashCardService.getCurrentFlashCard(), "");
    }

    @ModelAttribute("feedback")
    public String getFeedback() {
        return " ";
    }

    @Autowired
    private FlashCardService flashCardService;

    @GetMapping("/flashcard")
    public String showFlashCard(Model model) {
        flashCardService.setCurrentFlashCard(flashCardService.getRandomFlashCard());
        model.addAttribute("flashCard", flashCardService.getCurrentFlashCard());
        model.addAttribute("feedback", " ");
        return "flashCards";
    }

    @PostMapping("/flashcard")
    public String checkAnswer(Response response, Model model) {
        String feedback;
        if(response.isCorrect()) {
            feedback = "Richtig!";
        } else {
            feedback = "Falsch!";
        }
        model.addAttribute("flashCard", flashCardService.getCurrentFlashCard());
        model.addAttribute("feedback", feedback);
        return "flashCards";

    }
}

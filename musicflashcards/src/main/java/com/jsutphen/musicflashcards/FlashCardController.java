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

    @ModelAttribute("submitButtonDisabled")
    public boolean getSubmitButtonStatus() {
        return false;
    }

    @ModelAttribute("submitButtonColor")
    public String getSubmitButtonColor(){
        return "neutral";
    }

    @Autowired
    private FlashCardService flashCardService;

    @GetMapping("/flashcard")
    public String showFlashCard(Model model) {
        flashCardService.setCurrentFlashCard(flashCardService.getRandomFlashCard());
        model.addAttribute("flashCard", flashCardService.getCurrentFlashCard());
        model.addAttribute("feedback", "Überprüfen");
        return "flashCards";
    }

    @PostMapping("/flashcard")
    public String checkAnswer(Response response, Model model) {
        String feedback;
        String color;
        if(response.isCorrect()) {
            feedback = "Richtig!";
            color = "green";
        } else {
            feedback = "Falsch!";
            color = "red";
        }
        model.addAttribute("flashCard", flashCardService.getCurrentFlashCard());
        model.addAttribute("feedback", feedback);
        model.addAttribute("submitButtonDisabled", true);
        model.addAttribute("submitButtonColor", color);
        return "flashCards";

    }
}

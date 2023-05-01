package com.jsutphen.musicflashcards;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FlashCardService {
    private static List<FlashCard> flashCards = new ArrayList<>();

    private FlashCard currentFlashCard;

    public FlashCardService() {
        // add flashcards E2 through g5
        flashCards.add(new FlashCard("Wie heißt diese Note?", "E", "E2.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "F", "F2.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "G", "G2.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "A", "A2.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "H", "H2.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "C", "C3.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "D", "D3.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "E", "E3.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "F", "F3.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "G", "G3.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "A", "A3.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "H", "H3.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "C", "C4.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "C", "C4v.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "D", "D4.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "E", "E4.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "F", "F4.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "G", "G4.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "A", "A4.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "H", "H4.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "C", "C5.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "D", "D5.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "E", "E5.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "F", "F5.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "G", "G5.png"));
        currentFlashCard =  getRandomFlashCard();
    }

    public Iterable<FlashCard> getFlashCards() {
        return flashCards;
    }

    public FlashCard getRandomFlashCard() {
        int randomIndex = (int) (Math.random() * flashCards.size());
        return flashCards.get(randomIndex);
    }

    public boolean checkAnswer(String answer) {
        return currentFlashCard.getAnswer().equalsIgnoreCase(answer);
    }

    public String getFeedback(FlashCard flashCard, String answer) {
        if (checkAnswer(answer)) {
            return "Richtig!";
        } else {
            return "Falsch!";
        }
    }

    public FlashCard getCurrentFlashCard() {
        return currentFlashCard;
    }

    public void setCurrentFlashCard(FlashCard currentFlashCard) {
        this.currentFlashCard = currentFlashCard;
    }
}

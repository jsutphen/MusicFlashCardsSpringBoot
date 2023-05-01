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
        flashCards.add(new FlashCard("Wie heißt diese Note?", "C", "c3.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "D", "d3.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "E", "e3.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "F", "f3.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "G", "g3.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "A", "a3.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "H", "h3.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "C", "c4.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "C", "c4v.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "D", "d4.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "E", "e4.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "F", "f4.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "G", "g4.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "A", "a4.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "H", "h4.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "C", "c5.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "D", "d5.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "E", "e5.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "F", "f5.png"));
        flashCards.add(new FlashCard("Wie heißt diese Note?", "G", "g5.png"));
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

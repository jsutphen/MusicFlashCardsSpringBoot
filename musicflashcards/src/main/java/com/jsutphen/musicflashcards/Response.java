package com.jsutphen.musicflashcards;

public class Response {
    private FlashCard flashCard;
    private String answer;

    public Response(FlashCard flashCard, String answer) {
        this.flashCard = flashCard;
        this.answer = answer;
    }

    public FlashCard getflashCard() {
        return this.flashCard;
    }

    public String getAnswer() {
        return this.answer;
    }

    public boolean isCorrect() {
        return this.flashCard.getAnswer().equalsIgnoreCase(this.answer);
    }

    public void setFlashCard(FlashCard flashCard) {
        this.flashCard = flashCard;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

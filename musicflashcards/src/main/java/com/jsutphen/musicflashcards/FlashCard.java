package com.jsutphen.musicflashcards;

public class FlashCard {
    private String question;
    private String answer;
    private String imageFileName;
    
    public FlashCard(String question, String answer, String imageFileName) {
        this.question = question;
        this.answer = answer;
        this.imageFileName = imageFileName;
    }
    
    public String getQuestion() {
        return question;
    }
    
    public String getAnswer() {
        return answer;
    }

    public String getImageFileName() {
        return imageFileName;
    }
}

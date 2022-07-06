package com.example.victor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
class EmailClient {
    private SpellChecker spellChecker;

    EmailClient(){}

    void sendEmail(String emailMessage) {
        spellChecker.checkSpelling(emailMessage);
        // Logic to Send Email
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    @Autowired
    public void setSpellChecker(@Qualifier("basicSpellChecker") SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }
}

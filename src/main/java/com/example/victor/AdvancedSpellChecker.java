package com.example.victor;

import org.springframework.stereotype.Component;

@Component
public class AdvancedSpellChecker implements SpellChecker{
    @Override
    public void checkSpelling(String mensaje) {
        if (mensaje != null) {
            // Determining the Language of the email Message
            // Check grammatical errors in the email Message
            // Check spellings in the email Message
            System.out.println("Checking Spelling using Advanced Spell Checker..");
            System.out.println("Spell Checking Completed!!");

        } else {
            throw new RuntimeException("An exception occurred while checking Spelling");
        }
    }
}

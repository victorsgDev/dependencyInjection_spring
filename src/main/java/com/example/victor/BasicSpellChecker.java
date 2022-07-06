package com.example.victor;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class BasicSpellChecker implements SpellChecker{
    @Override
    public void checkSpelling(String mensaje) {
        if (mensaje != null) {
            System.out.println("Checking spelling using BasicSpellChecker...");
            System.out.println("Spell Checking Completed!!");
        } else {
            throw new RuntimeException("An exception occurred " +
                    "while checking Spelling");
        }
    }
}

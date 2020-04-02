package org.example;

public class PhoneValidator implements Validator {
    public boolean isValid(String value) {
//        return value.matches("^[+]?[0-9()-]{6,}$");
        return value.matches("^((\\+?\\d{1,3})[- ]?)?([(| |-]\\d{2,4}[)| |-])?[\\d\\- ]{6,12}(\\(([а-я.]*\\s?)?\\d{2,3}\\))?$");
    }
}

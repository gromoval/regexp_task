package org.example;

public class DoubleValidator implements Validator {
    public boolean isValid(String value) {
        return value.matches("^[-+]?[0-9_]*\\.?[0-9_]*[d_]?$");
    }
}

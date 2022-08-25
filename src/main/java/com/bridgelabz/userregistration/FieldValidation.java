package com.bridgelabz.userregistration;

@FunctionalInterface
public interface FieldValidation {
    boolean isValid(String input);
}
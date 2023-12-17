package com.vidoje.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class MinMaxUpdateValidator implements ConstraintValidator<MinMaxUpdate, ValidationRequestDto> {

    @Autowired
    private ValidationService validationService;

    @Override
    public boolean isValid(ValidationRequestDto value, ConstraintValidatorContext context) {
        validationService.get().forEach(System.out::println);
        if (value.getMax() > 10) {
            return false;
        } else {
            return true;
        }
    }
}

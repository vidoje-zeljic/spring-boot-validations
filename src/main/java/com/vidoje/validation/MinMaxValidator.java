package com.vidoje.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class MinMaxValidator implements ConstraintValidator<MinMax, ValidationRequestDto> {

    @Autowired
    private ValidationService validationService;

    @Override
    public boolean isValid(ValidationRequestDto value, ConstraintValidatorContext context) {
        validationService.get().forEach(System.out::println);
        if (value.getMin() < 1) {
            return false;
        } else {
            return true;
        }
    }
}

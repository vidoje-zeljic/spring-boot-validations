package com.vidoje.validation.validation;

import com.vidoje.validation.dto.ValidationRequestDto;
import com.vidoje.validation.service.ValidationService;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class MinMaxCreateValidator implements ConstraintValidator<MinMaxCreate, ValidationRequestDto> {

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

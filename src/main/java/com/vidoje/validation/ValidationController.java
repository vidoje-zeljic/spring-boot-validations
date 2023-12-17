package com.vidoje.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ValidationController {

    @Autowired
    private ValidationService validationService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ValidationRequestDto> get() {
        return validationService.get();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void post(ValidationRequestDto requestDto) {
        validationService.post(requestDto);
    }
}

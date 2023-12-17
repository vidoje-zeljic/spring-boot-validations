package com.vidoje.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
    public void post(@RequestBody ValidationRequestDto requestDto) {
        validationService.post(requestDto);
    }
}

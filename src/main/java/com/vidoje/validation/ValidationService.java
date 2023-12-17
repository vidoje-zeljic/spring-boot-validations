package com.vidoje.validation;

import jakarta.validation.Valid;

import java.util.List;

public interface ValidationService {
    List<ValidationRequestDto> get();

    void post(@Valid ValidationRequestDto requestDto);
}

package com.vidoje.validation.service;

import com.vidoje.validation.dto.ValidationRequestDto;
import jakarta.validation.Valid;

import java.util.List;

public interface ValidationService {
    List<ValidationRequestDto> get();

    void post(@Valid ValidationRequestDto requestDto);
}

package com.vidoje.validation;

import java.util.List;

public interface ValidationService {
    List<ValidationRequestDto> get();

    void post(ValidationRequestDto requestDto);
}

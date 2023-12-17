package com.vidoje.validation;

import lombok.Data;

@Data
public class ValidationRequestDto {
    private String name;
    private int min;
    private int max;
}

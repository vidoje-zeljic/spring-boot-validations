package com.vidoje.validation;

import jakarta.validation.constraints.Max;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MinMax
public class ValidationRequestDto {
    private String name;
    private int min;
    @Max(10)
    private int max;
}

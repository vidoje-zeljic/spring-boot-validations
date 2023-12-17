package com.vidoje.validation;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValidationRequestDto {
    private String name;
    @Min(1)
    private int min;
    @Max(10)
    private int max;
}

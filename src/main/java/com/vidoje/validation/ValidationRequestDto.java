package com.vidoje.validation;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MinMaxCreate(groups = OnCreate.class)
@MinMaxUpdate(groups = OnUpdate.class)
public class ValidationRequestDto {
    private String name;
    private int min;
    @Min(value = 5, groups = OnCreate.class)
    private int max;
    @Valid
    private ValidationSubRequestDto sub;
}

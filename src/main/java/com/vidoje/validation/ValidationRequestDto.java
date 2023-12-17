package com.vidoje.validation;

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
    private int max;
}

package com.vidoje.validation.dto;

import com.vidoje.validation.validation.OnCreate;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValidationSubRequestDto {
    @Min(value = 5, groups = OnCreate.class)
    private int max;
}

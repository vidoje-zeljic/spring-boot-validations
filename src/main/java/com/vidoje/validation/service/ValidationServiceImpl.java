package com.vidoje.validation.service;

import com.vidoje.validation.validation.OnCreate;
import com.vidoje.validation.dto.ValidationRequestDto;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

@Validated
@Service
public class ValidationServiceImpl implements ValidationService {

    private List<ValidationRequestDto> list = new ArrayList<>();

    @Override
    public List<ValidationRequestDto> get() {
        return list;
    }

    @Validated(OnCreate.class)
    @Override
    public void post(@Valid ValidationRequestDto requestDto) {
        list.add(requestDto);
    }
}

package com.vidoje.validation;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ValidationServiceImpl implements ValidationService {

    private List<ValidationRequestDto> list = new ArrayList<>();

    @Override
    public List<ValidationRequestDto> get() {
        return list;
    }

    @Override
    public void post(ValidationRequestDto requestDto) {
        list.add(requestDto);
    }
}

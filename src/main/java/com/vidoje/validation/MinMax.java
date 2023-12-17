package com.vidoje.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ ElementType.TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = MinMaxValidator.class)
@Documented
public @interface MinMax {

    String message() default "{min/max}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
package com.social_x.validation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DateValidator implements ConstraintValidator<ValidateDate, LocalDate> {

  @Override
  public void initialize(ValidateDate constraintAnnotation) {
    ConstraintValidator.super.initialize(constraintAnnotation);
  }

  @Override
  public boolean isValid(LocalDate value, ConstraintValidatorContext context) {

    if (value == null) {
      // Giả sử null không được chấp nhận, bạn có thể điều chỉnh tùy theo yêu cầu
      return false;
    }

    try {
      // Sử dụng DateTimeFormatter thay vì SimpleDateFormat
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
      value.format(formatter); // Kiểm tra định dạng của LocalDate
      return true;
    } catch (Exception e) {
      System.out.println("error" + e);
      return false;

    }
  }
}

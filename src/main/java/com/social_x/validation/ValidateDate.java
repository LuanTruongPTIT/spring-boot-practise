package com.social_x.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.*;

/*
 * @Target mô tả nơi anntation này có thể được áp dụng.Trong trường hợp này 
 * có thể áp dụng cho trường FIELD hoặc tham số của phương thức Parameter
 */

@Target({ FIELD, PARAMETER })
@Retention(RUNTIME)
@Constraint(validatedBy = DateValidator.class)
@Documented
public @interface ValidateDate {
  String message() default "Date mus be follow dd/mm/yyyy";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}

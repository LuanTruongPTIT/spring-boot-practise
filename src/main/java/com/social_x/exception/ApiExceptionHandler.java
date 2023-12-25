package com.social_x.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import com.social_x.viewmodel.ErrorVm;
import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {
  private static final String ERROR_LOG_FORMAT = "Error: URI: {}, ErrorCode: {}, Message: {}";

  @ExceptionHandler(ExistException.class)
  public ResponseEntity<ErrorVm> handleExistException(ExistException ex, WebRequest request) {
    System.out.println("Handle Exception Check Exist");
    String message = ex.getMessage();
    ErrorVm errorVm = new ErrorVm(HttpStatus.BAD_REQUEST.toString(), "Exist exception", message);
    log.warn(ERROR_LOG_FORMAT, this.getServletPath(request), 500, message);
    log.debug(ex.toString());
    return new ResponseEntity<>(errorVm, HttpStatus.BAD_REQUEST);
  }

  private String getServletPath(WebRequest webRequest) {
    ServletWebRequest servletRequest = (ServletWebRequest) webRequest;
    return servletRequest.getRequest().getServletPath();
  }
}

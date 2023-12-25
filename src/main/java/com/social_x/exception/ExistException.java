package com.social_x.exception;

import com.social_x.utils.MessageUtils;

public class ExistException extends RuntimeException {
  private String message;

  public ExistException(String errorCode, Object... var2) {
    this.message = MessageUtils.getMessage(errorCode, var2);
  }

  @Override
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}

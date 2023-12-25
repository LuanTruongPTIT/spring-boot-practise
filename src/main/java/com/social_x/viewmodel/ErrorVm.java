package com.social_x.viewmodel;

import java.util.ArrayList;
import java.util.List;

public record ErrorVm(String statusCode, String title, String message, List<String> fieldErrors) {
  public ErrorVm(String statusCode, String title, String message) {
    this(statusCode, title, message, new ArrayList<String>());
  }
}

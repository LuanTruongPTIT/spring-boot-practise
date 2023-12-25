package com.social_x.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.social_x.exception.ExistException;
// import com.social_x.exception.NotFoundException;
import com.social_x.model.UserModel;
import com.social_x.services.UserService;
import com.social_x.viewmodel.CreateUserVm;
import com.social_x.viewmodel.ErrorVm;
import com.social_x.viewmodel.response.BaseResponseSuccess;
import io.swagger.v3.oas.annotations.media.Content;
import org.springframework.web.bind.annotation.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.media.Schema;

@RestController()
@RequestMapping("/api/v1/user")
public class UserController {
  public final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping("/create-user")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Create user success", content = @Content(schema = @Schema(implementation = BaseResponseSuccess.class))),
      @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = ErrorVm.class))),
      @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = ErrorVm.class))),
  })
  public void createUser(@RequestBody CreateUserVm createUserVm) {
    System.out.println((createUserVm.location()));
    // this.userService.getStudents(createUserVm);

    int id = 123;
    // throw new ExistException(String.format("PRODUCT_NOT_FOUND", id));
  }
}

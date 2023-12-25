package com.social_x.viewmodel;

import java.time.LocalDate;

import com.social_x.validation.ValidateDate;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record CreateUserVm(@NotNull @Min(2) @Max(10) String name,

    @Schema(example = "luantruong123@gmail.com") @NotNull @Email String email,

    @Schema(example = "luantruong@L123") @NotNull @Size(min = 8, message = "Your password muse be at least 8 character") @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).*$", message = "Your password must be") String password,

    @ValidateDate LocalDate date_of_birth,

    @Schema(example = "I am Luan Truong.I want to become Backend Developer JavaSpringBoot", type = "string") @Min(2) @Max(100) String bio,

    @Schema(type = "string", example = "17 no.Street") String location,

    @Schema(type = "string", example = "luantruong123", required = false) String username) {

}

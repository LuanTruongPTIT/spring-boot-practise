package com.social_x.model;

import java.time.LocalDate;

import com.social_x.constant.UserEnumVerifyStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import io.swagger.v3.oas.annotations.media.Schema;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
@Getter
@Setter
@ToString
public class UserModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Schema(example = "luantruong")

  @Column(name = "name", nullable = false, length = 40)
  private String name;

  @Column(name = "email", unique = true)
  private String email;

  @Column(name = "password", nullable = false, length = 10)
  private String password;

  @Column(name = "date_of_birth")
  private LocalDate date_of_birth;

  @Column(name = "email_verify_token")
  private String email_verify_token;

  @Column(name = "forgot_password_token")
  private String forgot_password_token;

  @Enumerated(EnumType.ORDINAL)
  @Column(name = "verify_status")
  private UserEnumVerifyStatus verify_status;

  @Column(name = "bio")
  private String bio;

  @Column(name = "location")
  private String location;

  @Column(name = "website", unique = true)
  private String website;

  @Column(name = "username", unique = true)
  private String username;

  @Column(name = "avatar")
  private String avatar;

  @Column(name = "cover_photo")
  private String cover_photo;
}

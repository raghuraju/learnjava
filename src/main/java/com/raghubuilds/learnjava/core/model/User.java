package com.raghubuilds.learnjava.core.model;

import com.raghubuilds.learnjava.api.dto.UserDto;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="users")
@Data
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true, nullable = false)
  private String username;

  @Column(nullable = false)
  private String email;

  @Column(nullable = false)
  private String password; // hash this later

  public UserDto toDto() {
    return new UserDto(id, username, email);
  }
}

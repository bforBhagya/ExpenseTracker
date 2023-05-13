package com.bpalearning.expensetrackerapi.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class User {
    private Integer userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}

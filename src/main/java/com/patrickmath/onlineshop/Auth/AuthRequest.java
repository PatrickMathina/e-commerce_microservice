package com.patrickmath.onlineshop.Auth;

import lombok.Data;

@Data
public class AuthRequest {
    private String username;
    private String password;
}

package com.scalers.scalerbackendprojectkafkaoauth.services;

import com.scalers.scalerbackendprojectkafkaoauth.models.Token;
import com.scalers.scalerbackendprojectkafkaoauth.models.User;

public interface UserService {
    Token login(String email, String password);

    User signUp(String name, String email, String password);

    User validateToken(String tokenValue);

    void logout(String tokenValue);
}

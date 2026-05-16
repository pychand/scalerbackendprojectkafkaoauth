package com.scalers.scalerbackendprojectkafkaoauth.dtos;

import com.scalers.scalerbackendprojectkafkaoauth.models.Token;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponseDto {
    private String tokenValue;
}

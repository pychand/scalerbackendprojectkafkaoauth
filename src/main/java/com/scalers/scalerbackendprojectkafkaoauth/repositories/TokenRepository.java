package com.scalers.scalerbackendprojectkafkaoauth.repositories;

import com.scalers.scalerbackendprojectkafkaoauth.models.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;

@Repository
public interface TokenRepository extends JpaRepository<Token, Long> {
    @Override
    Token save(Token token);

    Optional<Token> findByValueAndDeletedAndExpiryAtGreaterThan(String value,
                                                                Boolean deleted,
                                                                Date currentTime);
}

package com.tech.gateway.configuration;

/*import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;*/
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class JwtTokenUtil {

/*    private static final String SECRET_KEY = "your_secret_key";
    private static final long EXPIRATION_TIME = TimeUnit.HOURS.toMillis(1);

    public static String generateToken(String username) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("username", username);

        return Jwts.builder()
                .setClaims(claims)
                .setSubject(username)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }*/
}

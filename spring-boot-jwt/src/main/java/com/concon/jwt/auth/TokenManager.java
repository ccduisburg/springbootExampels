package com.concon.jwt.auth;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;

@Service
public class TokenManager {

    private static final int validity=5*60*1000;

    Key secretkey= Keys.secretKeyFor(SignatureAlgorithm.HS256);

   public String generateToken(String username){
        return Jwts.builder()
                .setSubject(username)
                .setIssuer("com.concon")
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis()+validity))
                .signWith(secretkey)
                .compact();
    }

    public boolean tokenValidate(String token){
       if(getUsernameToken(token)!=null && isExpired(token)){
           return true;
       }
       return false;
    }

    public boolean isExpired(String token) {
        Claims claims=getClaims(token);
        return claims.getExpiration().after(new Date(System.currentTimeMillis()));
    }

    public  String getUsernameToken(String token) {
       Claims claims=getClaims(token);
        return claims.getSubject();
    }

    private Claims getClaims(String token) {
       return Jwts.parser().setSigningKey(secretkey).parseClaimsJws(token).getBody();
    }

}

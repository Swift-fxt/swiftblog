package com.swift.swiftblog.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


import java.util.Date;
import java.util.Map;

public class JwtUtil {
    /**
     * 这个方法生成jwt令牌
     * @param secretKey
     * @param ttlMillis
     * @param claims
     * @return
     */
    public static String createJwtToken(String secretKey, Long ttlMillis, Map<String,Object> claims){
        SignatureAlgorithm algorithm = SignatureAlgorithm.HS256;
        Long currentTime = System.currentTimeMillis() + ttlMillis;
        Date date = new Date(currentTime);

        JwtBuilder jwtBuilder = Jwts.builder()
                .addClaims(claims)
                .setExpiration(date)
                .signWith(algorithm,secretKey);
        return jwtBuilder.compact();

    }

    /**
     * 这个方法解析jwt令牌
     * @return
     */
    public static Claims parseJWT(String token,String secretkey){
        Claims claims = Jwts.parser()
                .setSigningKey(secretkey)
                .parseClaimsJws(token)
                .getBody();

        return claims;
    }
}

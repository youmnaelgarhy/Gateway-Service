package com.tech.gateway.configuration;

import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.filter.OncePerRequestFilter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
/*import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;*/
import javax.crypto.SecretKey;

/*@Configuration
@EnableWebSecurity*/
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	/*
	 * private static final SecretKey SECRET_KEY =
	 * Keys.secretKeyFor(io.jsonwebtoken.SignatureAlgorithm.HS256);
	 * 
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * http.csrf().disable() .authorizeRequests()
	 * .antMatchers("/api/public").permitAll() .anyRequest().authenticated() .and()
	 * .addFilterBefore(new JwtAuthenticationFilter(),
	 * UsernamePasswordAuthenticationFilter.class); }
	 * 
	 * @Bean public SecretKey secretKey() { return SECRET_KEY; }
	 * 
	 * @Bean public JwtAuthenticationFilter jwtAuthenticationFilter() { return new
	 * JwtAuthenticationFilter(); } }
	 * 
	 * class JwtAuthenticationFilter extends OncePerRequestFilter {
	 * 
	 * private final SecretKey secretKey =
	 * Keys.secretKeyFor(io.jsonwebtoken.SignatureAlgorithm.HS256);
	 * 
	 * @Override protected void doFilterInternal(HttpServletRequest request,
	 * HttpServletResponse response, FilterChain filterChain) throws
	 * ServletException, IOException { String authorizationHeader =
	 * request.getHeader(HttpHeaders.AUTHORIZATION);
	 * 
	 * if (authorizationHeader != null && authorizationHeader.startsWith("Bearer "))
	 * { String token = authorizationHeader.substring(7); try { Claims claims =
	 * Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody();
	 * 
	 * Jwts.parserBuilder() .setSigningKey(secretKey) .build()
	 * .parseClaimsJws(token) .getBody();
	 * 
	 * 
	 * Authentication authentication = new
	 * UsernamePasswordAuthenticationToken(claims.getSubject(), null,
	 * Collections.emptyList());
	 * SecurityContextHolder.getContext().setAuthentication(authentication); } catch
	 * (Exception e) { SecurityContextHolder.clearContext(); } }
	 * 
	 * filterChain.doFilter(request, response); }
	 */
}

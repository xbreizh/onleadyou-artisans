package com.onleadyou.artisans.api.security;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onleadyou.artisans.api.service.contract.SessionService;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class ApiInterceptor implements HandlerInterceptor
{

    final SessionService sessionService;
    public ApiInterceptor(final SessionService sessionService)
    {
        this.sessionService = sessionService;
    }

    @Override
    public boolean preHandle(
            final HttpServletRequest request,
            @NonNull final HttpServletResponse response,
            @NonNull final Object handler
    )
    {
        final String encodedToken = request.getHeader("Authorization");
        return sessionService.validateAuthentication(encodedToken);
    }
}
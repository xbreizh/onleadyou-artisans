package com.onleadyou.artisans.api.security;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Component
public class ConfigInterceptor implements WebMvcConfigurer
{

    private final ApiInterceptor apiInterceptor;

    public ConfigInterceptor(final ApiInterceptor apiInterceptor)
    {
        this.apiInterceptor = apiInterceptor;
    }

    @Override
    public void addInterceptors(final InterceptorRegistry registry)
    {
        registry.addInterceptor(apiInterceptor);
    }

}

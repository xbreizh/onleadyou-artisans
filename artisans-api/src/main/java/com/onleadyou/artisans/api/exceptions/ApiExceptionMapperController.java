package com.onleadyou.artisans.api.exceptions;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.logging.Logger;

@ControllerAdvice
public final class ApiExceptionMapperController extends ResponseEntityExceptionHandler
{
    //private static final Logger LOGGER = LoggerFactory.getLogger(ApiExceptionMapperController.class);

    @ExceptionHandler(value = {CustomException.class})
    private ResponseEntity<Object> handleCustomException(
            final CustomException ex, final WebRequest request)
    {
        return handleExceptionInternal(ex, ex.getMessage(),
                new HttpHeaders(), HttpStatus.BAD_GATEWAY, request);
    }
}

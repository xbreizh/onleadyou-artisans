package com.onleadyou.artisans.api.exceptions;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CustomException extends RuntimeException implements Serializable
{
    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomException.class);
    final Exception exception;

    public CustomException(final String msg, final Exception exception)
    {
        super(msg, exception);
        LOGGER.error(msg, exception);
        this.exception = exception;
    }
}

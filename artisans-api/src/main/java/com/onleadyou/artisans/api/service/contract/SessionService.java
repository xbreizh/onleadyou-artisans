package com.onleadyou.artisans.api.service.contract;

public interface SessionService {

    boolean validateAuthentication(String token);
}

package com.doclick.services;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface IUserService
{
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    public String name();
}

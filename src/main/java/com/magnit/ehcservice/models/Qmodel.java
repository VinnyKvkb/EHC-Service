package com.magnit.ehcservice.models;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class Qmodel {
    @NotNull(message = "This Field is mandatory")
    private Integer q1;
    @NotNull(message = "This Field is mandatory")
    private Integer q2;
    @NotNull(message = "This Field is mandatory")
    private Integer q3;
    @NotNull(message = "This Field is mandatory")
    private Integer q4;
    @NotNull(message = "This Field is mandatory")
    private Integer q5;
}

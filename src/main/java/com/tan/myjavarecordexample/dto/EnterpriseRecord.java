package com.tan.myjavarecordexample.dto;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

public record EnterpriseRecord(String id, @NotNull String name, @NotNull @Length(min = 2, max = 255) String address) {
}

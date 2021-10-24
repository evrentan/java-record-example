package com.tan.myjavarecordexample.dto;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

public record EnterpriseRecord(String id, @NotNull String name, @Length(min = 1, max = 255) String address) {
}

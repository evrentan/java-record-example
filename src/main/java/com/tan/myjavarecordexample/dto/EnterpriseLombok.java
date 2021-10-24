package com.tan.myjavarecordexample.dto;


import lombok.Data;

import java.io.Serializable;

@Data
public class EnterpriseLombok implements Serializable {
  String id;
  String name;
  String address;
}

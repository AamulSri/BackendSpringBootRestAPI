package com.ctrlcrafting.hello.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
 private Long id;
 private String name;
 private LocalDate doj;
 @JsonProperty("isActive")
 private boolean isActive;
}

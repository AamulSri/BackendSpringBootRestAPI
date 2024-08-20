package com.ctrlcrafting.hello.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "Employee")
@Data()
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;
 private String name;
 private LocalDate doj;
 private boolean isActive;
}

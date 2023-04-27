package com.logger.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.logger.config.ExclusionAnnotationIntrospector;
import com.logger.models.DepartMent;
import com.logger.models.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
  private static final Logger LOGGER = LoggerFactory.getLogger(Controller.class);

  @GetMapping("/get/employee")
  public Employee logEmployeeDetails() throws JsonProcessingException {
    Employee employee = new Employee();
    employee.setId("1");
    employee.setName("priya TTN");
    DepartMent departMent = new DepartMent();
    departMent.setDepartMentName("TTN");
    departMent.setDepartMentType("CSE");
    employee.setDepartMent(departMent);
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.setAnnotationIntrospector(new ExclusionAnnotationIntrospector());
    LOGGER.info(objectMapper.writeValueAsString(employee));
    return employee;
  }
}

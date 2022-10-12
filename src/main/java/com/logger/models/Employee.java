package com.logger.models;

import com.logger.aspects.IgnoreFieldForLogger;

public class Employee {


  private String id;


  private String name;
  @IgnoreFieldForLogger
  private DepartMent departMent;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DepartMent getDepartMent() {
    return departMent;
  }

  public void setDepartMent(DepartMent departMent) {
    this.departMent = departMent;
  }
}

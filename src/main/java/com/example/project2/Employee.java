package com.example.project2;

public class Employee {
  private int id;
  private String name;
  private String dept;
  private double salary;
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public String getName(){
    return name;
  }
  public Employee(int id, String name, String dept, double salary) {
    this.id = id;
    this.name = name;
    this.dept = dept;
    this.salary = salary;
  }
  public Employee(){
    super();
  }
}

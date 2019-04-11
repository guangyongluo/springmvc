package com.vilin.springmvc.chapter13.integration.service;

import com.vilin.springmvc.chapter13.integration.domain.Employee;

public interface EmployeeService {
    Employee getHighestPaidEmployee(int employeeCategory);
}

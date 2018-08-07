package com.hand.api.service;

import com.hand.domain.entity.Employee;

public interface EmployeeService {
    Employee get(Long id);

    void save(Employee e);
}

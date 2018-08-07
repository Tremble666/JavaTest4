package com.hand.api.service.impl;

import com.hand.api.service.EmployeeService;
import com.hand.domain.entity.Employee;
import com.hand.infra.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper mapper;

    public Employee get(Long id) {
        Employee e = mapper.get(1l);
        return e;
    }

    public void save(Employee e) {
        mapper.save(e);
    }
}

package com.hand.infra.mapper;

import com.hand.domain.entity.Employee;

public interface EmployeeMapper {
    Employee get(Long id);

    void save(Employee e);
}

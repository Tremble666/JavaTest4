package com.hand.api.service.impl;

import com.hand.api.service.FilmService;
import com.hand.domain.entity.Film;
import com.hand.infra.mapper.EmployeeMapper;
import com.hand.infra.mapper.FilmMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FilmServiceImpl implements FilmService {
    @Autowired
    private FilmMapper mapper;

    public List<Film> listAll() {
        return mapper.listAll();
    }

    public void save(Film f) {
        mapper.save(f);
        System.out.println("insert film success!!!!");
    }
}

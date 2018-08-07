package com.hand.infra.mapper;

import com.hand.domain.entity.Employee;
import com.hand.domain.entity.Film;

import java.util.List;

public interface FilmMapper {
    List<Film> listAll();

    void save(Film f);
}

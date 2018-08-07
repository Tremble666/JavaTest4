package com.hand.api.service;

import com.hand.domain.entity.Employee;
import com.hand.domain.entity.Film;

import java.util.List;

public interface FilmService {
    List<Film> listAll();

    void save(Film f);
}

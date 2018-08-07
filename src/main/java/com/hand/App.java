package com.hand;

import com.hand.api.service.EmployeeService;
import com.hand.api.service.FilmService;
import com.hand.domain.entity.Employee;
import com.hand.domain.entity.Film;
import javafx.scene.control.ListView;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class App {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private FilmService filmService;

    @Test
    public void test1() throws Exception{
        Employee e = employeeService.get(1l);
        System.out.println(e);
    }

    @Test
    public void test2() throws Exception{
        Employee e = new Employee();
        e.setName("西门吹雪");
        e.setDept_id(2l);
        employeeService.save(e);
    }

    @Test
    public void test3() throws Exception{
        List<Film> films = filmService.listAll();
        for (Film film : films) {
            System.out.println(film);
        }

    }

    @Test
    public void test4() throws Exception{
        Film f = new Film();
        f.setTitle("haha");
        f.setDescription("haha");
        f.setRelease_year("2006");
        f.setLanguage_id(1);
        f.setOriginal_language_id(null);
        f.setRental_duration(4);
        f.setRental_rate(new BigDecimal("22"));
        f.setLength(20);
        f.setReplacement_cost(new BigDecimal(200));
        f.setRating("PG");
        f.setSpecial_features("Commentaries");
        f.setLast_update("2006-02-15 05:03:42");
        System.out.println(f);
        filmService.save(f);
    }
}

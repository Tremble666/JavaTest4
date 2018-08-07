package com.hand;

import com.hand.api.service.EmployeeService;
import com.hand.api.service.FilmService;
import com.hand.domain.entity.Employee;
import com.hand.domain.entity.Film;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {
        String title = System.getenv("title");
        String description = System.getenv("description");
        String languageId = System.getenv("languageId");


        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("Context Start");
        FilmService filmService =context.getBean(FilmService.class);
        Film f = new Film();
        f.setTitle(title);
        System.out.println("title:"+title);
        f.setDescription(description);
        System.out.println("description:"+description);
        f.setRelease_year("2006");
        f.setLanguage_id(Integer.valueOf(languageId));
        System.out.println("languageId:"+languageId);
        f.setOriginal_language_id(null);
        f.setRental_duration(4);
        f.setRental_rate(new BigDecimal("22"));
        f.setLength(20);
        f.setReplacement_cost(new BigDecimal(200));
        f.setRating("PG");
        f.setSpecial_features("Commentaries");
        f.setLast_update("2006-02-15 05:03:42");
        filmService.save(f);
        System.out.println(f);
        System.out.println("Context Stop");
    }
}

package com.hand.domain.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
public class Film {
    private Integer film_id;
    private String title;
    private String description;
    private String release_year;
    private Integer language_id;
    private Integer original_language_id;
    private Integer rental_duration;
    private BigDecimal rental_rate;
    private Integer length;
    private BigDecimal replacement_cost;
    private String rating;
    private String special_features;
    private String last_update;
}

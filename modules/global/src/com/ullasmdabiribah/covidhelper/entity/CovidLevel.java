package com.ullasmdabiribah.covidhelper.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "COVIDHELPER_COVID_LEVEL")
@Entity(name = "covidhelper_CovidLevel")
public class CovidLevel extends StandardEntity {
    private static final long serialVersionUID = -2791702022281444308L;

    @NotNull
    @Column(name = "SCORE", nullable = false)
    private Integer score;

    @NotNull
    @Column(name = "LEVEL_", nullable = false)
    private String level;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
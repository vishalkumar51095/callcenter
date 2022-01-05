package com.callcenter.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "sample_data")
public class Duration {
    @Id
    @Column(name = "starthr", nullable = false)
    private Long starthr;

    private int totalduration;

    public Long getStarthr() {
        return starthr;
    }

    public void setStarthr(Long starthr) {
        this.starthr = starthr;
    }

    public Duration() {

    }

    @Override
    public String toString() {
        return "Duration{" +
                "starthr=" + starthr +
                ", totalduration=" + totalduration +
                '}';
    }


    public int getTotalduration() {
        return totalduration;
    }

    public void setTotalduration(int totalduration) {
        this.totalduration = totalduration;
    }
}

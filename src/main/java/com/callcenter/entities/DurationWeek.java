package com.callcenter.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "sample_data")
public class DurationWeek {
    @Id
    @Column(name = "weekday", nullable = false)
    private Long weekday;

    private int totalduration;

    public DurationWeek() {
    }

    @Override
    public String toString() {
        return "DurationWeek{" +
                "weekday=" + weekday +
                ", totalduration=" + totalduration +
                '}';
    }

    public DurationWeek(Long weekday, int totalduration) {
        this.weekday = weekday;
        this.totalduration = totalduration;
    }

    public Long getWeekday() {
        return weekday;
    }

    public void setWeekday(Long weekday) {
        this.weekday = weekday;
    }

    public int getTotalduration() {
        return totalduration;
    }

    public void setTotalduration(int totalduration) {
        this.totalduration = totalduration;
    }
}

package com.callcenter.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "sample_data")
public class Volume {
    @Id
    private Long starthr;
    @Column(name = "noofcalls", nullable = false)
    private int noofcalls;

    public Volume() {
    }

    @Override
    public String toString() {
        return "Volume{" +
                "starthr=" + starthr +
                ", noofcalls=" + noofcalls +
                '}';
    }


    public Volume(Long starthr, int noofcalls) {
        this.starthr = starthr;
        this.noofcalls = noofcalls;
    }

    public Long getStarthr() {
        return starthr;
    }

    public void setStarthr(Long starthr) {
        this.starthr = starthr;
    }

    public int getNoofcalls() {
        return noofcalls;
    }

    public void setNoofcalls(int noofcalls) {
        this.noofcalls = noofcalls;
    }
}

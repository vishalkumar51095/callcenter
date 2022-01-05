package com.callcenter.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sample_data")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int from_number;
    @JsonFormat(timezone = "yyyy-MM-dd 'T' HH:mm:ss")
    private Date start_time;
    @JsonFormat(timezone = "yyyy-MM-dd 'T' HH:mm:ss")
    private Date end_time;
    private int duration;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", from_number=" + from_number +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                ", duration=" + duration +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFrom_number() {
        return from_number;
    }

    public void setFrom_number(int from_number) {
        this.from_number = from_number;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public User(int id, int from_number, Date start_time, Date end_time, int duration) {
        this.id = id;
        this.from_number = from_number;
        this.start_time = start_time;
        this.end_time = end_time;
        this.duration = duration;
    }
}
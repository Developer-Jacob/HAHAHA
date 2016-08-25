package com.hurryup.traffic.junga.hahaha.model;

import java.io.Serializable;

/**
 * Created by JUNGA on 2016-08-19.
 */
public class Section implements Serializable {

    public Section(Transport transport, long end_gps, String end_name, long start_gps, String start_name, String time) {
        this.end_gpsX = end_gps;
        this.end_gpsY = end_gps;
        this.end_name = end_name;
        this.start_gpsX = start_gps;
        this.start_gpsY = start_gps;
        this.start_name = start_name;
        this.time = time;
        this.transport = transport;
    }

    public Section() {
    }


    public long getEnd_gpsX() {
        return end_gpsX;
    }

    public void setEnd_gpsX(long end_gpsX) {
        this.end_gpsX = end_gpsX;
    }

    public long getEnd_gpsY() {
        return end_gpsY;
    }

    public void setEnd_gpsY(long end_gpsY) {
        this.end_gpsY = end_gpsY;
    }

    public long getStart_gpsX() {
        return start_gpsX;
    }

    public void setStart_gpsX(long start_gpsX) {
        this.start_gpsX = start_gpsX;
    }

    public long getStart_gpsY() {
        return start_gpsY;
    }

    public void setStart_gpsY(long start_gpsY) {
        this.start_gpsY = start_gpsY;
    }

    public String getEnd_name() {
        return end_name;
    }

    public void setEnd_name(String end_name) {
        this.end_name = end_name;
    }



    public String getStart_name() {
        return start_name;
    }

    public void setStart_name(String start_name) {
        this.start_name = start_name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    private Transport transport;
    private String start_name;
    private long start_gpsX;
    private long start_gpsY;
    private String end_name;
    private long end_gpsY;
    private long end_gpsX;
    private String time;

}

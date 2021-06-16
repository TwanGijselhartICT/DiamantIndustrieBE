package com.backend.diamantindustrie.domain;

import javax.persistence.*;
import java.awt.*;

@Entity(name = "pointofinterest")
public class POI {

    @Id
    private int id;
    private String Name;
    private String Text;
    private String Address;
    private String Long;
    private String Lat;


    public POI(int id, String name, String text, String address, String aLong, String lat) {
        this.id = id;
        Name = name;
        Text = text;
        Address = address;
        Long = aLong;
        Lat = lat;
    }

    public POI(){

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getLong() {
        return Long;
    }

    public void setLong(String aLong) {
        Long = aLong;
    }

    public String getLat() {
        return Lat;
    }

    public void setLat(String lat) {
        Lat = lat;
    }



    @Override
    public String toString() {
        return "PointOfInterest{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Text='" + Text + '\'' +
                ", Address='" + Address + '\'' +
                ", Long='" + Long + '\'' +
                ", Lat='" + Lat + '\'' +
                '}';
    }
}

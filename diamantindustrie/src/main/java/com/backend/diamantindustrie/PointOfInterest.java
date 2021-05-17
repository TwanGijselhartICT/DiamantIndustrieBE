package com.backend.diamantindustrie;

public class PointOfInterest {
    public String id;
    public String name;
    public String text;
    public String address;
    public String longitude;
    public String latitude;
    public String audioText;

    public PointOfInterest(String id, String name, String text, String address, String longitude, String latitude,
            String audioText) {
        this.id = id;
        this.name = name;
        this.text = text;
        this.address = address;
        this.longitude = longitude;
        this.latitude = latitude;
        this.audioText = audioText;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getAudioText() {
        return audioText;
    }

    public void setAudioText(String audioText) {
        this.audioText = audioText;
    }
}

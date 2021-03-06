package com.example.a1dordj54.findapub.models;


import android.graphics.drawable.Drawable;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;
import org.osmdroid.api.IGeoPoint;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.overlay.OverlayItem;

/**
 * Created by james on 23/01/2017.
 */

public abstract class PointofInterest extends OverlayItem {

    protected String id;
    protected String name;
    protected String type;
    protected String country;
    protected String region;
    protected double lon;
    protected double lat;
    protected String description;

    protected PointofInterest(String id, String name, String type, String country, String region, double lon, double lat, String description) {

        super(name, description, new GeoPoint(lat, lon));
        this.id = id;
        this.name = name;
        this.type = type;
        this.country = country;
        this.region = region;
        this.lon = lon;
        this.lat = lat;
        this.description = description;

    }

    @Override
    public IGeoPoint getPoint() {
        return new GeoPoint(this.lat, this.lon);
    }

    public String getId() {
        return this.id;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

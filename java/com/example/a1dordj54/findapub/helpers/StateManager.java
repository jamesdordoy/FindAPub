package com.example.a1dordj54.findapub.helpers;

import com.example.a1dordj54.findapub.models.PointofInterest;

import java.util.ArrayList;

public class StateManager {

    private ArrayList<PointofInterest> pointsofInterests = new ArrayList<>();

    private Double lat = 0.00;
    private Double lon = 0.00;

    //Singleton Atts & Methods
    private static final StateManager ourInstance = new StateManager();

    public static StateManager getInstance() {
        return ourInstance;
    }

    //Private Constructor
    private StateManager() {}

    //Back To Implementation
    public void addPointOfInterest(PointofInterest poi){
        this.pointsofInterests.add(poi);
    }

    public ArrayList<PointofInterest> getPointsofInterests() {
        return pointsofInterests;
    }


    public PointofInterest getPointOfInterest(int i){
        return this.pointsofInterests.get(i);
    }

    public void setPointsofInterests(ArrayList<PointofInterest> pointsofInterests) {
        this.pointsofInterests = pointsofInterests;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }
}

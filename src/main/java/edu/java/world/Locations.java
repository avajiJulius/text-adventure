package edu.java.world;

public abstract class Locations {
    private String locationName;
    private LocationStatus status;
    private Integer locationLevel;

    public Locations() {
    }

    public Locations(String locationName, LocationStatus status, Integer locationLevel) {
        this.locationName = locationName;
        this.status = status;
        this.locationLevel = locationLevel;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public LocationStatus getStatus() {
        return status;
    }

    public void setStatus(LocationStatus status) {
        this.status = status;
    }

    public Integer getLocationLevel() {
        return locationLevel;
    }

    public void setLocationLevel(Integer locationLevel) {
        this.locationLevel = locationLevel;
    }

    @Override
    public String toString() {
        return "Locations{" +
                "locationName='" + locationName + '\'' +
                ", status=" + status +
                ", locationLevel=" + locationLevel +
                '}';
    }
}

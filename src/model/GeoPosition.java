package model;

/**
 * Created by vincentbeauvieux on 24/09/2016.
 */
public class GeoPosition {

    private float latitude;
    private float longitude;

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return getLatitude()+", "+getLongitude();
    }
}

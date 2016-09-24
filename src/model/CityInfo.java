package model;

import java.util.HashMap;

/**
 * Created by vincentbeauvieux on 24/09/2016.
 */
public class CityInfo {
    private int _id;
    private String key;
    private String name;
    private String fullName;
    private String iata_airport_code;
    private String type;
    private String country;
    private GeoPosition geo_position;
    private int locationId;
    private boolean inEurope;
    private int countryId;
    private String countryCode;
    private boolean coreCountry;
    private int distance;
    private HashMap<String,String> names;
    private HashMap<String,String> alternativeNames;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIata_airport_code() {
        return iata_airport_code;
    }

    public void setIata_airport_code(String iata_airport_code) {
        this.iata_airport_code = iata_airport_code;
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

    public GeoPosition getGeo_position() {
        return geo_position;
    }

    public void setGeo_position(GeoPosition geo_position) {
        this.geo_position = geo_position;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public boolean isInEurope() {
        return inEurope;
    }

    public void setInEurope(boolean inEurope) {
        this.inEurope = inEurope;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public boolean isCoreCountry() {
        return coreCountry;
    }

    public void setCoreCountry(boolean coreCountry) {
        this.coreCountry = coreCountry;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public HashMap<String, String> getNames() {
        return names;
    }

    public void setNames(HashMap<String, String> names) {
        this.names = names;
    }

    public HashMap<String, String> getAlternativeNames() {
        return alternativeNames;
    }

    public void setAlternativeNames(HashMap<String, String> alternativeNames) {
        this.alternativeNames = alternativeNames;
    }

    @Override
    public String toString() {
        return "CityInfo{" +
                "_id=" + _id +
                ", key='" + key + '\'' +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", iata_airport_code='" + iata_airport_code + '\'' +
                ", type='" + type + '\'' +
                ", country='" + country + '\'' +
                ", geo_position=" + geo_position +
                ", locationId=" + locationId +
                ", inEurope=" + inEurope +
                ", countryId=" + countryId +
                ", countryCode='" + countryCode + '\'' +
                ", coreCountry=" + coreCountry +
                ", distance=" + distance +
                ", names=" + names +
                ", alternativeNames=" + alternativeNames +
                '}';
    }
}

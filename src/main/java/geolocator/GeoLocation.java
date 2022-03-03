package geolocator;

@lombok.Data

/**
 * Class for wrapping geolocation information about on IP address.
 */

public class GeoLocation {

    private String as;
    private String city;
    private String country;
    private String countryCode;
    private String isp;
    private double lat;
    private double lon;
    private String org;
    private String query;
    private String region;
    private String regionName;
    private String timezone;
    private String zip;

}

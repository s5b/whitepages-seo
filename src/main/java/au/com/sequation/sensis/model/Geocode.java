package au.com.sequation.sensis.model;

/**
 * User: sbegg
 * Date: 13/04/13
 * Time: 4:35 PM
 */
public class Geocode

{
    private final String latitude;
    private final String longitude;

    public Geocode(String latitude, String longitude)
    {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getLatitude()
    {
        return latitude;
    }

    public String getLongitude()
    {
        return longitude;
    }

    public String getLongLat()
    {
        return longitude + "," + latitude;
    }
}

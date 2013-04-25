package au.com.sequation.sensis.model;

/**
 * User: sbegg
 * Date: 13/04/13
 * Time: 4:24 PM
 */
public class Address

{
    private final String label;
    private final String number;
    private final String street;
    private final String suburb;
    private final String state;
    private final String postcode;
    private final Geocode geocode;

    public Address(String label, String number, String street, String suburb, String state, String postcode, Geocode geocode)
    {
        this.label = label;
        this.number = number;
        this.street = street;
        this.suburb = suburb;
        this.state = state;
        this.postcode = postcode;
        this.geocode = geocode;
    }

    public String getLabel()
    {
        return label;
    }

    public String getNumber()
    {
        return number;
    }

    public String getStreet()
    {
        return street;
    }

    public String getSuburb()
    {
        return suburb;
    }

    public String getState()
    {
        return state;
    }

    public String getPostcode()
    {
        return postcode;
    }

    public Geocode getGeocode()
    {
        return geocode;
    }

    public boolean isMappable() {
        return geocode != null;
    }
}

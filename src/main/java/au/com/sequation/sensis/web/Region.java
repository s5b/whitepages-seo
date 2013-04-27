package au.com.sequation.sensis.web;

/**
 * User: sbegg
 * Date: 26/04/13
 * Time: 9:32 PM
 */
public class Region

{
    private final String suburb;
    private final String state;

    public Region(String suburb, String state)
    {
        this.suburb = suburb;
        this.state = state;
    }

    public String getSuburb()
    {
        return suburb;
    }

    public String getState()
    {
        return state;
    }
}

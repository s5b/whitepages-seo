package au.com.sequation.sensis.model;

/**
 * User: sbegg
 * Date: 23/07/13
 * Time: 5:33 PM
 */
public class Link
{
    private final String label;
    private final String url;

    public Link(String label, String url)
    {
        this.label = label;
        this.url = url;
    }

    public String getLabel()
    {
        return label;
    }

    public String getUrl()
    {
        return url;
    }
}

package au.com.sequation.sensis.web;

/**
 * User: sbegg
 * Date: 27/04/13
 * Time: 6:17 AM
 */
public class PrimaryId

{
    private final String baseUrlPrefix;
    private final String contentName;
    private final String contentId;
    private final String suburb;
    private final String state;

    public PrimaryId(String baseUrlPrefix, String contentName, String contentId, String suburb, String state)
    {
        this.baseUrlPrefix = baseUrlPrefix;
        this.contentName = contentName;
        this.contentId = contentId;
        this.suburb = suburb != null ? suburb.trim() : "";
        this.state = state != null ? state.trim() : "";
    }

    public String getContentName()
    {
        return contentName;
    }

    public String getContentId()
    {
        return contentId;
    }

    public String getBaseUrlPrefix()
    {
        return baseUrlPrefix;
    }

    public String getSuburb()
    {
        return suburb;
    }

    public String getState()
    {
        return state;
    }

    public boolean isRegioned() {
        return suburb.length() > 0 && state.length() > 0;
    }

    @Override
    public String toString()
    {
        return baseUrlPrefix + contentName + "-" + contentId + (isRegioned() ? "/" + suburb + "-" + state : "");
    }
}

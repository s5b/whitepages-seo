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
    private final Region region;

    public PrimaryId(String baseUrlPrefix, String contentName, String contentId, Region region)
    {
        this.baseUrlPrefix = baseUrlPrefix;
        this.contentName = contentName;
        this.contentId = contentId;
        this.region = region;
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

    public boolean isRegioned() {
        return region.isRegioned();
    }

    @Override
    public String toString()
    {
        return baseUrlPrefix + contentName + "-" + contentId + region.getUrlParameter();
    }
}

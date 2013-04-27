package au.com.sequation.sensis.web;

/**
 * User: sbegg
 * Date: 27/04/13
 * Time: 6:17 AM
 */
public class PrimaryId

{
    private final String contentName;
    private final String contentId;

    public PrimaryId(String contentName, String contentId)
    {
        this.contentName = contentName;
        this.contentId = contentId;
    }

    public String getContentName()
    {
        return contentName;
    }

    public String getContentId()
    {
        return contentId;
    }
}

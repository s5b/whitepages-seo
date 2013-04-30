package au.com.sequation.sensis.model.data.entries;

/**
 * User: sbegg
 * Date: 29/04/13
 * Time: 11:44 AM
 */
public class ContentIdentifier
{
    private final String contentName;
    private final String contentId;

    public ContentIdentifier(String contentName, String contentId)
    {
        this.contentName = contentName;
        this.contentId = contentId;
    }

    @Override
    public String toString()
    {
        return contentName.toLowerCase().replaceAll(" +", "-") + "-" + contentId;
    }
}

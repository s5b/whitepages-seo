package au.com.sequation.sensis.web;

/**
 * User: sbegg
 * Date: 20/04/13
 * Time: 4:52 PM
 */
public class Location
{
    private final String contentName;
    private final String contentId;
    private final String tabId;
    private final String categoryId;
    private final String suburb;
    private final String state;
    private final String contactId;

    public Location(String contentName, String contentId, String tabId, String categoryId, String suburb, String state, String contactId)
    {
        this.contentName = contentName;
        this.contentId = contentId;
        this.tabId = tabId;
        this.categoryId = categoryId;
        this.suburb = suburb;
        this.state = state;
        this.contactId = contactId;
    }

    public String getContentName()
    {
        return contentName;
    }

    public String getContentId()
    {
        return contentId;
    }

    public String getTabId()
    {
        return tabId;
    }

    public String getCategoryId()
    {
        return categoryId;
    }

    public String getSuburb()
    {
        return suburb;
    }

    public String getState()
    {
        return state;
    }

    public String getContactId()
    {
        return contactId;
    }
}

package au.com.sequation.sensis.web;

/**
 * User: sbegg
 * Date: 20/04/13
 * Time: 4:52 PM
 */
public class Location
{
    private final PrimaryId primaryId;
    private final TabLocation tabLocation;
    private final TabLocation defaultTabLocation;
    private final String findUsTabId;
    private final Region region;
    private final String contactId;

    public Location(PrimaryId primaryId, TabLocation tabLocation, TabLocation defaultTabLocation, String findUsTabId, Region region, String contactId)
    {
        this.primaryId = primaryId;
        this.tabLocation = tabLocation;
        this.defaultTabLocation = defaultTabLocation;
        this.findUsTabId = findUsTabId;
        this.region = region;
        this.contactId = contactId;
    }

    public String getContentName()
    {
        return primaryId.getContentName();
    }

    public String getContentId()
    {
        return primaryId.getContentId();
    }

    public String getTabId()
    {
        return tabLocation.getTabId();
    }

    public String getCategoryId()
    {
        return tabLocation.getCategoryId();
    }

    public String getDefaultTabId()
    {
        return defaultTabLocation.getTabId();
    }

    public String getDefaultCategoryId()
    {
        return defaultTabLocation.getCategoryId();
    }

    public String getFindUsTabId()
    {
        return findUsTabId;
    }

    public String getSuburb()
    {
        return region.getSuburb();
    }

    public String getState()
    {
        return region.getState();
    }

    public boolean isNear()
    {
        return region.isNear();
    }

    public String getContactId()
    {
        return contactId;
    }

    public PrimaryId getPrimaryId()
    {
        return primaryId;
    }

    public Region getRegion()
    {
        return region;
    }
}

package au.com.sequation.sensis.web;

/**
 * User: sbegg
 * Date: 20/04/13
 * Time: 5:25 PM
 */
public class TabLocation
{
    private final String tabId;
    private final String categoryId;

    public TabLocation(String tabId, String categoryId)
    {
        this.tabId = tabId;
        this.categoryId = categoryId;
    }

    public String getTabId()
    {
        return tabId;
    }

    public String getCategoryId()
    {
        return categoryId;
    }
}

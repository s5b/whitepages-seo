package au.com.sequation.sensis.web.admin;

import javax.validation.constraints.Min;

/**
 * User: sbegg
 * Date: 25/07/13
 * Time: 11:32 AM
 */
public class AdminFormBean
{
    public AdminFormBean()
    {
    }

    @Min(0)
    private int millisecondFragmentDelay;

    public int getMillisecondFragmentDelay()
    {
        return millisecondFragmentDelay;
    }

    public void setMillisecondFragmentDelay(int millisecondFragmentDelay)
    {
        this.millisecondFragmentDelay = millisecondFragmentDelay;
    }
}

package au.com.sequation.sensis.web.admin;

import javax.inject.Singleton;

/**
 * User: sbegg
 * Date: 25/07/13
 * Time: 2:36 PM
 */
@Singleton
public class AdminParametersFactory
{
    private final AdminFormBean adminFormBean = new AdminFormBean();

    public AdminFormBean getAdminFormBean()
    {
        return adminFormBean;
    }
}

package au.com.sequation.sensis.web.admin;

import org.springframework.stereotype.Component;

import javax.inject.Singleton;

@Component
@Singleton
public class AdminParametersFactory
{
    private final AdminFormBean adminFormBean = new AdminFormBean();

    public AdminFormBean getAdminFormBean()
    {
        return adminFormBean;
    }
}

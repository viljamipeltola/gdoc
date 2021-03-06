package fi.viljami.confluence.gdoc;

import com.atlassian.sal.api.ApplicationProperties;

public class MyPluginComponentImpl implements MyPluginComponent
{
    private final ApplicationProperties applicationProperties;

    public MyPluginComponentImpl(ApplicationProperties applicationProperties)
    {
        this.applicationProperties = applicationProperties;
    }

    public String getName()
    {
        if(null != applicationProperties)
        {
            return "Component:" + applicationProperties.getDisplayName();
        }
        
        return "myComponent";
    }
}
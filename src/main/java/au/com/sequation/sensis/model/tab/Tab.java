package au.com.sequation.sensis.model.tab;

import java.util.List;

/**
 * User: sbegg
 * Date: 13/04/13
 * Time: 4:45 PM
 */
public interface Tab
{
    String getId();
    String getName();
    String getType();
    List<Category> getCategories();
}

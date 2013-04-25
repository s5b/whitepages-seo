package au.com.sequation.sensis.model.tab;

import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * User: sbegg
 * Date: 13/04/13
 * Time: 4:47 PM
 */
public class ContactTab extends AbstractTab
{
    private static final Predicate<Category> HAS_ASSOCIATIONS = new Predicate<Category>() {
        @Override
        public boolean apply(Category category)
        {
            return category != null && category.getAssociations() != null && !category.getAssociations().isEmpty();
        }
    };
    private final List<Category> categories;

    public ContactTab(String id, String name, List<Category> categories)
    {
        super(id, name);
        this.categories = FluentIterable.from(categories != null ? categories : ImmutableList.<Category>of()).filter(HAS_ASSOCIATIONS).toList();
    }

    public List<Category> getCategories()
    {
        return categories;
    }

    @Override
    public String getType()
    {
        return "contact";
    }
}

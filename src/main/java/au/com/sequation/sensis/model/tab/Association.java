package au.com.sequation.sensis.model.tab;

import au.com.sequation.sensis.model.Contact;

/**
 * User: sbegg
 * Date: 13/04/13
 * Time: 4:54 PM
 */
public class Association

{
    private final Contact contact;

    public Association(Contact contact /* styling map */)
    {
        this.contact = contact;
    }

    public Contact getContact()
    {
        return contact;
    }
}

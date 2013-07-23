package au.com.sequation.sensis.model;

import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * User: sbegg
 * Date: 13/04/13
 * Time: 4:21 PM
 */
public class Contact
{
    private final String id;
    private final String label;
    private final Address address;
    private final List<Telecom> telecoms;
    private final List<Link> links;

    public Contact(String id, String label, Address address, List<Telecom> telecoms, List<Link> links)
    {
        this.id = id;
        this.label = label;
        this.address = address;
        this.links = ImmutableList.copyOf(links);
        this.telecoms = ImmutableList.copyOf(telecoms);
    }

    public String getId()
    {
        return id;
    }

    public String getLabel()
    {
        return label;
    }

    public Address getAddress()
    {
        return address;
    }

    public List<Telecom> getTelecoms()
    {
        return telecoms;
    }

    public List<Link> getLinks()
    {
        return links;
    }
}

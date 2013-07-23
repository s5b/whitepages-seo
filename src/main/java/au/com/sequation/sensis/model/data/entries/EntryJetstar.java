package au.com.sequation.sensis.model.data.entries;

import au.com.sequation.sensis.model.Contact;
import au.com.sequation.sensis.model.DigitalDisplayEntry;
import au.com.sequation.sensis.model.Telecom;
import au.com.sequation.sensis.model.TelecomType;
import au.com.sequation.sensis.model.tab.*;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.Map;

/**
 * User: sbegg
 * Date: 15/04/13
 * Time: 6:22 AM
 */
public class EntryJetstar extends Entry
{
    public static DigitalDisplayEntry build()
    {
        return new EntryJetstar().assemble();
    }

    private DigitalDisplayEntry assemble() {
        Map<String, Contact> contacts = createContacts();
        return new DigitalDisplayEntry("456", "Jetstar", contacts, createTabs(contacts));
    }

    private Map<String, Contact> createContacts()
    {
        Map<String, Contact> contacts = Maps.newHashMap();

        contacts.put("1001", new Contact("1001", "Reservations",
                null, Lists.<Telecom>newArrayList(new Telecom("10001", TelecomType.PHONE, "1800 FLY NOW")), LINKS_NONE));
        contacts.put("1002", new Contact("1002", "Customer Service",
                null, Lists.<Telecom>newArrayList(new Telecom("10002", TelecomType.PHONE, "1300 SERVICE")), LINKS_NONE));
        contacts.put("1003", new Contact("1003", "Public Relations",
                null, Lists.<Telecom>newArrayList(new Telecom("10003", TelecomType.PHONE, "1800 TELLME")), LINKS_NONE));
        contacts.put("1004", new Contact("1003", "Melbourne Airport",
                null, Lists.<Telecom>newArrayList(new Telecom("10003", TelecomType.PHONE, "1800 TELLME")), LINKS_NONE));
        contacts.put("1005", new Contact("1003", "Sydney International",
                null, Lists.<Telecom>newArrayList(new Telecom("10003", TelecomType.PHONE, "1800 TELLME")), LINKS_NONE));
        contacts.put("1006", new Contact("1003", "Perth Domestic",
                null, Lists.<Telecom>newArrayList(new Telecom("10003", TelecomType.PHONE, "1800 TELLME")), LINKS_NONE));
        contacts.put("1007", new Contact("1003", "Canberra Regional",
                null, Lists.<Telecom>newArrayList(new Telecom("10003", TelecomType.PHONE, "1800 TELLME")), LINKS_NONE));
        contacts.put("1008", new Contact("1003", "Brisbane International",
                null, Lists.<Telecom>newArrayList(new Telecom("10003", TelecomType.PHONE, "1800 TELLME")), LINKS_NONE));
        contacts.put("1009", new Contact("1003", "Darwin Airfield",
                null, Lists.<Telecom>newArrayList(new Telecom("10003", TelecomType.PHONE, "1800 TELLME")), LINKS_NONE));

        return contacts;
    }

    private ArrayList<Tab> createTabs(Map<String, Contact> contacts)
    {
        return Lists.<Tab>newArrayList(
                new ContactTab("101", "Contacts",
                        Lists.<Category>newArrayList(
                                new Category("100002", "General", Lists.<Association>newArrayList(
                                        new Association(contacts.get("1001")),
                                        new Association(contacts.get("1003")),
                                        new Association(contacts.get("1002"))
                                ))
                        )),
                new FindUsTab("102", "Find Us", filterOnlyAddressedContacts(contacts.values())),
                new ContactTab("103", "Branches",
                        Lists.<Category>newArrayList(
                                new Category("100004", "Retail", Lists.<Association>newArrayList(
                                        new Association(contacts.get("1003")),
                                        new Association(contacts.get("1006")),
                                        new Association(contacts.get("1008")),
                                        new Association(contacts.get("1009")))),
                                new Category("100005", "Commercial", Lists.<Association>newArrayList(
                                        new Association(contacts.get("1005")),
                                        new Association(contacts.get("1007"))
                                ))
                        )
                )
        );
    }
}

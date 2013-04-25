package au.com.sequation.sensis.model.data.entries;

import au.com.sequation.sensis.model.*;
import au.com.sequation.sensis.model.tab.*;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.Map;

/**
 * User: sbegg
 * Date: 15/04/13
 * Time: 6:22 AM
 */
public class EntryColes extends Entry
{
    public static DigitalDisplayEntry build()
    {
        return new EntryColes().assemble();
    }

    private DigitalDisplayEntry assemble() {
        Map<String, Contact> contacts = createContacts();
        return new DigitalDisplayEntry("123", "Coles Supermarkets", contacts, createTabs(contacts));
    }

    private Map<String, Contact> createContacts()
    {
        Map<String, Contact> contacts = Maps.newHashMap();

        contacts.put("1001", new Contact("1001", "Supermarket",
                new Address("", "1313", "Mockingbird Lane", "Melbourne", "VIC", "3000", new Geocode("1", "2")),
                Lists.<Telecom>newArrayList(new Telecom("10001", TelecomType.PHONE, "(03) 9678 2365"))));
        contacts.put("1002", new Contact("1002", "Liquorland",
                new Address("", "17", "Macey Street", "Melbourne", "VIC", "3000", new Geocode("1", "2")),
                Lists.<Telecom>newArrayList(new Telecom("10002", TelecomType.PHONE, "(03) 9678 2365"))));
        contacts.put("1003", new Contact("1003", "Grocery Store",
                new Address("", "3/67", "Barry Road", "Melbourne", "VIC", "3000", new Geocode("1", "2")),
                Lists.<Telecom>newArrayList(new Telecom("10003", TelecomType.PHONE, "(03) 9678 2365"))));
        contacts.put("1004", new Contact("1004", "Head Office",
                new Address("", "12", "Bourke Street", "Melbourne", "VIC", "3000", new Geocode("3", "4")),
                Lists.<Telecom>newArrayList(new Telecom("10004", TelecomType.PHONE, "(03) 9678 2365"))));
        contacts.put("1005", new Contact("1005", "Supermarket",
                new Address("", "24", "Michael Street", "Fitzroy", "VIC", "3065", new Geocode("1", "2")),
                Lists.<Telecom>newArrayList(new Telecom("10005", TelecomType.PHONE, "(03) 9678 2365"))));
        contacts.put("1006", new Contact("1006", "Supermarket",
                new Address("", "34", "Smith Street", "Fitzroy", "VIC", "3065", new Geocode("1", "2")),
                Lists.<Telecom>newArrayList(new Telecom("10006", TelecomType.PHONE, "(03) 9678 2365"))));
        contacts.put("1007", new Contact("1007", "Supermarket",
                new Address("", "229", "Elderberry Road", "St Kilda", "VIC", "3182", null),
                Lists.<Telecom>newArrayList(new Telecom("10007", TelecomType.PHONE, "(03) 9678 2365"))));
        contacts.put("1008", new Contact("1008", "Supermarket",
                new Address("", "654", "Barron Road", "St Kilda", "VIC", "3182", new Geocode("1", "2")),
                Lists.<Telecom>newArrayList(new Telecom("10008", TelecomType.PHONE, "(03) 9678 2365"))));
        contacts.put("1009", new Contact("1009", "Supermarket",
                new Address("", "3/67", "Garry Avenue", "St Kilda", "VIC", "3182", new Geocode("1", "2")),
                Lists.<Telecom>newArrayList(new Telecom("10009", TelecomType.PHONE, "(03) 9678 2365"))));
        contacts.put("1010", new Contact("1010", "Supermarket",
                new Address("", "17", "High Street", "Armadale", "VIC", "3143", new Geocode("1", "2")),
                Lists.<Telecom>newArrayList(new Telecom("10010", TelecomType.PHONE, "(03) 9678 2365"))));
        contacts.put("1011", new Contact("1011", "Supermarket",
                new Address("", "2", "Spensley Street", "Clifton Hill", "VIC", "3068", new Geocode("1", "2")),
                Lists.<Telecom>newArrayList(new Telecom("10011", TelecomType.PHONE, "(03) 9678 2365"))));
        contacts.put("1012", new Contact("1012", "Supermarket",
                new Address("", "43", "Bridge Road", "Richmond", "VIC", "3121", new Geocode("1", "2")),
                Lists.<Telecom>newArrayList(new Telecom("10012", TelecomType.PHONE, "(03) 9678 2365"))));
        contacts.put("1013", new Contact("1013", "Supermarket",
                new Address("", "55", "Church Street", "Richmond", "VIC", "3121", new Geocode("1", "2")),
                Lists.<Telecom>newArrayList(new Telecom("10013", TelecomType.PHONE, "(03) 9678 2365"))));
        contacts.put("1014", new Contact("1014", "Supermarket",
                new Address("", "311", "Surrey Road", "St Albans", "VIC", "3021", new Geocode("1", "2")),
                Lists.<Telecom>newArrayList(new Telecom("10014", TelecomType.PHONE, "(03) 9678 2365"))));
        contacts.put("1015", new Contact("1015", "Convenience Store",
                null,
                Lists.<Telecom>newArrayList(new Telecom("10015", TelecomType.PHONE, "(03) 9678 2365"))));
        contacts.put("1016", new Contact("1016", "Supermarket",
                new Address("", "201", "Cambridge Court", "Chelsea", "VIC", "3196", new Geocode("1", "2")),
                Lists.<Telecom>newArrayList(new Telecom("10016", TelecomType.PHONE, "(03) 9678 2365"))));
        contacts.put("1017", new Contact("1017", "Supermarket",
                new Address("", "322", "Western Highway", "Werribee", "VIC", "3030", new Geocode("1", "2")),
                Lists.<Telecom>newArrayList(new Telecom("10017", TelecomType.PHONE, "(03) 9678 2365"))));
        contacts.put("1018", new Contact("1018", "Supermarket",
                new Address("", "6", "Riverside Avenue", "Dandenong", "VIC", "3175", new Geocode("1", "2")),
                Lists.<Telecom>newArrayList(new Telecom("10018", TelecomType.PHONE, "(03) 9678 2365"))));
        contacts.put("1019", new Contact("1019", "Supermarket",
                new Address("", "325", "Princes Highway", "Dandenong", "VIC", "3175", new Geocode("1", "2")),
                Lists.<Telecom>newArrayList(new Telecom("100019", TelecomType.PHONE, "(03) 9678 2365"))));
        contacts.put("1020", new Contact("1020", "Supermarket",
                new Address("", "76", "Bourke Street", "Dandenong", "VIC", "3175", new Geocode("1", "2")),
                Lists.<Telecom>newArrayList(new Telecom("10020", TelecomType.PHONE, "(03) 9678 2365"))));

        return contacts;
    }

    private ArrayList<Tab> createTabs(Map<String, Contact> contacts)
    {
        return Lists.<Tab>newArrayList(
                new ContactTab("101", "Contacts",
                        Lists.<Category>newArrayList(
                                new Category("100001", "Head Office", Lists.<Association>newArrayList(
                                        new Association(contacts.get("1004")))),
                                new Category("100002", "Retail", Lists.<Association>newArrayList(
                                        new Association(contacts.get("1002")),
                                        new Association(contacts.get("1003")),
                                        new Association(contacts.get("1001")),
                                        new Association(contacts.get("1005")),
                                        new Association(contacts.get("1006")),
                                        new Association(contacts.get("1007")),
                                        new Association(contacts.get("1008")),
                                        new Association(contacts.get("1009")),
                                        new Association(contacts.get("1010")),
                                        new Association(contacts.get("1011")),
                                        new Association(contacts.get("1012")),
                                        new Association(contacts.get("1013")),
                                        new Association(contacts.get("1014")),
                                        new Association(contacts.get("1015")),
                                        new Association(contacts.get("1016")),
                                        new Association(contacts.get("1017")),
                                        new Association(contacts.get("1018")),
                                        new Association(contacts.get("1019")),
                                        new Association(contacts.get("1020")))),
                                new Category("100003", "Liquorland", Lists.<Association>newArrayList(
                                        new Association(contacts.get("1002")),
                                        new Association(contacts.get("1004")),
                                        new Association(contacts.get("1005")),
                                        new Association(contacts.get("1007")),
                                        new Association(contacts.get("1008")),
                                        new Association(contacts.get("1009")),
                                        new Association(contacts.get("1012")),
                                        new Association(contacts.get("1013")),
                                        new Association(contacts.get("1015")),
                                        new Association(contacts.get("1016")),
                                        new Association(contacts.get("1019"))
                                ))
                        )),
                new FindUsTab("102", "Find Us", filterOnlyAddressedContacts(contacts.values())),
                new ContactTab("103", "Branches",
                        Lists.<Category>newArrayList(
                                new Category("100004", "Retail", Lists.<Association>newArrayList(
                                        new Association(contacts.get("1003")),
                                        new Association(contacts.get("1012")),
                                        new Association(contacts.get("1019")),
                                        new Association(contacts.get("1020")))),
                                new Category("100005", "Commercial", Lists.<Association>newArrayList(
                                        new Association(contacts.get("1018")),
                                        new Association(contacts.get("1007")),
                                        new Association(contacts.get("1015")),
                                        new Association(contacts.get("1016")),
                                        new Association(contacts.get("1003")),
                                        new Association(contacts.get("1011"))
                                ))
                        )
                )
        );
    }
}

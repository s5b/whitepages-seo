package au.com.sequation.sensis.model.data.entries;

import au.com.sequation.sensis.model.*;
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
public class EntryBigSchool extends Entry
{
    public static DigitalDisplayEntry build()
    {
        return new EntryBigSchool().assemble();
    }

    private DigitalDisplayEntry assemble() {
        Map<String, Contact> contacts = createContacts();
        return new DigitalDisplayEntry("789", "Big School", contacts, createTabs(contacts));
    }

    private Map<String, Contact> createContacts()
    {
        Map<String, Contact> contacts = Maps.newHashMap();

        contacts.put("1",new Contact("1", "General Enquiries",
                null, Lists.<Telecom>newArrayList(new Telecom("2", TelecomType.PHONE, "03 9264 4111")), LINKS_NONE));
        contacts.put("3", new Contact("3", "Central Office",
                new Address("", "151", "Royal St", "East Perth", "WA", "6004", new Geocode("-31.952134", "115.872003")), Lists.<Telecom>newArrayList(new Telecom("4", TelecomType.PHONE, "(08) 9264 4111")), LINKS_NONE));
        contacts.put("7", new Contact("7", "Brookman Primary School",
                new Address("", "34", "Brookman Av", "Langford", "WA", "6147", new Geocode("-32.037724", "115.938211")), Lists.<Telecom>newArrayList(new Telecom("8", TelecomType.PHONE, "(08) 9458 5542")), LINKS_NONE));
        contacts.put("9", new Contact("9", "Dudley Park Primary School Best Start Program",
                new Address("", "", "Gillark St", "Mandurah", "WA", "6210", null), Lists.<Telecom>newArrayList(new Telecom("10", TelecomType.PHONE, "(08) 9535 9533")), LINKS_NONE));
        contacts.put("11", new Contact("11", "Kulunga (Hilton Primary School)",
                new Address("", "21", "Rennie Crs North", "Hilton", "WA", "6163", new Geocode("-32.069051", "115.784143")), Lists.<Telecom>newArrayList(new Telecom("12", TelecomType.PHONE, "(08) 9337 1006")), LINKS_NONE));
        contacts.put("13", new Contact("13", "Medina Primary School",
                new Address("", "", "Medina Ave", "Medina", "WA", "6167", null), Lists.<Telecom>newArrayList(new Telecom("14", TelecomType.PHONE, "(08) 9419 2510")), LINKS_NONE));
        contacts.put("15", new Contact("15", "Moorditj Noongar Community College",
                new Address("", "", "Eddie Barron Drv", "Midland", "WA", "6056", null), Lists.<Telecom>newArrayList(new Telecom("16", TelecomType.PHONE, "(08) 9374 8800")), LINKS_NONE));
        contacts.put("17", new Contact("17", "Kwob Koolangka (Tranby Primary School)",
                new Address("", "99", "Acton Av", "Rivervale", "WA", "6103", new Geocode("-31.959637", "115.919742")), Lists.<Telecom>newArrayList(new Telecom("18", TelecomType.PHONE, "(08) 9277 1642")), LINKS_NONE));
        contacts.put("20", new Contact("20", "Bullsbrook Community Kindergarten (Inc)",
                new Address("", "25", "Caporn St", "Bullsbrook East", "WA", "6084", new Geocode("-31.66275", "116.030383")), Lists.<Telecom>newArrayList(new Telecom("21", TelecomType.PHONE, "(08) 9571 1392")), LINKS_NONE));
        contacts.put("23", new Contact("23", "Byford Community Kindergarten",
                new Address("", "49", "Park Rd", "Byford", "WA", "6122", new Geocode("-32.216553", "116.012701")), Lists.<Telecom>newArrayList(new Telecom("24", TelecomType.PHONE, "(08) 9525 1125")), LINKS_NONE));
        contacts.put("25", new Contact("25", "Chidlow Community Kindergarten",
                new Address("", "", "Northcote St", "Chidlow", "WA", "6556", null), Lists.<Telecom>newArrayList(new Telecom("26", TelecomType.PHONE, "(08) 9572 3355")), LINKS_NONE));
        contacts.put("27", new Contact("27", "Claremont Community Kindergarten",
                new Address("", "", "Bernard St", "Claremont", "WA", "6010", null), Lists.<Telecom>newArrayList(new Telecom("28", TelecomType.PHONE, "(08) 9384 4900")), LINKS_NONE));
        contacts.put("29", new Contact("29", "Forrestdale Community Kindergarten",
                new Address("", "5", "Weld St", "Forrestdale", "WA", "6112", new Geocode("-32.148688", "115.936949")), Lists.<Telecom>newArrayList(new Telecom("30", TelecomType.PHONE, "(08) 9397 0711")), LINKS_NONE));
        contacts.put("31", new Contact("31", "Glen Forrest Community Kindergarten",
                new Address("", "47a", "Marnie Rd", "Glen Forrest", "WA", "6071", new Geocode("-31.907097", "116.102318")), Lists.<Telecom>newArrayList(new Telecom("32", TelecomType.PHONE, "(08) 9298 9250")), LINKS_NONE));
        contacts.put("33", new Contact("33", "Glendale Community Kindergarten",
                new Address("", "", "Glendale Ave", "Hamersley", "WA", "6022", null), Lists.<Telecom>newArrayList(new Telecom("34", TelecomType.PHONE, "(08) 9447 4171")), LINKS_NONE));
        contacts.put("35", new Contact("35", "Hazel Orme Community Kindergarten",
                new Address("", "96", "Samson St", "White Gum Valley", "WA", "6162", new Geocode("-32.061321", "115.769848")), Lists.<Telecom>newArrayList(new Telecom("36", TelecomType.PHONE, "(08) 9335 2857")), LINKS_NONE));
        contacts.put("37", new Contact("37", "Hillarys Community Kindergarten",
                new Address("", "137", "Broadbeach Blvd", "Hillarys", "WA", "6025", new Geocode("-31.808077", "115.736192")), Lists.<Telecom>newArrayList(new Telecom("38", TelecomType.PHONE, "(08) 9401 3296")), LINKS_NONE));
        contacts.put("39", new Contact("39", "Kallaroo Community Kindergarten",
                new Address("", "23", "Batavia Pl", "Kallaroo", "WA", "6025", new Geocode("-31.790728", "115.752141")), Lists.<Telecom>newArrayList(new Telecom("40", TelecomType.PHONE, "(08) 9401 6804")), LINKS_NONE));
        contacts.put("41", new Contact("41", "Kindaimanna Community Kindergarten",
                new Address("", "", "Grasmere Way", "Westfield", "WA", "6111", null), Lists.<Telecom>newArrayList(new Telecom("42", TelecomType.PHONE, "(08) 9390 7425")), LINKS_NONE));
        contacts.put("43", new Contact("43", "Koondoola Community Kindergarten",
                new Address("", "20", "Burbridge Av", "Koondoola", "WA", "6064", new Geocode("-31.840075", "115.858464")), Lists.<Telecom>newArrayList(new Telecom("44", TelecomType.PHONE, "(08) 9342 3676")), LINKS_NONE));
        contacts.put("45", new Contact("45", "Maddington Community Kindergarten",
                new Address("", "24", "Helm St", "Maddington", "WA", "6109", new Geocode("-32.057132", "115.995644")), Lists.<Telecom>newArrayList(new Telecom("46", TelecomType.PHONE, "(08) 9459 2682")), LINKS_NONE));
        contacts.put("47", new Contact("47", "McDougall Park Community Kindergarten",
                new Address("", "", "Henley St (cnr Bruce St)", "Como", "WA", "6152", null), Lists.<Telecom>newArrayList(new Telecom("48", TelecomType.PHONE, "(08) 9450 3909")), LINKS_NONE));
        contacts.put("49", new Contact("49", "Mount Helena Community Kindergarten",
                new Address("", "20b", "Chidlow St", "Mt Helena", "WA", "6082", new Geocode("-31.874932", "116.21517")), Lists.<Telecom>newArrayList(new Telecom("50", TelecomType.PHONE, "(08) 9572 1170")), LINKS_NONE));
        contacts.put("51", new Contact("51", "Mullaloo Community Kindergarten",
                new Address("", "27", "Koorana Rd", "Mullaloo", "WA", "6027", new Geocode("-31.77986", "115.746611")), Lists.<Telecom>newArrayList(new Telecom("52", TelecomType.PHONE, "(08) 9401 4595")), LINKS_NONE));
        contacts.put("53", new Contact("53", "Padbury Community Kindergarten",
                new Address("", "2", "Caley Rd", "Padbury", "WA", "6025", new Geocode("-31.798574", "115.762784")), Lists.<Telecom>newArrayList(new Telecom("54", TelecomType.PHONE, "(08) 9401 2989")), LINKS_NONE));
        contacts.put("55", new Contact("55", "Pineview Community Kindergarten",
                new Address("", "30", "Mopsa Wy", "Coolbellup", "WA", "6163", new Geocode("-32.075583", "115.811338")), Lists.<Telecom>newArrayList(new Telecom("56", TelecomType.PHONE, "(08) 9337 5089")), LINKS_NONE));
        contacts.put("57", new Contact("57", "Rossmoyne-Riverton Community Kindergarten",
                new Address("", "", "Central Rd", "Rossmoyne", "WA", "6148", null), Lists.<Telecom>newArrayList(new Telecom("58", TelecomType.PHONE, "(08) 9457 1356")), LINKS_NONE));
        contacts.put("59", new Contact("59", "Seaview Community Kindergarten",
                new Address("", "71", "Broome St", "Cottesloe", "WA", "6011", new Geocode("-31.998561", "115.756182")), Lists.<Telecom>newArrayList(new Telecom("60", TelecomType.PHONE, "(08) 9384 3357")), LINKS_NONE));
        contacts.put("61", new Contact("61", "South Perth Community Kindergarten",
                new Address("", "14", "Labouchere Rd", "South Perth", "WA", "6151", new Geocode("-31.973318", "115.850836")), Lists.<Telecom>newArrayList(new Telecom("62", TelecomType.PHONE, "(08) 9367 1086")), LINKS_NONE));
        contacts.put("63", new Contact("63", "Spring Road Community Kindergarten (Inc)",
                new Address("", "1A", "Spring Rd", "Kalamunda", "WA", "6076", new Geocode("-31.971995", "116.060984")), Lists.<Telecom>newArrayList(new Telecom("64", TelecomType.PHONE, "(08) 9293 3292")), LINKS_NONE));
        contacts.put("65", new Contact("65", "Tuart Hill Community Kindergarten",
                new Address("", "114", "Stoneham St", "Tuart Hill", "WA", "6060", new Geocode("-31.903205", "115.83463")), Lists.<Telecom>newArrayList(new Telecom("66", TelecomType.PHONE, "(08) 9444 3922")), LINKS_NONE));
        contacts.put("68", new Contact("68", "Alinjarra Primary School",
                new Address("", "", "Northumberland Ave", "Alexander Heights", "WA", "6064", null), Lists.<Telecom>newArrayList(new Telecom("69", TelecomType.PHONE, "(08) 9342 3388")), LINKS_NONE));
        contacts.put("70", new Contact("70", "Anzac Terrace Primary School",
                new Address("", "176", "Anzac Tce", "Bassendean", "WA", "6054", new Geocode("-31.898583", "115.937027")), Lists.<Telecom>newArrayList(new Telecom("71", TelecomType.PHONE, "(08) 9279 9522")), LINKS_NONE));
        contacts.put("72", new Contact("72", "Applecross Primary School",
                new Address("", "65", "Kintail Rd", "Applecross", "WA", "6153", new Geocode("-32.010078", "115.839677")), Lists.<Telecom>newArrayList(new Telecom("73", TelecomType.PHONE, "(08) 9364 1792")), LINKS_NONE));
        contacts.put("74", new Contact("74", "Arbor Grove Primary School",
                new Address("", "", "Brookmount Drv", "Ellenbrook", "WA", "6069", null), Lists.<Telecom>newArrayList(new Telecom("75", TelecomType.PHONE, "(08) 9297 9300")), LINKS_NONE));
        contacts.put("76", new Contact("76", "Ardross Primary School",
                new Address("", "46", "Links Rd", "Ardross", "WA", "6153", new Geocode("-32.027463", "115.833337")), Lists.<Telecom>newArrayList(new Telecom("77", TelecomType.PHONE, "(08) 9364 2771")), LINKS_NONE));
        contacts.put("78", new Contact("78", "Armadale Primary School",
                new Address("", "1", "Carradine Rd", "Armadale", "WA", "6112", new Geocode("-32.148147", "116.025809")), Lists.<Telecom>newArrayList(new Telecom("79", TelecomType.PHONE, "(08) 9399 2200")), LINKS_NONE));
        contacts.put("80", new Contact("80", "Ashburton Drive Primary School",
                new Address("", "6", "Nullagine Way", "Gosnells", "WA", "6110", null), Lists.<Telecom>newArrayList(new Telecom("81", TelecomType.PHONE, "(08) 9490 1113")), LINKS_NONE));
        contacts.put("82", new Contact("82", "Ashdale Primary School",
                new Address("", "", "Ashdale Blv", "Darch", "WA", "6065", null), Lists.<Telecom>newArrayList(new Telecom("83", TelecomType.PHONE, "(08) 9406 6999")), LINKS_NONE));
        contacts.put("84", new Contact("84", "Ashfield Primary School",
                new Address("", "65", "Margaret St", "Ashfield", "WA", "6054", new Geocode("-31.914553", "115.940366")), Lists.<Telecom>newArrayList(new Telecom("85", TelecomType.PHONE, "(08) 9377 0211")), LINKS_NONE));
        contacts.put("86", new Contact("86", "Attadale Primary School",
                new Address("", "47", "Wichmann Rd", "Attadale", "WA", "6156", new Geocode("-32.025275", "115.800413")), Lists.<Telecom>newArrayList(new Telecom("87", TelecomType.PHONE, "(08) 9330 3422")), LINKS_NONE));
        contacts.put("88", new Contact("88", "Atwell Primary School",
                new Address("", "160", "Lydon Blvd", "Atwell", "WA", "6164", new Geocode("-32.136115", "115.868001")), Lists.<Telecom>newArrayList(new Telecom("89", TelecomType.PHONE, "(08) 9414 5017")), LINKS_NONE));
        contacts.put("90", new Contact("90", "Aubin; Grove Primary School",
                new Address("", "85", "Camden Blv", "Aubin Grove", "WA", "6164", new Geocode("-32.17204", "115.861436")), Lists.<Telecom>newArrayList(new Telecom("91", TelecomType.PHONE, "(08) 9499 4009")), LINKS_NONE));
        contacts.put("92", new Contact("92", "Aveley Primary School",
                new Address("", "8", "Bolero Rd", "Aveley", "WA", "6069", new Geocode("-31.790183", "115.990529")), Lists.<Telecom>newArrayList(new Telecom("95", TelecomType.PHONE, "(08) 6296 5466")), LINKS_NONE));
        contacts.put("93", new Contact("93", "Balcatta Primary School",
                new Address("", "387", "Main St", "Balcatta", "WA", "6021", new Geocode("-31.880921", "115.828377")), Lists.<Telecom>newArrayList(new Telecom("94", TelecomType.PHONE, "(08) 9345 8100")), LINKS_NONE));
        contacts.put("96", new Contact("96", "Baldivis Primary School",
                new Address("", "214", "Fifty Rd", "Baldivis", "WA", "6171", new Geocode("-32.307942", "115.817465")), Lists.<Telecom>newArrayList(new Telecom("97", TelecomType.PHONE, "(08) 9524 1150")), LINKS_NONE));
        contacts.put("98", new Contact("98", "Balga Primary School",
                new Address("", "11", "Fernhurst Cr", "Balga", "WA", "6061", new Geocode("-31.86153", "115.844797")), Lists.<Telecom>newArrayList(new Telecom("99", TelecomType.PHONE, "(08) 9344 2602")), LINKS_NONE));
        contacts.put("101", new Contact("101", "Ballajura Primary School",
                new Address("", "", "Illawarra Crs south", "Ballajura", "WA", "6066", null), Lists.<Telecom>newArrayList(new Telecom("102", TelecomType.PHONE, "(08) 9249 3766")), LINKS_NONE));
        contacts.put("103", new Contact("103", "Bambara Primary School",
                new Address("", "30", "Gosse Rd", "Padbury", "WA", "6025", new Geocode("-31.797362", "115.761132")), Lists.<Telecom>newArrayList(new Telecom("104", TelecomType.PHONE, "(08) 9307 5911")), LINKS_NONE));
        contacts.put("105", new Contact("105", "Banksia Park Primary School",
                new Address("", "", "Hicks St", "Leeming", "WA", "6149", null), Lists.<Telecom>newArrayList(new Telecom("106", TelecomType.PHONE, "(08) 9310 4552")), LINKS_NONE));
        contacts.put("107", new Contact("107", "Bannister; Creek Primary School",
                new Address("", "20", "Purley Crs", "Lynwood", "WA", "6147", new Geocode("-32.038413", "115.928354")), Lists.<Telecom>newArrayList(new Telecom("108", TelecomType.PHONE, "(08) 9350 9588")), LINKS_NONE));
        contacts.put("109", new Contact("109", "Bassendean Primary School",
                new Address("", "70", "West Rd", "Bassendean", "WA", "6054", new Geocode("-31.908002", "115.954134")), Lists.<Telecom>newArrayList(new Telecom("110", TelecomType.PHONE, "(08) 9377 2330")), LINKS_NONE));
        contacts.put("111", new Contact("111", "Bateman Primary School",
                new Address("", "2", "Bartling Cres", "Bateman", "WA", "6150", new Geocode("-32.051759", "115.844708")), Lists.<Telecom>newArrayList(new Telecom("112", TelecomType.PHONE, "(08) 9332 7300")), LINKS_NONE));
        contacts.put("113", new Contact("113", "Bayswater Primary School",
                new Address("", "", "Murray St", "Bayswater", "WA", "6053", null), Lists.<Telecom>newArrayList(new Telecom("114", TelecomType.PHONE, "(08) 9370 2465")), LINKS_NONE));
        contacts.put("115", new Contact("115", "Beaconsfield Primary School",
                new Address("", "5", "Hale St", "Beaconsfield", "WA", "6162", new Geocode("-32.068996", "115.759929")), Lists.<Telecom>newArrayList(new Telecom("116", TelecomType.PHONE, "(08) 9430 7055")), LINKS_NONE));
        contacts.put("117", new Contact("117", "Rottnest Island Campus",
                new Address("", "", "", "Rottnest Island", "WA", "6161", null), Lists.<Telecom>newArrayList(new Telecom("118", TelecomType.PHONE, "(08) 9292 5005")), LINKS_NONE));
        contacts.put("119", new Contact("119", "Beaumaris Primary School",
                new Address("", "", "Beaumaris Blv", "Ocean Reef", "WA", "6027", null), Lists.<Telecom>newArrayList(new Telecom("120", TelecomType.PHONE, "(08) 9300 6444")), LINKS_NONE));
        contacts.put("121", new Contact("121", "Beckenham Primary School",
                new Address("", "386", "Railway Pde", "Beckenham", "WA", "6107", new Geocode("-32.024516", "115.956917")), Lists.<Telecom>newArrayList(new Telecom("122", TelecomType.PHONE, "(08) 9458 4666")), LINKS_NONE));
        contacts.put("123", new Contact("123", "Beechboro Primary School",
                new Address("", "20", "King Rd", "Beechboro", "WA", "6063", new Geocode("-31.868424", "115.935234")), Lists.<Telecom>newArrayList(new Telecom("124", TelecomType.PHONE, "(08) 9377 5500")), LINKS_NONE));
        contacts.put("125", new Contact("125", "Beeliar Primary School",
                new Address("", "86", "The Grange ", "Beeliar", "WA", "6164", new Geocode("-32.134132", "115.820676")), Lists.<Telecom>newArrayList(new Telecom("126", TelecomType.PHONE, "(08) 9437 5955")), LINKS_NONE));
        contacts.put("127", new Contact("127", "Beldon Primary School",
                new Address("", "10", "Pacific Wy", "Beldon", "WA", "6027", new Geocode("-31.773852", "115.758033")), Lists.<Telecom>newArrayList(new Telecom("128", TelecomType.PHONE, "(08) 9401 1144")), LINKS_NONE));
        contacts.put("129", new Contact("129", "Belmay Primary School",
                new Address("", "410", "Sydenham St", "Cloverdale", "WA", "6105", new Geocode("-31.949913", "115.9459")), Lists.<Telecom>newArrayList(new Telecom("130", TelecomType.PHONE, "(08) 9479 1393")), LINKS_NONE));
        contacts.put("131", new Contact("131", "Belmont Primary School",
                new Address("", "213", "Great Eastern Hwy", "Belmont", "WA", "6104", new Geocode("-31.943873", "115.922371")), Lists.<Telecom>newArrayList(new Telecom("132", TelecomType.PHONE, "(08) 9277 1299")), LINKS_NONE));
        contacts.put("133", new Contact("133", "Bentley Primary School",
                new Address("", "15", "Hedley St", "Bentley", "WA", "6102", new Geocode("-32.011622", "115.911642")), Lists.<Telecom>newArrayList(new Telecom("134", TelecomType.PHONE, "(08) 9351 8813")), LINKS_NONE));
        contacts.put("135", new Contact("135", "Bertram Primary School",
                new Address("", "", "Champion Drv", "Bertram", "WA", "6167", null), Lists.<Telecom>newArrayList(new Telecom("136", TelecomType.PHONE, "(08) 9419 1762")), LINKS_NONE));
        contacts.put("137", new Contact("137", "Bibra Lake Primary School",
                new Address("", "29", "Annois Rd", "Bibra Lake", "WA", "6163", new Geocode("-32.094106", "115.840302")), Lists.<Telecom>newArrayList(new Telecom("138", TelecomType.PHONE, "(08) 9417 3303")), LINKS_NONE));
        contacts.put("139", new Contact("139", "Bicton Primary School",
                new Address("", "", "View Tce", "Bicton", "WA", "6157", null), Lists.<Telecom>newArrayList(new Telecom("140", TelecomType.PHONE, "(08) 9339 3659")), LINKS_NONE));
        contacts.put("141", new Contact("141", "Bindoon Primary School",
                new Address("", "19", "Learners Way", "Bindoon", "WA", "6502", null), Lists.<Telecom>newArrayList(new Telecom("142", TelecomType.PHONE, "(08) 9576 1097")), LINKS_NONE));
        contacts.put("143", new Contact("143", "Bletchley Park Primary School",
                new Address("", "Lot 5003", "Balfour St", "Southern River", "WA", "6110", null), Lists.<Telecom>newArrayList(new Telecom("144", TelecomType.PHONE, "(08) 9394 0955")), LINKS_NONE));
        contacts.put("145", new Contact("145", "Booragoon Primary School",
                new Address("", "10", "Clements Rd", "Booragoon", "WA", "6154", new Geocode("-32.034432", "115.825501")), Lists.<Telecom>newArrayList(new Telecom("146", TelecomType.PHONE, "(08) 9317 2133")), LINKS_NONE));
        contacts.put("147", new Contact("147", "Boyare Primary School",
                new Address("", "9", "Threadleaf Way (cnr Appleblossom Drv)", "Mirrabooka", "WA", "6061", new Geocode("-31.858331", "115.873223")), Lists.<Telecom>newArrayList(new Telecom("148", TelecomType.PHONE, "(08) 9249 3440")), LINKS_NONE));
        contacts.put("149", new Contact("149", "Bramfield Park Primary School",
                new Address("", "", "Yule St", "Maddington", "WA", "6109", null), Lists.<Telecom>newArrayList(new Telecom("150", TelecomType.PHONE, "(08) 9459 6401")), LINKS_NONE));
        contacts.put("151", new Contact("151", "Brentwood Primary School",
                new Address("", "45", "Moolyeen Rd", "Brentwood", "WA", "6153", new Geocode("-32.042217", "115.848379")), Lists.<Telecom>newArrayList(new Telecom("152", TelecomType.PHONE, "(08) 9364 2709")), LINKS_NONE));
        contacts.put("153", new Contact("153", "Brookman Primary School",
                new Address("", "34", "Brookman Av", "Langford", "WA", "6147", new Geocode("-32.037724", "115.938211")), Lists.<Telecom>newArrayList(new Telecom("154", TelecomType.PHONE, "(08) 9458 5542")), LINKS_NONE));
        contacts.put("155", new Contact("155", "Bull Creek Primary School",
                new Address("", "32", "Hardy St", "Bull Creek", "WA", "6149", new Geocode("-32.060881", "115.860297")), Lists.<Telecom>newArrayList(new Telecom("156", TelecomType.PHONE, "(08) 9332 3244")), LINKS_NONE));
        contacts.put("157", new Contact("157", "Bullsbrook Primary School",
                new Address("", "", "Chittering Rd", "Bullsbrook", "WA", "6084", null), Lists.<Telecom>newArrayList(new Telecom("158", TelecomType.PHONE, "(08) 9571 1220")), LINKS_NONE));
        contacts.put("159", new Contact("159", "Bungaree Primary School",
                new Address("", "9", "Centaurus St", "Rockingham", "WA", "6168", new Geocode("-32.290357", "115.737763")), Lists.<Telecom>newArrayList(new Telecom("160", TelecomType.PHONE, "(08) 9528 2200")), LINKS_NONE));
        contacts.put("161", new Contact("161", "Burrendah Primary School",
                new Address("", "", "Castlereagh Cl", "Willetton", "WA", "6155", null), Lists.<Telecom>newArrayList(new Telecom("162", TelecomType.PHONE, "(08) 9332 3700")), LINKS_NONE));
        contacts.put("163", new Contact("163", "Butler Primary School",
                new Address("", "", "Tollesbury Ave", "Butler", "WA", "6036", null), Lists.<Telecom>newArrayList(new Telecom("164", TelecomType.PHONE, "(08) 9562 1804")), LINKS_NONE));
        contacts.put("165", new Contact("165", "Byford Primary School",
                new Address("", "36", "Clifton St", "Byford", "WA", "6122", new Geocode("-32.220318", "116.012226")), Lists.<Telecom>newArrayList(new Telecom("166", TelecomType.PHONE, "(08) 9525 1337")), LINKS_NONE));
        contacts.put("167", new Contact("167", "Caladenia Primary School",
                new Address("", "89", "Fraser Rd North", "Canning Vale", "WA", "6155", new Geocode("-32.076199", "115.933707")), Lists.<Telecom>newArrayList(new Telecom("168", TelecomType.PHONE, "(08) 9456 1144")), LINKS_NONE));
        contacts.put("169", new Contact("169", "Calista Primary School",
                new Address("", "1", "Chilcott St", "Calista", "WA", "6167", new Geocode("-32.245812", "115.809473")), Lists.<Telecom>newArrayList(new Telecom("170", TelecomType.PHONE, "(08) 9419 2355")), LINKS_NONE));
        contacts.put("171", new Contact("171", "Camboon Primary School",
                new Address("", "", "Forder Rd", "Noranda", "WA", "6062", null), Lists.<Telecom>newArrayList(new Telecom("172", TelecomType.PHONE, "(08) 9276 5832")), LINKS_NONE));
        contacts.put("173", new Contact("173", "Campbell Primary School",
                new Address("", "", "Campbell Rd", "Canning Vale", "WA", "6155", null), Lists.<Telecom>newArrayList(new Telecom("174", TelecomType.PHONE, "(08) 9456 8300")), LINKS_NONE));
        contacts.put("175", new Contact("175", "Canning Vale Primary School",
                new Address("", "", "The Ramble", "Canning Vale", "WA", "6155", null), Lists.<Telecom>newArrayList(new Telecom("176", TelecomType.PHONE, "(08) 9455 4788")), LINKS_NONE));
        contacts.put("177", new Contact("177", "Caralee Community",
                new Address("", "24", "Winnacott St", "Willagee", "WA", "6156", new Geocode("-32.049391", "115.80544")), Lists.<Telecom>newArrayList(new Telecom("178", TelecomType.PHONE, "(08) 9314 1677")), LINKS_NONE));
        contacts.put("179", new Contact("179", "Carcoola Primary School",
                new Address("", "", "Wisteria Crs North", "Pinjarra", "WA", "6208", null), Lists.<Telecom>newArrayList(new Telecom("180", TelecomType.PHONE, "(08) 9531 1399")), LINKS_NONE));
        contacts.put("181", new Contact("181", "Carine Primary School",
                new Address("", "58", "Osmaston Rd", "Carine", "WA", "6020", new Geocode("-31.850579", "115.773339")), Lists.<Telecom>newArrayList(new Telecom("182", TelecomType.PHONE, "(08) 9447 4266")), LINKS_NONE));
        contacts.put("183", new Contact("183", "Carlisle Primary School",
                new Address("", "271", "Orrong Rd", "Kewdale", "WA", "6105", new Geocode("-31.973583", "115.92116")), Lists.<Telecom>newArrayList(new Telecom("184", TelecomType.PHONE, "(08) 9470 3800")), LINKS_NONE));
        contacts.put("185", new Contact("185", "Carramar Primary School",
                new Address("", "71", "Houghton Dr", "Carramar", "WA", "6031", new Geocode("-31.712076", "115.785323")), Lists.<Telecom>newArrayList(new Telecom("186", TelecomType.PHONE, "(08) 9405 0600")), LINKS_NONE));
        contacts.put("187", new Contact("187", "Caversham Primary School",
                new Address("", "65", "Coast Rd", "West Swan", "WA", "6055", new Geocode("-31.857573", "115.982881")), Lists.<Telecom>newArrayList(new Telecom("188", TelecomType.PHONE, "(08) 9250 2711")), LINKS_NONE));
        contacts.put("189", new Contact("189", "Challis Primary School",
                new Address("", "40", "Braemore St", "Armadale", "WA", "6112", new Geocode("-32.138438", "115.999972")), Lists.<Telecom>newArrayList(new Telecom("190", TelecomType.PHONE, "(08) 9399 3255")), LINKS_NONE));
        contacts.put("191", new Contact("191", "Challis Early Childhood Education Centre",
                new Address("", "40", "Braemore St", "Armadale", "WA", "6112", new Geocode("-32.138438", "115.999972")), Lists.<Telecom>newArrayList(new Telecom("192", TelecomType.PHONE, "(08) 9399 5851")), LINKS_NONE));
        contacts.put("193", new Contact("193", "Charthouse Primary School",
                new Address("", "43", "Rand Av", "Waikiki", "WA", "6169", new Geocode("-32.318375", "115.751039")), Lists.<Telecom>newArrayList(new Telecom("194", TelecomType.PHONE, "(08) 9592 3322")), LINKS_NONE));
        contacts.put("195", new Contact("195", "Chidlow Primary School",
                new Address("", "450", "Lilydale Rd", "Chidlow", "WA", "6556", new Geocode("-31.857128", "116.268058")), Lists.<Telecom>newArrayList(new Telecom("196", TelecomType.PHONE, "(08) 9572 4132")), LINKS_NONE));
        contacts.put("197", new Contact("197", "Churchlands Primary School",
                new Address("", "", "Cromarty Rd", "Floreat", "WA", "6014", null), Lists.<Telecom>newArrayList(new Telecom("198", TelecomType.PHONE, "(08) 9383 9022")), LINKS_NONE));
        contacts.put("199", new Contact("199", "City Beach Primary School",
                new Address("", "30", "Marapana Rd", "City Beach", "WA", "6015", new Geocode("-31.935887", "115.764358")), Lists.<Telecom>newArrayList(new Telecom("200", TelecomType.PHONE, "(08) 9385 9006")), LINKS_NONE));
        contacts.put("201", new Contact("201", "Clarkson Primary School",
                new Address("", "8", "Aldersea Crcle", "Clarkson", "WA", "6030", new Geocode("-31.676573", "115.717615")), Lists.<Telecom>newArrayList(new Telecom("202", TelecomType.PHONE, "(08) 9305 1800")), LINKS_NONE));
        contacts.put("203", new Contact("203", "Clayton View Primary School",
                new Address("", "211", "Clayton St", "Koongamia", "WA", "6056", null), Lists.<Telecom>newArrayList(new Telecom("204", TelecomType.PHONE, "(08) 9294 1566")), LINKS_NONE));
        contacts.put("205", new Contact("205", "Clifton Hills Primary School",
                new Address("", "50", "Connell Av", "Kelmscott", "WA", "6111", new Geocode("-32.109485", "116.022202")), Lists.<Telecom>newArrayList(new Telecom("206", TelecomType.PHONE, "(08) 9390 5922")), LINKS_NONE));
        contacts.put("207", new Contact("207", "Cloverdale Primary School",
                new Address("", "180", "Fisher St", "Cloverdale", "WA", "6105", new Geocode("-31.957869", "115.935312")), Lists.<Telecom>newArrayList(new Telecom("208", TelecomType.PHONE, "(08) 9277 2960")), LINKS_NONE));
        contacts.put("209", new Contact("209", "Collier Primary School",
                new Address("", "17", "Hobbs Av", "Como", "WA", "6152", new Geocode("-31.990785", "115.873208")), Lists.<Telecom>newArrayList(new Telecom("210", TelecomType.PHONE, "(08) 9474 3626")), LINKS_NONE));
        contacts.put("211", new Contact("211", "Comet Bay Primary School",
                new Address("", "85", "Miltona Dr", "Secret Harbour", "WA", "6173", new Geocode("-32.410447", "115.76965")), Lists.<Telecom>newArrayList(new Telecom("212", TelecomType.PHONE, "(08) 9524 9033")), LINKS_NONE));
        contacts.put("213", new Contact("213", "Como Primary School",
                new Address("", "29", "Thelma St", "Como", "WA", "6152", new Geocode("-31.99632", "115.861348")), Lists.<Telecom>newArrayList(new Telecom("214", TelecomType.PHONE, "(08) 9450 3112")), LINKS_NONE));
        contacts.put("215", new Contact("215", "Connolly Primary School",
                new Address("", "", "Fairway Crcle", "Connolly", "WA", "6027", null), Lists.<Telecom>newArrayList(new Telecom("216", TelecomType.PHONE, "(08) 9300 2199")), LINKS_NONE));
        contacts.put("217", new Contact("217", "Coogee Primary School",
                new Address("", "22", "Mayor Rd", "Coogee", "WA", "6166", new Geocode("-32.125904", "115.771836")), Lists.<Telecom>newArrayList(new Telecom("218", TelecomType.PHONE, "(08) 9418 1088")), LINKS_NONE));
        contacts.put("219", new Contact("219", "Coolbellup Community School",
                new Address("", "15", "Waverley Rd", "Coolbellup", "WA", "6163", new Geocode("-32.080407", "115.808703")), Lists.<Telecom>newArrayList(new Telecom("220", TelecomType.PHONE, "(08) 9337 3268")), LINKS_NONE));
        contacts.put("221", new Contact("221", "Coolbinia Primary School",
                new Address("", "", "Bradford St", "Coolbinia", "WA", "6050", null), Lists.<Telecom>newArrayList(new Telecom("222", TelecomType.PHONE, "(08) 9444 3798")), LINKS_NONE));
        contacts.put("223", new Contact("223", "Cooloongup Primary School",
                new Address("", "21", "Westerly Wy", "Cooloongup", "WA", "6168", new Geocode("-32.298447", "115.754091")), Lists.<Telecom>newArrayList(new Telecom("224", TelecomType.PHONE, "(08) 9527 5966")), LINKS_NONE));
        contacts.put("225", new Contact("225", "Cottesloe Primary School",
                new Address("", "530", "Stirling Hwy", "Peppermint Grove", "WA", "6011", new Geocode("-32.002254", "115.760536")), Lists.<Telecom>newArrayList(new Telecom("226", TelecomType.PHONE, "(08) 9384 2426")), LINKS_NONE));
        contacts.put("227", new Contact("227", "Craigie Heights Primary School",
                new Address("", "47", "Spinaway St", "Craigie", "WA", "6025", new Geocode("-31.789091", "115.760272")), Lists.<Telecom>newArrayList(new Telecom("228", TelecomType.PHONE, "(08) 9401 7711")), LINKS_NONE));
        contacts.put("229", new Contact("229", "Creaney Primary School",
                new Address("", "6", "Creaney Dr", "Kingsley", "WA", "6026", new Geocode("-31.803345", "115.788631")), Lists.<Telecom>newArrayList(new Telecom("230", TelecomType.PHONE, "(08) 9309 1588")), LINKS_NONE));
        contacts.put("231", new Contact("231", "Currambine Primary School",
                new Address("", "28", "Ambassador Dr", "Currambine", "WA", "6028", new Geocode("-31.732695", "115.748986")), Lists.<Telecom>newArrayList(new Telecom("232", TelecomType.PHONE, "(08) 9304 0011")), LINKS_NONE));
        contacts.put("233", new Contact("233", "Curtin Primary School",
                new Address("", "20", "Goss Av", "Manning", "WA", "6152", new Geocode("-32.007382", "115.87306")), Lists.<Telecom>newArrayList(new Telecom("234", TelecomType.PHONE, "(08) 9313 1051")), LINKS_NONE));
        contacts.put("235", new Contact("235", "Dalkeith Primary School",
                new Address("", "44", "Circe Cir", "Dalkeith", "WA", "6009", new Geocode("-31.996973", "115.797871")), Lists.<Telecom>newArrayList(new Telecom("236", TelecomType.PHONE, "(08) 9386 3710")), LINKS_NONE));
        contacts.put("237", new Contact("237", "Dalkeith Pre Primary & Kindergarten",
                new Address("", "167", "Victoria Av", "Dalkeith", "WA", "6009", new Geocode("-32.000607", "115.792215")), Lists.<Telecom>newArrayList(new Telecom("238", TelecomType.PHONE, "(08) 9386 6353")), LINKS_NONE));
        contacts.put("239", new Contact("239", "Dalmain Primary School",
                new Address("", "64", "Dalmain St", "Kingsley", "WA", "6026", new Geocode("-31.814666", "115.790704")), Lists.<Telecom>newArrayList(new Telecom("240", TelecomType.PHONE, "(08) 9309 3711")), LINKS_NONE));
        contacts.put("241", new Contact("241", "Darlington Primary School",
                new Address("", "Lot 7", "Amherst Av", "Darlington", "WA", "6070", new Geocode("-31.921593", "116.077795")), Lists.<Telecom>newArrayList(new Telecom("242", TelecomType.PHONE, "(08) 9299 6888")), LINKS_NONE));
        contacts.put("243", new Contact("243", "Davallia Primary School",
                new Address("", "6", "Juniper Wy", "Duncraig", "WA", "6023", new Geocode("-31.841648", "115.786839")), Lists.<Telecom>newArrayList(new Telecom("244", TelecomType.PHONE, "(08) 9447 6633")), LINKS_NONE));
        contacts.put("245", new Contact("245", "Dawson Park Primary School",
                new Address("", "120", "Bougainvillea Av", "Forrestfield", "WA", "6058", new Geocode("-31.97879", "115.999218")), Lists.<Telecom>newArrayList(new Telecom("246", TelecomType.PHONE, "(08) 9453 2499")), LINKS_NONE));
        contacts.put("247", new Contact("247", "Deanmore Primary School",
                new Address("", "21", "Deanmore Rd", "Karrinyup", "WA", "6018", new Geocode("-31.883238", "115.767844")), Lists.<Telecom>newArrayList(new Telecom("248", TelecomType.PHONE, "(08) 9341 1610")), LINKS_NONE));
        contacts.put("249", new Contact("249", "Dianella Heights Primary School",
                new Address("", "9", "Beaman St", "Dianella", "WA", "6059", new Geocode("-31.883421", "115.866745")), Lists.<Telecom>newArrayList(new Telecom("250", TelecomType.PHONE, "(08) 9375 3622")), LINKS_NONE));
        contacts.put("251", new Contact("251", "Doubleview Primary School",
                new Address("", "203", "St Brigids Tce", "Doubleview", "WA", "6018", new Geocode("-31.897918", "115.776476")), Lists.<Telecom>newArrayList(new Telecom("252", TelecomType.PHONE, "(08) 9446 1009")), LINKS_NONE));
        contacts.put("253", new Contact("253", "Dryandra Primary School",
                new Address("", "45", "Dryandra Dr", "Mirrabooka", "WA", "6061", new Geocode("-31.855981", "115.862981")), Lists.<Telecom>newArrayList(new Telecom("254", TelecomType.PHONE, "(08) 9247 1499")), LINKS_NONE));
        contacts.put("255", new Contact("255", "Dudley Park Primary School",
                new Address("", "", "Gillark St", "Mandurah", "WA", "6210", null), Lists.<Telecom>newArrayList(new Telecom("256", TelecomType.PHONE, "(08) 9535 9533")), LINKS_NONE));
        contacts.put("257", new Contact("257", "Duncraig Primary School",
                new Address("", "21", "Roche Rd", "Duncraig", "WA", "6023", new Geocode("-31.83272", "115.770066")), Lists.<Telecom>newArrayList(new Telecom("258", TelecomType.PHONE, "(08) 9447 8255")), LINKS_NONE));
        contacts.put("259", new Contact("259", "Dwellingup Primary School",
                new Address("", "10", "Newton St", "Dwellingup", "WA", "6213", new Geocode("-32.715667", "116.063284")), Lists.<Telecom>newArrayList(new Telecom("260", TelecomType.PHONE, "(08) 9538 1026")), LINKS_NONE));
        contacts.put("261", new Contact("261", "East Beechboro Primary School",
                new Address("", "", "Brockmill Ave", "Beechboro", "WA", "6063", null), Lists.<Telecom>newArrayList(new Telecom("262", TelecomType.PHONE, "(08) 9279 7299")), LINKS_NONE));
        contacts.put("263", new Contact("263", "East Butler Primary School",
                new Address("", "7", "Amersham Cr", "Butler", "WA", "6036", new Geocode("-31.643771", "115.712799")), Lists.<Telecom>newArrayList(new Telecom("264", TelecomType.PHONE, "(08) 9562 4344")), LINKS_NONE));
        contacts.put("265", new Contact("265", "East Fremantle Primary School",
                new Address("", "8", "Forrest St", "East Fremantle", "WA", "6160", new Geocode("-32.048505", "115.759156")), Lists.<Telecom>newArrayList(new Telecom("266", TelecomType.PHONE, "(08) 9335 6136")), LINKS_NONE));
        contacts.put("267", new Contact("267", "East Hamersley Primary School",
                new Address("", "20", "Doon Wy", "Hamersley", "WA", "6022", new Geocode("-31.847827", "115.817526")), Lists.<Telecom>newArrayList(new Telecom("268", TelecomType.PHONE, "(08) 9342 2002")), LINKS_NONE));
        contacts.put("269", new Contact("269", "East Hamilton Hill Primary School",
                new Address("", "27", "Bradbury Rd", "Hamilton Hill", "WA", "6163", new Geocode("-32.076722", "115.78929")), Lists.<Telecom>newArrayList(new Telecom("270", TelecomType.PHONE, "(08) 9337 1410")), LINKS_NONE));
        contacts.put("271", new Contact("271", "East Kenwick Primary School",
                new Address("", "96", "Kenwick Rd", "Kenwick", "WA", "6107", new Geocode("-32.033518", "115.980299")), Lists.<Telecom>newArrayList(new Telecom("272", TelecomType.PHONE, "(08) 9459 1251")), LINKS_NONE));
        contacts.put("273", new Contact("273", "East Maddington Primary School",
                new Address("", "79", "Pitchford Av", "Maddington", "WA", "6109", new Geocode("-32.054905", "116.003052")), Lists.<Telecom>newArrayList(new Telecom("274", TelecomType.PHONE, "(08) 9459 1166")), LINKS_NONE));
        contacts.put("275", new Contact("275", "East Victoria Park Primary School",
                new Address("", "", "Beatty Ave", "East Victoria Park", "WA", "6101", null), Lists.<Telecom>newArrayList(new Telecom("276", TelecomType.PHONE, "(08) 9361 0545")), LINKS_NONE));
        contacts.put("277", new Contact("277", "East Waikiki Primary School",
                new Address("", "21", "Gibb Rd", "Cooloongup", "WA", "6168", new Geocode("-32.304806", "115.760838")), Lists.<Telecom>newArrayList(new Telecom("278", TelecomType.PHONE, "(08) 9528 3000")), LINKS_NONE));
        contacts.put("279", new Contact("279", "East Wanneroo Primary School",
                new Address("", "32", "High Rd", "Wanneroo", "WA", "6065", new Geocode("-31.75564", "115.816752")), Lists.<Telecom>newArrayList(new Telecom("280", TelecomType.PHONE, "(08) 9405 1139")), LINKS_NONE));
        contacts.put("281", new Contact("281", "Eddystone Primary School",
                new Address("", "", "Littorina Ave", "Heathridge", "WA", "6027", null), Lists.<Telecom>newArrayList(new Telecom("282", TelecomType.PHONE, "(08) 9307 2354")), LINKS_NONE));
        contacts.put("283", new Contact("283", "Eden Hill Primary School",
                new Address("", "83a", "Ivanhoe St", "Eden Hill", "WA", "6054", new Geocode("-31.891931", "115.946261")), Lists.<Telecom>newArrayList(new Telecom("284", TelecomType.PHONE, "(08) 9377 4988")), LINKS_NONE));
        contacts.put("285", new Contact("285", "Edgewater Primary School",
                new Address("", "76", "Treetop Av", "Edgewater", "WA", "6027", new Geocode("-31.763483", "115.779829")), Lists.<Telecom>newArrayList(new Telecom("286", TelecomType.PHONE, "(08) 9405 4007")), LINKS_NONE));
        contacts.put("287", new Contact("287", "Edney Primary School",
                new Address("", "204", "Newburn Rd", "High Wycombe", "WA", "6057", new Geocode("-31.948114", "116.006404")), Lists.<Telecom>newArrayList(new Telecom("288", TelecomType.PHONE, "(08) 9454 8377")), LINKS_NONE));
        contacts.put("289", new Contact("289", "Ellen Stirling Primary School",
                new Address("", "23", "Strathmore Pky", "Ellenbrook", "WA", "6069", new Geocode("-31.771349", "115.975875")), Lists.<Telecom>newArrayList(new Telecom("290", TelecomType.PHONE, "(08) 6296 7155")), LINKS_NONE));
        contacts.put("291", new Contact("291", "Ellenbrook Primary School",
                new Address("", "65", "Fortescue Pl", "Ellenbrook", "WA", "6069", new Geocode("-31.791119", "115.974974")), Lists.<Telecom>newArrayList(new Telecom("292", TelecomType.PHONE, "(08) 9296 9088")), LINKS_NONE));
        contacts.put("293", new Contact("293", "Embleton Primary School",
                new Address("", "51", "Priestley St", "Embleton", "WA", "6062", new Geocode("-31.901611", "115.908585")), Lists.<Telecom>newArrayList(new Telecom("294", TelecomType.PHONE, "(08) 9271 4019")), LINKS_NONE));
        contacts.put("295", new Contact("295", "Endeavour Primary School",
                new Address("", "38", "Endeavour Dr", "Port Kennedy", "WA", "6172", new Geocode("-32.370155", "115.752185")), Lists.<Telecom>newArrayList(new Telecom("296", TelecomType.PHONE, "(08) 9524 5000")), LINKS_NONE));
        contacts.put("297", new Contact("297", "Excelsior Primary School",
                new Address("", "63", "Shreeve Rd", "Canning Vale DC", "WA", "6155", new Geocode("-32.082874", "115.943545")), Lists.<Telecom>newArrayList(new Telecom("298", TelecomType.PHONE, "(08) 9455 5811")), LINKS_NONE));
        contacts.put("299", new Contact("299", "Falcon Primary School",
                new Address("", "30", "Baloo Cr", "Falcon", "WA", "6210", new Geocode("-32.59235", "115.644502")), Lists.<Telecom>newArrayList(new Telecom("300", TelecomType.PHONE, "(08) 9534 2411")), LINKS_NONE));
        contacts.put("301", new Contact("301", "Falls Road Primary School",
                new Address("", "50", "Falls Rd", "Lesmurdie", "WA", "6076", new Geocode("-31.993147", "116.047068")), Lists.<Telecom>newArrayList(new Telecom("302", TelecomType.PHONE, "(08) 9291 8200")), LINKS_NONE));
        contacts.put("303", new Contact("303", "Floreat Park Primary School",
                new Address("", "38", "Chandler Av", "Floreat", "WA", "6014", new Geocode("-31.937385", "115.790816")), Lists.<Telecom>newArrayList(new Telecom("304", TelecomType.PHONE, "(08) 9387 1548")), LINKS_NONE));
        contacts.put("305", new Contact("305", "Forest Crescent Primary & Pre-Primary School",
                new Address("", "83", "Forest Cr", "Thornlie", "WA", "6108", new Geocode("-32.07689", "115.95058")), Lists.<Telecom>newArrayList(new Telecom("306", TelecomType.PHONE, "(08) 9493 6922")), LINKS_NONE));
        contacts.put("307", new Contact("307", "Forrestdale Primary School",
                new Address("", "35", "Broome St", "Forrestdale", "WA", "6112", new Geocode("-32.152608", "115.948539")), Lists.<Telecom>newArrayList(new Telecom("308", TelecomType.PHONE, "(08) 9397 0393")), LINKS_NONE));
        contacts.put("310", new Contact("310", "Forrestfield Primary School",
                new Address("", "45", "Sussex Rd", "Forrestfield", "WA", "6058", new Geocode("-31.990373", "116.008706")), Lists.<Telecom>newArrayList(new Telecom("311", TelecomType.PHONE, "(08) 9453 6277")), LINKS_NONE));
        contacts.put("312", new Contact("312", "Fremantle Primary School",
                new Address("", "1", "Brennan St", "Fremantle", "WA", "6160", new Geocode("-32.059062", "115.752877")), Lists.<Telecom>newArrayList(new Telecom("313", TelecomType.PHONE, "(08) 9335 3647")), LINKS_NONE));
        contacts.put("314", new Contact("314", "Freshwater Primary School",
                new Address("", "", "Bay View Tce", "Claremont", "WA", "6010", null), Lists.<Telecom>newArrayList(new Telecom("315", TelecomType.PHONE, "(08) 9384 0293")), LINKS_NONE));
        contacts.put("316", new Contact("316", "Gibbs Street Primary School",
                new Address("", "79-93", "Gibbs St", "Cannington", "WA", "6107", new Geocode("-32.00775", "115.953093")), Lists.<Telecom>newArrayList(new Telecom("317", TelecomType.PHONE, "(08) 9458 6899")), LINKS_NONE));
        contacts.put("318", new Contact("318", "Gidgegannup Primary School",
                new Address("", "", "Bunning Rd", "Gidgegannup", "WA", "6083", null), Lists.<Telecom>newArrayList(new Telecom("319", TelecomType.PHONE, "(08) 9574 6344")), LINKS_NONE));
        contacts.put("320", new Contact("320", "Glen Forrest Primary School",
                new Address("", "", "Tillbrook St", "Glen Forrest", "WA", "6071", null), Lists.<Telecom>newArrayList(new Telecom("321", TelecomType.PHONE, "(08) 9298 8202")), LINKS_NONE));
        contacts.put("322", new Contact("322", "Glencoe Primary School",
                new Address("", "12", "Brigadoon Cl", "Halls Head", "WA", "6210", new Geocode("-32.541151", "115.704059")), Lists.<Telecom>newArrayList(new Telecom("323", TelecomType.PHONE, "(08) 9535 3445")), LINKS_NONE));
        contacts.put("324", new Contact("324", "Glendale Primary School",
                new Address("", "", "Glendale Ave", "Hamersley", "WA", "6022", null), Lists.<Telecom>newArrayList(new Telecom("325", TelecomType.PHONE, "(08) 9447 4199")), LINKS_NONE));
        contacts.put("326", new Contact("326", "Glengarry Primary School",
                new Address("", "25", "Doveridge Dr", "Duncraig", "WA", "6023", new Geocode("-31.828184", "115.782903")), Lists.<Telecom>newArrayList(new Telecom("327", TelecomType.PHONE, "(08) 9448 4866")), LINKS_NONE));
        contacts.put("328", new Contact("328", "Goollelal Primary School",
                new Address("", "30", "Cadogan St", "Kingsley", "WA", "6026", new Geocode("-31.815739", "115.801094")), Lists.<Telecom>newArrayList(new Telecom("329", TelecomType.PHONE, "(08) 9409 8432")), LINKS_NONE));
        contacts.put("330", new Contact("330", "Gooseberry Hill Primary School",
                new Address("", "24", "Ledger Rd", "Gooseberry Hill", "WA", "6076", new Geocode("-31.955081", "116.056019")), Lists.<Telecom>newArrayList(new Telecom("331", TelecomType.PHONE, "(08) 9293 2777")), LINKS_NONE));
        contacts.put("332", new Contact("332", "Gosnells Primary School",
                new Address("", "173", "Hicks St", "Gosnells", "WA", "6110", new Geocode("-32.077068", "116.004107")), Lists.<Telecom>newArrayList(new Telecom("333", TelecomType.PHONE, "(08) 9398 2250")), LINKS_NONE));
        contacts.put("334", new Contact("334", "Greenfields Primary School",
                new Address("", "9", "Zambesi Dr", "Greenfields", "WA", "6210", new Geocode("-32.534804", "115.750266")), Lists.<Telecom>newArrayList(new Telecom("335", TelecomType.PHONE, "(08) 9581 1976")), LINKS_NONE));
        contacts.put("336", new Contact("336", "Greenmount Primary School",
                new Address("", "50-68", "Innamincka Rd", "Greenmount", "WA", "6056", new Geocode("-31.897802", "116.047064")), Lists.<Telecom>newArrayList(new Telecom("337", TelecomType.PHONE, "(08) 9294 1155")), LINKS_NONE));
        contacts.put("338", new Contact("338", "Greenwood Primary School",
                new Address("", "12", "Merivale Wy", "Greenwood", "WA", "6024", new Geocode("-31.829113", "115.808011")), Lists.<Telecom>newArrayList(new Telecom("339", TelecomType.PHONE, "(08) 9243 1143")), LINKS_NONE));
        contacts.put("340", new Contact("340", "Grovelands Primary School",
                new Address("", "", "Grovelands Drv", "Westfield", "WA", "6111", null), Lists.<Telecom>newArrayList(new Telecom("341", TelecomType.PHONE, "(08) 9390 8411")), LINKS_NONE));
        contacts.put("342", new Contact("342", "Guildford Primary School",
                new Address("", "125", "Helena St", "Guildford", "WA", "6055", new Geocode("-31.901404", "115.967803")), Lists.<Telecom>newArrayList(new Telecom("343", TelecomType.PHONE, "(08) 9377 3255")), LINKS_NONE));
        contacts.put("344", new Contact("344", "Gwynne Park Primary School",
                new Address("", "", "Tijuana Rd", "Armadale", "WA", "6112", null), Lists.<Telecom>newArrayList(new Telecom("345", TelecomType.PHONE, "(08) 9399 4200")), LINKS_NONE));
        contacts.put("346", new Contact("346", "Halidon Primary School",
                new Address("", "38", "Halidon St", "Kingsley", "WA", "6026", new Geocode("-31.808724", "115.801402")), Lists.<Telecom>newArrayList(new Telecom("347", TelecomType.PHONE, "(08) 9409 9288")), LINKS_NONE));
        contacts.put("348", new Contact("348", "Halls Head Primary School",
                new Address("", "21", "Oleander Pl", "Halls Head", "WA", "6210", new Geocode("-32.551107", "115.694937")), Lists.<Telecom>newArrayList(new Telecom("349", TelecomType.PHONE, "(08) 9582 9011")), LINKS_NONE));
        contacts.put("350", new Contact("350", "Hampton Park Primary School",
                new Address("", "", "Hamersley Pl", "Morley", "WA", "6062", null), Lists.<Telecom>newArrayList(new Telecom("351", TelecomType.PHONE, "(08) 9276 3044")), LINKS_NONE));
        contacts.put("352", new Contact("352", "Harmony Primary School",
                new Address("", "", "Aurora Drv", "South Atwell", "WA", "6164", null), Lists.<Telecom>newArrayList(new Telecom("353", TelecomType.PHONE, "(08) 9498 6333")), LINKS_NONE));
        contacts.put("354", new Contact("354", "Hawker Primary School",
                new Address("", "47", "Hawker Av", "Warwick", "WA", "6024", new Geocode("-31.841685", "115.796882")), Lists.<Telecom>newArrayList(new Telecom("355", TelecomType.PHONE, "(08) 9448 6750")), LINKS_NONE));
        contacts.put("356", new Contact("356", "Heathridge Primary School",
                new Address("", "55", "Channel Dr", "Heathridge", "WA", "6027", new Geocode("-31.761348", "115.76021")), Lists.<Telecom>newArrayList(new Telecom("357", TelecomType.PHONE, "(08) 9401 8088")), LINKS_NONE));
        contacts.put("358", new Contact("358", "Helena Valley Primary School",
                new Address("", "", "Helena Valley Rd", "Helena Valley", "WA", "6056", null), Lists.<Telecom>newArrayList(new Telecom("359", TelecomType.PHONE, "(08) 9294 1062")), LINKS_NONE));
        contacts.put("360", new Contact("360", "Herne Hill Primary School",
                new Address("", "60", "Argyle St", "Herne Hill", "WA", "6056", new Geocode("-31.829195", "116.022361")), Lists.<Telecom>newArrayList(new Telecom("361", TelecomType.PHONE, "(08) 9296 4911")), LINKS_NONE));
        contacts.put("362", new Contact("362", "High Wycombe Primary School",
                new Address("", "60", "Newburn Rd", "High Wycombe", "WA", "6057", new Geocode("-31.940584", "116.001721")), Lists.<Telecom>newArrayList(new Telecom("363", TelecomType.PHONE, "(08) 9454 5280")), LINKS_NONE));
        contacts.put("364", new Contact("364", "Highgate Primary School",
                new Address("", "147", "Lincoln St", "Highgate", "WA", "6003", new Geocode("-31.940774", "115.867589")), Lists.<Telecom>newArrayList(new Telecom("365", TelecomType.PHONE, "(08) 9328 4201")), LINKS_NONE));
        contacts.put("366", new Contact("366", "Hillarys Primary School",
                new Address("", "75", "Lymburner Dr", "Hillarys", "WA", "6025", new Geocode("-31.812632", "115.753226")), Lists.<Telecom>newArrayList(new Telecom("367", TelecomType.PHONE, "(08) 9307 6365")), LINKS_NONE));
        contacts.put("368", new Contact("368", "Hillcrest Primary School",
                new Address("", "2", "Bay View St", "Bayswater", "WA", "6053", null), Lists.<Telecom>newArrayList(new Telecom("369", TelecomType.PHONE, "(08) 9370 2330")), LINKS_NONE));
        contacts.put("370", new Contact("370", "Hillman Primary School",
                new Address("", "", "Unnaro St", "Hillman", "WA", "6168", null), Lists.<Telecom>newArrayList(new Telecom("371", TelecomType.PHONE, "(08) 9527 3600")), LINKS_NONE));
        contacts.put("372", new Contact("372", "Hilton Primary School",
                new Address("", "21", "Rennie Crs North", "Hilton", "WA", "6163", new Geocode("-32.069051", "115.784143")), Lists.<Telecom>newArrayList(new Telecom("373", TelecomType.PHONE, "(08) 9337 1006")), LINKS_NONE));
        contacts.put("374", new Contact("374", "Hocking Primary School",
                new Address("", "", "Gungurru Ave", "Hocking", "WA", "6065", null), Lists.<Telecom>newArrayList(new Telecom("375", TelecomType.PHONE, "(08) 9404 8373")), LINKS_NONE));
        contacts.put("376", new Contact("376", "Hollywood Primary School",
                new Address("", "117", "Monash Av", "Nedlands", "WA", "6009", new Geocode("-31.970485", "115.807268")), Lists.<Telecom>newArrayList(new Telecom("377", TelecomType.PHONE, "(08) 9386 2343")), LINKS_NONE));
        contacts.put("378", new Contact("378", "Hudson Park Primary School",
                new Address("", "23", "Arnos Wy", "Girrawheen", "WA", "6064", new Geocode("-31.839471", "115.836382")), Lists.<Telecom>newArrayList(new Telecom("379", TelecomType.PHONE, "(08) 9342 4300")), LINKS_NONE));
        contacts.put("380", new Contact("380", "Huntingdale Primary School",
                new Address("", "85", "Matilda St", "Huntingdale", "WA", "6110", new Geocode("-32.076434", "115.972744")), Lists.<Telecom>newArrayList(new Telecom("381", TelecomType.PHONE, "(08) 9490 4944")), LINKS_NONE));
        contacts.put("382", new Contact("382", "Illawarra Primary School",
                new Address("", "", "Illawarra Crs north", "Ballajura", "WA", "6066", null), Lists.<Telecom>newArrayList(new Telecom("383", TelecomType.PHONE, "(08) 9249 1296")), LINKS_NONE));
        contacts.put("384", new Contact("384", "Inglewood Primary School",
                new Address("", "34", "Normanby Rd", "Inglewood", "WA", "6052", new Geocode("-31.91756", "115.886041")), Lists.<Telecom>newArrayList(new Telecom("385", TelecomType.PHONE, "(08) 9370 2900")), LINKS_NONE));
        contacts.put("386", new Contact("386", "Jandakot Primary School",
                new Address("", "53", "Baningan Av", "Success", "WA", "6164", new Geocode("-32.138571", "115.847129")), Lists.<Telecom>newArrayList(new Telecom("387", TelecomType.PHONE, "(08) 9417 4097")), LINKS_NONE));
        contacts.put("388", new Contact("388", "Jarrahdale Primary School",
                new Address("", "20", "Wanliss St", "Jarrahdale", "WA", "6124", new Geocode("-32.338153", "116.062098")), Lists.<Telecom>newArrayList(new Telecom("389", TelecomType.PHONE, "(08) 9525 5157")), LINKS_NONE));
        contacts.put("390", new Contact("390", "Jolimont Primary School",
                new Address("", "657", "Hay St", "Jolimont", "WA", "6014", new Geocode("-31.947756", "115.809412")), Lists.<Telecom>newArrayList(new Telecom("391", TelecomType.PHONE, "(08) 9387 2622")), LINKS_NONE));
        contacts.put("392", new Contact("392", "Joondalup Primary School",
                new Address("", "150", "Blue Mountain Dr", "Joondalup", "WA", "6027", new Geocode("-31.723106", "115.761054")), Lists.<Telecom>newArrayList(new Telecom("393", TelecomType.PHONE, "(08) 9300 0188")), LINKS_NONE));
        contacts.put("394", new Contact("394", "Kalamunda Primary School",
                new Address("", "32", "Heath Rd", "Kalamunda", "WA", "6076", new Geocode("-31.971738", "116.051153")), Lists.<Telecom>newArrayList(new Telecom("395", TelecomType.PHONE, "(08) 9257 1233")), LINKS_NONE));
        contacts.put("396", new Contact("396", "Kapinara Primary School",
                new Address("", "2", "Catesby St", "City Beach", "WA", "6015", new Geocode("-31.925955", "115.762951")), Lists.<Telecom>newArrayList(new Telecom("397", TelecomType.PHONE, "(08) 9385 9022")), LINKS_NONE));
        contacts.put("398", new Contact("398", "Kardinya Primary School",
                new Address("", "", "Ochiltree Way", "Kardinya", "WA", "6163", null), Lists.<Telecom>newArrayList(new Telecom("399", TelecomType.PHONE, "(08) 9337 7544")), LINKS_NONE));
        contacts.put("400", new Contact("400", "Karrinyup Primary School",
                new Address("", "15", "Hampton St", "Karrinyup", "WA", "6018", new Geocode("-31.87076", "115.776306")), Lists.<Telecom>newArrayList(new Telecom("401", TelecomType.PHONE, "(08) 9447 5400")), LINKS_NONE));
        contacts.put("402", new Contact("402", "Kelmscott Primary School",
                new Address("", "", "River Rd", "Kelmscott", "WA", "6111", null), Lists.<Telecom>newArrayList(new Telecom("403", TelecomType.PHONE, "(08) 9390 8011")), LINKS_NONE));
        contacts.put("404", new Contact("404", "Kensington Primary School",
                new Address("", "73", "Banksia Tce", "Kensington", "WA", "6151", new Geocode("-31.981484", "115.882642")), Lists.<Telecom>newArrayList(new Telecom("405", TelecomType.PHONE, "(08) 6436 8448")), LINKS_NONE));
        contacts.put("406", new Contact("406", "Kewdale Primary School",
                new Address("", "264", "Kew St", "Kewdale", "WA", "6105", new Geocode("-31.975226", "115.943308")), Lists.<Telecom>newArrayList(new Telecom("407", TelecomType.PHONE, "(08) 9277 2740")), LINKS_NONE));
        contacts.put("408", new Contact("408", "Kingsley Primary School",
                new Address("", "", "Lathwell St", "Armadale", "WA", "6112", null), Lists.<Telecom>newArrayList(new Telecom("409", TelecomType.PHONE, "(08) 9399 2684")), LINKS_NONE));
        contacts.put("410", new Contact("410", "Kinross Primary School",
                new Address("", "64", "Kinross Dr", "Kinross", "WA", "6028", new Geocode("-31.71912", "115.735694")), Lists.<Telecom>newArrayList(new Telecom("411", TelecomType.PHONE, "(08) 9305 6022")), LINKS_NONE));
        contacts.put("412", new Contact("412", "Koondoola Primary School",
                new Address("", "50", "Burbridge Av", "Koondoola", "WA", "6064", new Geocode("-31.837539", "115.861763")), Lists.<Telecom>newArrayList(new Telecom("413", TelecomType.PHONE, "(08) 9343 1044")), LINKS_NONE));
        contacts.put("414", new Contact("414", "Koorana Primary School",
                new Address("", "109", "Coronata Dr", "Warnbro", "WA", "6169", new Geocode("-32.341714", "115.765291")), Lists.<Telecom>newArrayList(new Telecom("415", TelecomType.PHONE, "(08) 9593 4022")), LINKS_NONE));
        contacts.put("416", new Contact("416", "Kyilla Primary School",
                new Address("", "", "Selkirk St", "North Perth", "WA", "6006", null), Lists.<Telecom>newArrayList(new Telecom("417", TelecomType.PHONE, "(08) 9444 1828")), LINKS_NONE));
        contacts.put("418", new Contact("418", "Lake Gwelup Primary School",
                new Address("", "59", "Porter St", "Gwelup", "WA", "6018", new Geocode("-31.870426", "115.797937")), Lists.<Telecom>newArrayList(new Telecom("419", TelecomType.PHONE, "(08) 9446 2674")), LINKS_NONE));
        contacts.put("420", new Contact("420", "Lake Monger Primary School",
                new Address("", "", "Dodd St", "Wembley", "WA", "6014", null), Lists.<Telecom>newArrayList(new Telecom("421", TelecomType.PHONE, "(08) 9387 4536")), LINKS_NONE));
        contacts.put("422", new Contact("422", "Lancelin Primary School",
                new Address("", "53", "Gingin Rd", "Lancelin", "WA", "6044", new Geocode("-31.011736", "115.329581")), Lists.<Telecom>newArrayList(new Telecom("423", TelecomType.PHONE, "Lancelin Primary School")), LINKS_NONE));
        contacts.put("424", new Contact("424", "Landsdale Primary School",
                new Address("", "", "The Broadview", "Landsdale", "WA", "6065", null), Lists.<Telecom>newArrayList(new Telecom("425", TelecomType.PHONE, "(08) 9302 4100")), LINKS_NONE));
        contacts.put("426", new Contact("426", "Lathlain Primary School",
                new Address("", "120", "Howick St", "Lathlain", "WA", "6100", new Geocode("-31.970343", "115.908519")), Lists.<Telecom>newArrayList(new Telecom("427", TelecomType.PHONE, "(08) 9361 1265")), LINKS_NONE));
        contacts.put("428", new Contact("428", "Leda Primary School",
                new Address("", "", "Feilman Drv", "Leda", "WA", "6170", null), Lists.<Telecom>newArrayList(new Telecom("429", TelecomType.PHONE, "(08) 9439 2299")), LINKS_NONE));
        contacts.put("430", new Contact("430", "Leeming Primary School",
                new Address("", "", "Meharry Rd", "Leeming", "WA", "6149", null), Lists.<Telecom>newArrayList(new Telecom("431", TelecomType.PHONE, "(08) 9310 9133")), LINKS_NONE));
        contacts.put("432", new Contact("432", "Lesmurdie Primary School",
                new Address("", "49", "Sanderson Rd", "Lesmurdie", "WA", "6076", new Geocode("-32.004009", "116.046126")), Lists.<Telecom>newArrayList(new Telecom("433", TelecomType.PHONE, "(08) 9291 9855")), LINKS_NONE));
        contacts.put("434", new Contact("434", "Lockridge Primary School",
                new Address("", "48", "Rosher Rd", "Lockridge", "WA", "6054", new Geocode("-31.883521", "115.951352")), Lists.<Telecom>newArrayList(new Telecom("435", TelecomType.PHONE, "(08) 9377 1110")), LINKS_NONE));
        contacts.put("436", new Contact("436", "Maddington Primary School",
                new Address("", "1951", "Albany Hwy", "Maddington", "WA", "6109", new Geocode("-32.054041", "115.987446")), Lists.<Telecom>newArrayList(new Telecom("437", TelecomType.PHONE, "(08) 9459 1239")), LINKS_NONE));
        contacts.put("438", new Contact("438", "Madeley Primary School",
                new Address("", "", "Martindale Ave", "Madeley", "WA", "6065", null), Lists.<Telecom>newArrayList(new Telecom("439", TelecomType.PHONE, "(08) 9302 3611")), LINKS_NONE));
        contacts.put("440", new Contact("440", "Maida Vale Primary School",
                new Address("", "310", "Kalamunda Rd", "Maida Vale", "WA", "6057", new Geocode("-31.949462", "116.022239")), Lists.<Telecom>newArrayList(new Telecom("441", TelecomType.PHONE, "(08) 9454 5260")), LINKS_NONE));
        contacts.put("442", new Contact("442", "Makybe Drive Primary School",
                new Address("", "", "Makybe Drv", "Baldivis", "WA", "6171", null), Lists.<Telecom>newArrayList(new Telecom("443", TelecomType.PHONE, "(08) 9523 0709")), LINKS_NONE));
        contacts.put("444", new Contact("444", "Malvern Springs Primary School",
                new Address("", "", "Elmridge Pkwy", "Ellenbrook", "WA", "6069", null), Lists.<Telecom>newArrayList(new Telecom("445", TelecomType.PHONE, "(08) 6296 5422")), LINKS_NONE));
        contacts.put("446", new Contact("446", "Mandurah Primary School",
                new Address("", "18", "Hackett St", "Mandurah", "WA", "6210", new Geocode("-32.529174", "115.725407")), Lists.<Telecom>newArrayList(new Telecom("447", TelecomType.PHONE, "(08) 9535 1575")), LINKS_NONE));
        contacts.put("448", new Contact("448", "Manning Primary School",
                new Address("", "60-80", "Ley St", "Manning", "WA", "6152", new Geocode("-32.015193", "115.86411")), Lists.<Telecom>newArrayList(new Telecom("449", TelecomType.PHONE, "(08) 9450 4068")), LINKS_NONE));
        contacts.put("450", new Contact("450", "Marangaroo Primary School",
                new Address("", "88", "Giralt Rd", "Marangaroo", "WA", "6064", new Geocode("-31.828807", "115.826646")), Lists.<Telecom>newArrayList(new Telecom("451", TelecomType.PHONE, "(08) 9343 2055")), LINKS_NONE));
        contacts.put("452", new Contact("452", "Marmion Primary School",
                new Address("", "7", "Cliverton Ct", "Marmion", "WA", "6020", new Geocode("-31.844148", "115.757812")), Lists.<Telecom>newArrayList(new Telecom("453", TelecomType.PHONE, "(08) 9246 3422")), LINKS_NONE));
        contacts.put("454", new Contact("454", "Marri Grove Primary School",
                new Address("", "", "Larsen Rd", "Byford", "WA", "6122", null), Lists.<Telecom>newArrayList(new Telecom("455", TelecomType.PHONE, "(08) 9525 1199")), LINKS_NONE));
        contacts.put("456", new Contact("456", "Maylands Peninsula Primary School",
                new Address("", "60", "Kelvin St", "Maylands", "WA", "6051", new Geocode("-31.933063", "115.904198")), Lists.<Telecom>newArrayList(new Telecom("457", TelecomType.PHONE, "(08) 9473 4100")), LINKS_NONE));
        contacts.put("458", new Contact("458", "Meadow Springs Primary School",
                new Address("", "320", "Oakmont Av (cnr Bellerive Pass)", "Meadow Springs", "WA", "6210", new Geocode("-32.500935", "115.756266")), Lists.<Telecom>newArrayList(new Telecom("459", TelecomType.PHONE, "(08) 9537 0400")), LINKS_NONE));
        contacts.put("460", new Contact("460", "Medina Primary School",
                new Address("", "Lot 636", "Medina Av", "Medina", "WA", "6167", null), Lists.<Telecom>newArrayList(new Telecom("461", TelecomType.PHONE, "(08) 9419 2510")), LINKS_NONE));
        contacts.put("462", new Contact("462", "Melville Primary School",
                new Address("", "70", "Curtis Rd", "Melville", "WA", "6156", new Geocode("-32.037595", "115.805736")), Lists.<Telecom>newArrayList(new Telecom("463", TelecomType.PHONE, "(08) 9330 2255")), LINKS_NONE));
        contacts.put("464", new Contact("464", "Merriwa Primary School",
                new Address("", "", "Baltimore Pde", "Merriwa", "WA", "6030", null), Lists.<Telecom>newArrayList(new Telecom("465", TelecomType.PHONE, "(08) 9305 9011")), LINKS_NONE));
        contacts.put("466", new Contact("466", "Middle Swan Primary School",
                new Address("", "Lot 574", "Cockman Cs", "Stratton", "WA", "6056", new Geocode("-31.867903", "116.038177")), Lists.<Telecom>newArrayList(new Telecom("467", TelecomType.PHONE, "(08) 9250 7909")), LINKS_NONE));
        contacts.put("468", new Contact("468", "Midvale Primary School",
                new Address("", "", "Midvale Pl", "Midvale", "WA", "6056", null), Lists.<Telecom>newArrayList(new Telecom("469", TelecomType.PHONE, "(08) 9250 1430")), LINKS_NONE));
        contacts.put("470", new Contact("470", "Millen Primary School",
                new Address("", "", "Playfield St", "East Victoria Park", "WA", "6101", null), Lists.<Telecom>newArrayList(new Telecom("471", TelecomType.PHONE, "(08) 9361 3775")), LINKS_NONE));
        contacts.put("472", new Contact("472", "Mindarie Primary School",
                new Address("", "90", "Rothesay Hts", "Mindarie", "WA", "6030", new Geocode("-31.687258", "115.70827")), Lists.<Telecom>newArrayList(new Telecom("473", TelecomType.PHONE, "(08) 9407 1100")), LINKS_NONE));
        contacts.put("474", new Contact("474", "Mirrabooka Primary School",
                new Address("", "", "Laythorne St", "Nollamara", "WA", "6061", null), Lists.<Telecom>newArrayList(new Telecom("475", TelecomType.PHONE, "(08) 9344 8655")), LINKS_NONE));
        contacts.put("476", new Contact("476", "Moorditj Noongar Community College",
                new Address("", "", "Eddie Barron Drv", "Midland", "WA", "6056", null), Lists.<Telecom>newArrayList(new Telecom("477", TelecomType.PHONE, "(08) 9374 8800")), LINKS_NONE));
        contacts.put("479", new Contact("479", "Morley Primary School",
                new Address("", "36", "Wellington Rd", "Morley", "WA", "6062", new Geocode("-31.8926", "115.894942")), Lists.<Telecom>newArrayList(new Telecom("480", TelecomType.PHONE, "(08) 9276 1153")), LINKS_NONE));
        contacts.put("481", new Contact("481", "Mosman Park Primary School",
                new Address("", "91", "Victoria St", "Mosman Park", "WA", "6012", new Geocode("-32.012175", "115.762905")), Lists.<Telecom>newArrayList(new Telecom("482", TelecomType.PHONE, "(08) 9384 6667")), LINKS_NONE));
        contacts.put("483", new Contact("483", "Mt Claremont Primary School",
                new Address("", "103", "Alfred Rd", "Mt Claremont", "WA", "6010", new Geocode("-31.969022", "115.782667")), Lists.<Telecom>newArrayList(new Telecom("484", TelecomType.PHONE, "(08) 9384 0278")), LINKS_NONE));
        contacts.put("485", new Contact("485", "Mount Hawthorn Primary School",
                new Address("", "1", "Killarney St", "Mt Hawthorn", "WA", "6016", new Geocode("-31.917459", "115.835418")), Lists.<Telecom>newArrayList(new Telecom("486", TelecomType.PHONE, "(08) 9242 3677")), LINKS_NONE));
        contacts.put("487", new Contact("487", "Mount Helena Primary School",
                new Address("", "", "Keane St east", "Mt Helena", "WA", "6082", null), Lists.<Telecom>newArrayList(new Telecom("488", TelecomType.PHONE, "(08) 9572 1011")), LINKS_NONE));
        contacts.put("489", new Contact("489", "Mt Lawley Primary School",
                new Address("", "92", "Second Av", "Mt Lawley", "WA", "6050", new Geocode("-31.926169", "115.875916")), Lists.<Telecom>newArrayList(new Telecom("490", TelecomType.PHONE, "(08) 9370 2170")), LINKS_NONE));
        contacts.put("491", new Contact("491", "Mount Pleasant Primary School",
                new Address("", "29", "Queens Rd", "Mt Pleasant", "WA", "6153", new Geocode("-32.029309", "115.845309")), Lists.<Telecom>newArrayList(new Telecom("492", TelecomType.PHONE, "(08) 9316 1045")), LINKS_NONE));
        contacts.put("493", new Contact("493", "Mullaloo Beach Primary School",
                new Address("", "59", "West View Bvd", "Mullaloo", "WA", "6027", new Geocode("-31.775765", "115.736666")), Lists.<Telecom>newArrayList(new Telecom("494", TelecomType.PHONE, "(08) 9307 2099")), LINKS_NONE));
        contacts.put("495", new Contact("495", "Mullaloo Heights Primary School",
                new Address("", "27", "Charonia Rd", "Mullaloo", "WA", "6027", new Geocode("-31.777584", "115.749233")), Lists.<Telecom>newArrayList(new Telecom("496", TelecomType.PHONE, "(08) 9401 2488")), LINKS_NONE));
        contacts.put("497", new Contact("497", "Mundaring Primary School",
                new Address("", "855", "Stevens St", "Mundaring", "WA", "6073", new Geocode("-31.895676", "116.172999")), Lists.<Telecom>newArrayList(new Telecom("498", TelecomType.PHONE, "(08) 9295 1072")), LINKS_NONE));
        contacts.put("499", new Contact("499", "Mundijong Primary School",
                new Address("", "", "Livesey St", "Mundijong", "WA", "6123", null), Lists.<Telecom>newArrayList(new Telecom("500", TelecomType.PHONE, "(08) 9525 5118")), LINKS_NONE));
        contacts.put("501", new Contact("501", "Nedlands Primary School",
                new Address("", "35", "Kingsway ", "Nedlands", "WA", "6009", new Geocode("-31.984807", "115.813402")), Lists.<Telecom>newArrayList(new Telecom("502", TelecomType.PHONE, "(08) 9386 2278")), LINKS_NONE));
        contacts.put("503", new Contact("503", "Neerabup Primary School",
                new Address("", "14", "Viridian Dr", "Banksia Grove", "WA", "6031", new Geocode("-31.701774", "115.808043")), Lists.<Telecom>newArrayList(new Telecom("504", TelecomType.PHONE, "(08) 9404 6244")), LINKS_NONE));
        contacts.put("505", new Contact("505", "Neerigen Brook Primary School",
                new Address("", "", "Seventh Rd", "Armadale", "WA", "6112", null), Lists.<Telecom>newArrayList(new Telecom("506", TelecomType.PHONE, "(08) 9399 3422")), LINKS_NONE));
        contacts.put("507", new Contact("507", "Newborough Primary School",
                new Address("", "178", "Newborough St", "Doubleview", "WA", "6018", new Geocode("-31.885266", "115.781768")), Lists.<Telecom>newArrayList(new Telecom("508", TelecomType.PHONE, "(08) 9446 1025")), LINKS_NONE));
        contacts.put("509", new Contact("509", "Newton Primary School",
                new Address("", "4", "Marvell Av", "Spearwood", "WA", "6163", new Geocode("-32.112365", "115.787905")), Lists.<Telecom>newArrayList(new Telecom("510", TelecomType.PHONE, "(08) 9418 4122")), LINKS_NONE));
        contacts.put("511", new Contact("511", "Nollamara Primary School",
                new Address("", "101", "Harrison St", "Nollamara", "WA", "6061", null), Lists.<Telecom>newArrayList(new Telecom("512", TelecomType.PHONE, "(08) 9349 1266")), LINKS_NONE));
        contacts.put("513", new Contact("513", "Noranda Primary School",
                new Address("", "25", "Walmsley Dr", "Noranda", "WA", "6062", new Geocode("-31.87634", "115.907796")), Lists.<Telecom>newArrayList(new Telecom("514", TelecomType.PHONE, "(08) 9275 1833")), LINKS_NONE));
        contacts.put("515", new Contact("515", "North Balga Primary School",
                new Address("", "30", "Maitland Rd", "Balga", "WA", "6061", new Geocode("-31.852112", "115.83327")), Lists.<Telecom>newArrayList(new Telecom("516", TelecomType.PHONE, "(08) 9247 3599")), LINKS_NONE));
        contacts.put("517", new Contact("517", "North Beach Primary School",
                new Address("", "75", "North Beach Rd", "North Beach", "WA", "6020", new Geocode("-31.860662", "115.761472")), Lists.<Telecom>newArrayList(new Telecom("518", TelecomType.PHONE, "(08) 9447 1249")), LINKS_NONE));
        contacts.put("519", new Contact("519", "North Cottesloe Primary School",
                new Address("", "100", "Eric St", "Cottesloe", "WA", "6011", new Geocode("-31.989658", "115.765402")), Lists.<Telecom>newArrayList(new Telecom("520", TelecomType.PHONE, "(08) 9384 7733")), LINKS_NONE));
        contacts.put("521", new Contact("521", "North Dandalup Primary School",
                new Address("", "", "South West Hwy (cnr Hines Rd)", "North Dandalup", "WA", "6207", null), Lists.<Telecom>newArrayList(new Telecom("522", TelecomType.PHONE, "(08) 9530 1202")), LINKS_NONE));
        contacts.put("523", new Contact("523", "North Fremantle Primary School",
                new Address("", "30", "John St", "North Fremantle", "WA", "6159", new Geocode("-32.034962", "115.757136")), Lists.<Telecom>newArrayList(new Telecom("524", TelecomType.PHONE, "(08) 9335 2743")), LINKS_NONE));
        contacts.put("525", new Contact("525", "North Morley Primary School",
                new Address("", "75", "Gordon Rd West", "Dianella", "WA", "6059", null), Lists.<Telecom>newArrayList(new Telecom("526", TelecomType.PHONE, "(08) 9375 1051")), LINKS_NONE));
        contacts.put("527", new Contact("527", "North Morley Kindergarten (Office)",
                new Address("", "17", "Seabrook St", "Dianella", "WA", "6059", new Geocode("-31.883523", "115.878294")), Lists.<Telecom>newArrayList(new Telecom("528", TelecomType.PHONE, "(08) 9276 8815")), LINKS_NONE));
        contacts.put("529", new Contact("529", "North Parmelia Primary School",
                new Address("", "15-35", "Durrant Av", "Parmelia", "WA", "6167", new Geocode("-32.235041", "115.835969")), Lists.<Telecom>newArrayList(new Telecom("530", TelecomType.PHONE, "(08) 9439 2100")), LINKS_NONE));
        contacts.put("531", new Contact("531", "North Perth Primary School",
                new Address("", "5", "Albert St", "North Perth", "WA", "6006", new Geocode("-31.929835", "115.856107")), Lists.<Telecom>newArrayList(new Telecom("532", TelecomType.PHONE, "(08) 9328 7104")), LINKS_NONE));
        contacts.put("533", new Contact("533", "North Woodvale Primary School",
                new Address("", "4", "Chichester Dr", "Woodvale", "WA", "6026", new Geocode("-31.783775", "115.78858")), Lists.<Telecom>newArrayList(new Telecom("534", TelecomType.PHONE, "(08) 9309 2711")), LINKS_NONE));
        contacts.put("535", new Contact("535", "Oberthur Primary School",
                new Address("", "", "Nicholls Cres", "Bull Creek", "WA", "6149", null), Lists.<Telecom>newArrayList(new Telecom("536", TelecomType.PHONE, "(08) 9332 3212")), LINKS_NONE));
        contacts.put("537", new Contact("537", "Ocean Reef Primary School",
                new Address("", "", "Kaufman Ave", "Ocean Reef", "WA", "6027", null), Lists.<Telecom>newArrayList(new Telecom("538", TelecomType.PHONE, "(08) 9307 3444")), LINKS_NONE));
        contacts.put("539", new Contact("539", "Ocean Road Primary School",
                new Address("", "", "Ocean Rd", "Dawesville", "WA", "6211", null), Lists.<Telecom>newArrayList(new Telecom("540", TelecomType.PHONE, "(08) 9582 2311")), LINKS_NONE));
        contacts.put("541", new Contact("541", "Orange Grove Primary School",
                new Address("", "", "Boyle La", "Orange Grove", "WA", "6109", null), Lists.<Telecom>newArrayList(new Telecom("542", TelecomType.PHONE, "(08) 9459 3601")), LINKS_NONE));
        contacts.put("543", new Contact("543", "Orelia Primary School",
                new Address("", "", "Bolton Way", "Orelia", "WA", "6167", null), Lists.<Telecom>newArrayList(new Telecom("544", TelecomType.PHONE, "(08) 9419 1111")), LINKS_NONE));
        contacts.put("545", new Contact("545", "Osborne Primary School",
                new Address("", "155", "Albert St", "Osborne Park", "WA", "6017", new Geocode("-31.899421", "115.825601")), Lists.<Telecom>newArrayList(new Telecom("546", TelecomType.PHONE, "(08) 9349 2737")), LINKS_NONE));
        contacts.put("547", new Contact("547", "Padbury Primary School",
                new Address("", "", "MacDonald Ave", "Padbury", "WA", "6025", null), Lists.<Telecom>newArrayList(new Telecom("548", TelecomType.PHONE, "(08) 9401 1255")), LINKS_NONE));
        contacts.put("549", new Contact("549", "Palmyra Primary School",
                new Address("", "60", "Mckimmie Rd", "Palmyra", "WA", "6157", new Geocode("-32.045301", "115.784699")), Lists.<Telecom>newArrayList(new Telecom("550", TelecomType.PHONE, "(08) 9339 1911")), LINKS_NONE));
        contacts.put("551", new Contact("551", "Parkerville Primary School",
                new Address("", "16", "Parker Rd", "Parkerville", "WA", "6081", new Geocode("-31.885795", "116.133184")), Lists.<Telecom>newArrayList(new Telecom("552", TelecomType.PHONE, "(08) 9295 4268")), LINKS_NONE));
        contacts.put("553", new Contact("553", "Parkwood Primary School",
                new Address("", "9", "Zelkova Way", "Lynwood", "WA", "6147", new Geocode("-32.042775", "115.913567")), Lists.<Telecom>newArrayList(new Telecom("554", TelecomType.PHONE, "(08) 9457 4721")), LINKS_NONE));
        contacts.put("555", new Contact("555", "Phoenix Primary School",
                new Address("", "28", "Phoenix Rd", "Hamilton Hill", "WA", "6163", new Geocode("-32.093496", "115.779444")), Lists.<Telecom>newArrayList(new Telecom("556", TelecomType.PHONE, "(08) 9418 3955")), LINKS_NONE));
        contacts.put("557", new Contact("557", "Piara Waters Primary School",
                new Address("", "440", "Wright Rd", "Piara Waters", "WA", "6112", new Geocode("-32.125804", "115.916451")), Lists.<Telecom>newArrayList(new Telecom("558", TelecomType.PHONE, "(08) 9397 4300")), LINKS_NONE));
        contacts.put("559", new Contact("559", "Pickering Brook Primary School",
                new Address("", "241", "Pickering Brook Rd", "Pickering Brook", "WA", "6076", new Geocode("-32.035399", "116.131028")), Lists.<Telecom>newArrayList(new Telecom("560", TelecomType.PHONE, "(08) 9293 8256")), LINKS_NONE));
        contacts.put("561", new Contact("561", "Pinjarra Primary School",
                new Address("", "", "Dixon Ave", "Pinjarra", "WA", "6208", null), Lists.<Telecom>newArrayList(new Telecom("562", TelecomType.PHONE, "(08) 9531 1856")), LINKS_NONE));
        contacts.put("563", new Contact("563", "Port Kennedy Primary School",
                new Address("", "1", "La Manche Av", "Port Kennedy", "WA", "6172", new Geocode("-32.358205", "115.756302")), Lists.<Telecom>newArrayList(new Telecom("564", TelecomType.PHONE, "(08) 9593 5055")), LINKS_NONE));
        contacts.put("565", new Contact("565", "Poseidon Primary School",
                new Address("", "97", "Poseidon Rd", "Heathridge", "WA", "6027", new Geocode("-31.76079", "115.752401")), Lists.<Telecom>newArrayList(new Telecom("566", TelecomType.PHONE, "(08) 9307 2356")), LINKS_NONE));
        contacts.put("567", new Contact("567", "Poynter Primary School",
                new Address("", "39", "Poynter Dr", "Duncraig", "WA", "6023", new Geocode("-31.842113", "115.775759")), Lists.<Telecom>newArrayList(new Telecom("568", TelecomType.PHONE, "(08) 9448 4036")), LINKS_NONE));
        contacts.put("569", new Contact("569", "Queens Park Primary School",
                new Address("", "202", "Treasure Rd", "Queens Park", "WA", "6107", new Geocode("-31.999105", "115.944859")), Lists.<Telecom>newArrayList(new Telecom("570", TelecomType.PHONE, "(08) 9458 2837")), LINKS_NONE));
        contacts.put("572", new Contact("572", "Quinns Beach Primary School",
                new Address("", "5", "James Cook Av", "Quinns Rocks", "WA", "6030", new Geocode("-31.658546", "115.695294")), Lists.<Telecom>newArrayList(new Telecom("573", TelecomType.PHONE, "(08) 9562 0000")), LINKS_NONE));
        contacts.put("574", new Contact("574", "Quinns Rocks Primary School",
                new Address("", "6", "Rees Dr", "Quinns Rocks", "WA", "6030", new Geocode("-31.673171", "115.701704")), Lists.<Telecom>newArrayList(new Telecom("575", TelecomType.PHONE, "(08) 9305 1500")), LINKS_NONE));
        contacts.put("576", new Contact("576", "Ranford Primary School",
                new Address("", "", "Orkney Pde", "Canning Vale", "WA", "6155", null), Lists.<Telecom>newArrayList(new Telecom("577", TelecomType.PHONE, "(08) 9456 5255")), LINKS_NONE));
        contacts.put("578", new Contact("578", "Rawlinson Primary School",
                new Address("", "27", "Rawlinson Dr", "Marangaroo", "WA", "6064", new Geocode("-31.828331", "115.844132")), Lists.<Telecom>newArrayList(new Telecom("579", TelecomType.PHONE, "(08) 9247 9000")), LINKS_NONE));
        contacts.put("580", new Contact("580", "Redcliffe Primary School",
                new Address("", "62", "Kanowna Av", "Redcliffe", "WA", "6104", new Geocode("-31.934373", "115.944943")), Lists.<Telecom>newArrayList(new Telecom("581", TelecomType.PHONE, "(08) 9277 2569")), LINKS_NONE));
        contacts.put("582", new Contact("582", "Richmond Primary School",
                new Address("", "37", "Windsor Rd", "East Fremantle", "WA", "6158", new Geocode("-32.036681", "115.770573")), Lists.<Telecom>newArrayList(new Telecom("583", TelecomType.PHONE, "(08) 9339 5055")), LINKS_NONE));
        contacts.put("584", new Contact("584", "Riverside Primary School",
                new Address("", "1", "Minilya Pky", "Greenfields", "WA", "6210", new Geocode("-32.532511", "115.768039")), Lists.<Telecom>newArrayList(new Telecom("585", TelecomType.PHONE, "(08) 9534 0300")), LINKS_NONE));
        contacts.put("586", new Contact("586", "Riverton Primary School",
                new Address("", "255", "Corinthian Rd", "Riverton", "WA", "6148", new Geocode("-32.033856", "115.900241")), Lists.<Telecom>newArrayList(new Telecom("587", TelecomType.PHONE, "(08) 9457 2644")), LINKS_NONE));
        contacts.put("588", new Contact("588", "Rockingham Beach Primary School",
                new Address("", "30", "Bay View St", "Rockingham", "WA", "6168", new Geocode("-32.282179", "115.723095")), Lists.<Telecom>newArrayList(new Telecom("589", TelecomType.PHONE, "(08) 9527 1802")), LINKS_NONE));
        contacts.put("590", new Contact("590", "Rockingham Lakes Primary School",
                new Address("", "", "La Guardia Loop", "Port Kennedy", "WA", "6172", null), Lists.<Telecom>newArrayList(new Telecom("591", TelecomType.PHONE, "(08) 9593 9000")), LINKS_NONE));
        contacts.put("592", new Contact("592", "Roleystone Primary School",
                new Address("", "", "Robin Rd", "Roleystone", "WA", "6111", null), Lists.<Telecom>newArrayList(new Telecom("593", TelecomType.PHONE, "(08) 9496 1488")), LINKS_NONE));
        contacts.put("594", new Contact("594", "Rosalie Primary School",
                new Address("", "101", "Onslow Rd", "Shenton Park", "WA", "6008", new Geocode("-31.960908", "115.815705")), Lists.<Telecom>newArrayList(new Telecom("595", TelecomType.PHONE, "(08) 9381 6011")), LINKS_NONE));
        contacts.put("596", new Contact("596", "Roseworth Primary School",
                new Address("", "30", "Stebbing Wy", "Girrawheen", "WA", "6064", new Geocode("-31.841436", "115.852692")), Lists.<Telecom>newArrayList(new Telecom("597", TelecomType.PHONE, "(08) 6240 4000")), LINKS_NONE));
        contacts.put("598", new Contact("598", "Rossmoyne Primary School",
                new Address("", "90", "Second Av", "Rossmoyne", "WA", "6148", new Geocode("-32.039831", "115.865767")), Lists.<Telecom>newArrayList(new Telecom("599", TelecomType.PHONE, "(08) 9354 4290")), LINKS_NONE));
        contacts.put("600", new Contact("600", "Rostrata Primary School",
                new Address("", "", "Rostrata Ave", "Willetton", "WA", "6155", null), Lists.<Telecom>newArrayList(new Telecom("601", TelecomType.PHONE, "(08) 9457 9455")), LINKS_NONE));
        contacts.put("603", new Contact("603", "Safety Bay Primary School",
                new Address("", "2", "Waimea Rd", "Safety Bay", "WA", "6169", new Geocode("-32.29934", "115.71387")), Lists.<Telecom>newArrayList(new Telecom("604", TelecomType.PHONE, "(08) 9528 3680")), LINKS_NONE));
        contacts.put("605", new Contact("605", "Samson Primary School",
                new Address("", "22", "Lawrence Wy", "Samson", "WA", "6163", new Geocode("-32.07309", "115.80207")), Lists.<Telecom>newArrayList(new Telecom("606", TelecomType.PHONE, "(08) 9314 1921")), LINKS_NONE));
        contacts.put("607", new Contact("607", "Sawyers Valley Primary School",
                new Address("", "17", "Barlow St", "Sawyers Valley", "WA", "6074", new Geocode("-31.901882", "116.202753")), Lists.<Telecom>newArrayList(new Telecom("608", TelecomType.PHONE, "(08) 9295 1434")), LINKS_NONE));
        contacts.put("609", new Contact("609", "Scarborough Primary School",
                new Address("", "", "Hinderwell St", "Scarborough", "WA", "6019", null), Lists.<Telecom>newArrayList(new Telecom("610", TelecomType.PHONE, "(08) 9341 1202")), LINKS_NONE));
        contacts.put("611", new Contact("611", "Seaforth Primary School",
                new Address("", "", "Verna St", "Gosnells", "WA", "6110", null), Lists.<Telecom>newArrayList(new Telecom("612", TelecomType.PHONE, "(08) 9398 3388")), LINKS_NONE));
        contacts.put("613", new Contact("613", "Secret Harbour Primary School",
                new Address("", "178", "Maratea Pde", "Secret Harbour", "WA", "6173", null), Lists.<Telecom>newArrayList(new Telecom("614", TelecomType.PHONE, "(08) 9524 8100")), LINKS_NONE));
        contacts.put("615", new Contact("615", "Serpentine Primary School",
                new Address("", "", "Lefroy St", "Serpentine", "WA", "6125", null), Lists.<Telecom>newArrayList(new Telecom("616", TelecomType.PHONE, "(08) 9525 2257")), LINKS_NONE));
        contacts.put("617", new Contact("617", "Settlers Primary School",
                new Address("", "", "Arpenteur Drv (cnr Tranby Drv)", "Baldivis", "WA", "6171", null), Lists.<Telecom>newArrayList(new Telecom("618", TelecomType.PHONE, "(08) 9523 2335")), LINKS_NONE));
        contacts.put("619", new Contact("619", "Shelley Primary School",
                new Address("", "", "Monota Ave", "Shelley", "WA", "6148", null), Lists.<Telecom>newArrayList(new Telecom("620", TelecomType.PHONE, "(08) 9354 5233")), LINKS_NONE));
        contacts.put("621", new Contact("621", "Singleton Primary School",
                new Address("", "", "Naval Ave", "Singleton", "WA", "6175", null), Lists.<Telecom>newArrayList(new Telecom("622", TelecomType.PHONE, "(08) 9537 3199")), LINKS_NONE));
        contacts.put("623", new Contact("623", "Somerly Primary School",
                new Address("", "15", "Somerly Dr", "Clarkson", "WA", "6030", new Geocode("-31.684494", "115.727901")), Lists.<Telecom>newArrayList(new Telecom("624", TelecomType.PHONE, "(08) 9407 7142")), LINKS_NONE));
        contacts.put("625", new Contact("625", "Sorrento Primary School",
                new Address("", "14", "Elfreda Av", "Sorrento", "WA", "6020", new Geocode("-31.830808", "115.760488")), Lists.<Telecom>newArrayList(new Telecom("626", TelecomType.PHONE, "(08) 9447 7488")), LINKS_NONE));
        contacts.put("627", new Contact("627", "South Ballajura Primary School",
                new Address("", "", "Wyperfeld Gardns", "Ballajura", "WA", "6066", null), Lists.<Telecom>newArrayList(new Telecom("628", TelecomType.PHONE, "(08) 9249 8022")), LINKS_NONE));
        contacts.put("629", new Contact("629", "South Coogee Primary School",
                new Address("", "40", "Ivankovich Av", "Beeliar", "WA", "6164", new Geocode("-32.128783", "115.797349")), Lists.<Telecom>newArrayList(new Telecom("630", TelecomType.PHONE, "(08) 9494 8000")), LINKS_NONE));
        contacts.put("631", new Contact("631", "South Lake Primary School",
                new Address("", "62", "Mason Ct", "South Lake", "WA", "6164", new Geocode("-32.105092", "115.834645")), Lists.<Telecom>newArrayList(new Telecom("632", TelecomType.PHONE, "(08) 9417 2998")), LINKS_NONE));
        contacts.put("633", new Contact("633", "South Padbury Primary School",
                new Address("", "56", "Warburton Av", "Padbury", "WA", "6025", new Geocode("-31.811217", "115.764132")), Lists.<Telecom>newArrayList(new Telecom("634", TelecomType.PHONE, "(08) 9307 5833")), LINKS_NONE));
        contacts.put("635", new Contact("635", "South Perth Primary School",
                new Address("", "51", "Forrest St", "South Perth", "WA", "6151", new Geocode("-31.981371", "115.85995")), Lists.<Telecom>newArrayList(new Telecom("636", TelecomType.PHONE, "(08) 9367 2652")), LINKS_NONE));
        contacts.put("637", new Contact("637", "South Thornlie Primary School",
                new Address("", "2", "Ovens Rd", "Thornlie", "WA", "6108", new Geocode("-32.064073", "115.959681")), Lists.<Telecom>newArrayList(new Telecom("638", TelecomType.PHONE, "(08) 9459 4655")), LINKS_NONE));
        contacts.put("639", new Contact("639", "Southwell Primary School",
                new Address("", "26", "Grandpre Cr", "Hamilton Hill", "WA", "6163", new Geocode("-32.090242", "115.783854")), Lists.<Telecom>newArrayList(new Telecom("640", TelecomType.PHONE, "(08) 9418 1622")), LINKS_NONE));
        contacts.put("641", new Contact("641", "South Halls Head Primary School",
                new Address("", "38", "Karon Vis", "Halls Head", "WA", "6210", new Geocode("-32.563696", "115.678632")), Lists.<Telecom>newArrayList(new Telecom("642", TelecomType.PHONE, "(08) 9583 5400")), LINKS_NONE));
        contacts.put("643", new Contact("643", "Spearwood Primary & Pre Primary School",
                new Address("", "73", "Gerald St", "Spearwood", "WA", "6163", new Geocode("-32.101477", "115.787886")), Lists.<Telecom>newArrayList(new Telecom("644", TelecomType.PHONE, "(08) 9418 1822")), LINKS_NONE));
        contacts.put("645", new Contact("645", "Spearwood Alternative School",
                new Address("", "370", "Rockingham Rd", "Spearwood", "WA", "6163", new Geocode("-32.108704", "115.782697")), Lists.<Telecom>newArrayList(new Telecom("646", TelecomType.PHONE, "(08) 9418 6539")), LINKS_NONE));
        contacts.put("647", new Contact("647", "Spring Hill Primary School",
                new Address("", "", "Spring Hill St", "Tapping", "WA", "6065", null), Lists.<Telecom>newArrayList(new Telecom("648", TelecomType.PHONE, "(08) 9404 5178")), LINKS_NONE));
        contacts.put("649", new Contact("649", "Springfield Primary School",
                new Address("", "31", "Bridgewater Dr", "Kallaroo", "WA", "6025", new Geocode("-31.793523", "115.750338")), Lists.<Telecom>newArrayList(new Telecom("650", TelecomType.PHONE, "(08) 9401 6069")), LINKS_NONE));
        contacts.put("651", new Contact("651", "Subiaco Primary School",
                new Address("", "271", "Bagot Rd", "Subiaco", "WA", "6008", new Geocode("-31.950398", "115.822655")), Lists.<Telecom>newArrayList(new Telecom("652", TelecomType.PHONE, "(08) 9381 5078")), LINKS_NONE));
        contacts.put("653", new Contact("653", "Success Primary School",
                new Address("", "390", "Wentworth Pde", "Success", "WA", "6164", new Geocode("-32.153445", "115.849555")), Lists.<Telecom>newArrayList(new Telecom("654", TelecomType.PHONE, "(08) 9414 3444")), LINKS_NONE));
        contacts.put("655", new Contact("655", "Sutherland Dianella Primary School",
                new Address("", "5", "Sutherland Av", "Dianella", "WA", "6059", new Geocode("-31.894175", "115.86509")), Lists.<Telecom>newArrayList(new Telecom("656", TelecomType.PHONE, "(08) 9375 1133")), LINKS_NONE));
        contacts.put("657", new Contact("657", "Swan View Primary School",
                new Address("", "380", "Morrison Rd", "Swan View", "WA", "6056", new Geocode("-31.885933", "116.049542")), Lists.<Telecom>newArrayList(new Telecom("658", TelecomType.PHONE, "(08) 9294 1522")), LINKS_NONE));
        contacts.put("659", new Contact("659", "Swanbourne Primary School",
                new Address("", "", "Narla Rd", "Swanbourne", "WA", "6010", null), Lists.<Telecom>newArrayList(new Telecom("660", TelecomType.PHONE, "(08) 9385 5033")), LINKS_NONE));
        contacts.put("661", new Contact("661", "Takari Primary School",
                new Address("", "5", "Rickman St", "Balcatta", "WA", "6021", new Geocode("-31.870046", "115.821681")), Lists.<Telecom>newArrayList(new Telecom("662", TelecomType.PHONE, "(08) 9349 5607")), LINKS_NONE));
        contacts.put("663", new Contact("663", "Tapping Primary School",
                new Address("", "87", "St Stephens Cr", "Tapping", "WA", "6065", new Geocode("-31.71601", "115.791999")), Lists.<Telecom>newArrayList(new Telecom("664", TelecomType.PHONE, "(08) 9404 6033")), LINKS_NONE));
        contacts.put("665", new Contact("665", "Thornlie Primary School",
                new Address("", "86", "Thornlie Av", "Thornlie", "WA", "6108", new Geocode("-32.05414", "115.96351")), Lists.<Telecom>newArrayList(new Telecom("666", TelecomType.PHONE, "(08) 9459 4333")), LINKS_NONE));
        contacts.put("667", new Contact("667", "Tranby Primary School",
                new Address("", "99", "Acton Av", "Rivervale", "WA", "6103", new Geocode("-31.959637", "115.919742")), Lists.<Telecom>newArrayList(new Telecom("668", TelecomType.PHONE, "(08) 9277 1642")), LINKS_NONE));
        contacts.put("669", new Contact("669", "Tuart Hill Primary School",
                new Address("", "", "Banksia St", "Tuart Hill", "WA", "6060", null), Lists.<Telecom>newArrayList(new Telecom("670", TelecomType.PHONE, "(08) 9349 1799")), LINKS_NONE));
        contacts.put("671", new Contact("671", "Two Rocks Primary School",
                new Address("", "51", "Resolute Dr", "Two Rocks", "WA", "6037", new Geocode("-31.488241", "115.591607")), Lists.<Telecom>newArrayList(new Telecom("672", TelecomType.PHONE, "(08) 9561 6888")), LINKS_NONE));
        contacts.put("673", new Contact("673", "Upper Swan Primary School",
                new Address("", "1204", "Great Northern Hwy", "Upper Swan", "WA", "6069", new Geocode("-31.786908", "116.023029")), Lists.<Telecom>newArrayList(new Telecom("674", TelecomType.PHONE, "(08) 9296 4622")), LINKS_NONE));
        contacts.put("675", new Contact("675", "Victoria Park Primary School",
                new Address("", "1", "Cargill St", "Victoria Park", "WA", "6100", new Geocode("-31.971745", "115.892531")), Lists.<Telecom>newArrayList(new Telecom("676", TelecomType.PHONE, "(08) 9361 2571")), LINKS_NONE));
        contacts.put("677", new Contact("677", "Waddington Primary School",
                new Address("", "15", "Henniker Wy", "Koondoola", "WA", "6064", new Geocode("-31.843395", "115.867933")), Lists.<Telecom>newArrayList(new Telecom("678", TelecomType.PHONE, "(08) 9342 7511")), LINKS_NONE));
        contacts.put("679", new Contact("679", "Waikiki Primary School",
                new Address("", "", "Arnside Bnd", "Waikiki", "WA", "6169", null), Lists.<Telecom>newArrayList(new Telecom("680", TelecomType.PHONE, "(08) 9593 7177")), LINKS_NONE));
        contacts.put("681", new Contact("681", "Walliston Primary School",
                new Address("", "11", "Dianella Rd", "Walliston", "WA", "6076", new Geocode("-31.999664", "116.069397")), Lists.<Telecom>newArrayList(new Telecom("682", TelecomType.PHONE, "(08) 9291 8099")), LINKS_NONE));
        contacts.put("683", new Contact("683", "Wanneroo Primary School",
                new Address("", "15", "Shaw Rd", "Wanneroo", "WA", "6065", new Geocode("-31.752103", "115.800209")), Lists.<Telecom>newArrayList(new Telecom("684", TelecomType.PHONE, "(08) 9306 0500")), LINKS_NONE));
        contacts.put("685", new Contact("685", "Warnbro Primary School",
                new Address("", "45", "Axminster St", "Warnbro", "WA", "6169", new Geocode("-32.334265", "115.7546")), Lists.<Telecom>newArrayList(new Telecom("686", TelecomType.PHONE, "(08) 9593 2363")), LINKS_NONE));
        contacts.put("687", new Contact("687", "Warriapendi Primary School",
                new Address("", "28", "Redcliffe Av", "Balga", "WA", "6061", new Geocode("-31.853356", "115.844318")), Lists.<Telecom>newArrayList(new Telecom("688", TelecomType.PHONE, "(08) 9349 7433")), LINKS_NONE));
        contacts.put("689", new Contact("689", "Wattle Grove Primary School",
                new Address("", "639", "Welshpool Rd East", "Wattle Grove", "WA", "6107", new Geocode("-32.00727", "115.991955")), Lists.<Telecom>newArrayList(new Telecom("690", TelecomType.PHONE, "(08) 9453 6722")), LINKS_NONE));
        contacts.put("691", new Contact("691", "Weld Square Primary School",
                new Address("", "", "Dorking Pl", "Morley", "WA", "6062", null), Lists.<Telecom>newArrayList(new Telecom("692", TelecomType.PHONE, "(08) 9276 5891")), LINKS_NONE));
        contacts.put("693", new Contact("693", "Wembley Downs Primary School",
                new Address("", "", "Bournemouth Cres", "Wembley Downs", "WA", "6019", null), Lists.<Telecom>newArrayList(new Telecom("694", TelecomType.PHONE, "(08) 9245 3199")), LINKS_NONE));
        contacts.put("695", new Contact("695", "Wembley Primary School",
                new Address("", "41", "Grantham St", "Wembley", "WA", "6014", new Geocode("-31.934335", "115.809737")), Lists.<Telecom>newArrayList(new Telecom("696", TelecomType.PHONE, "(08) 9383 9388")), LINKS_NONE));
        contacts.put("697", new Contact("697", "West Balcatta Primary School",
                new Address("", "215", "Cedric St", "Balcatta", "WA", "6021", new Geocode("-31.871864", "115.809969")), Lists.<Telecom>newArrayList(new Telecom("698", TelecomType.PHONE, "(08) 9446 9211")), LINKS_NONE));
        contacts.put("699", new Contact("699", "West Beechboro Primary School",
                new Address("", "", "Avignon Way", "Beechboro", "WA", "6063", null), Lists.<Telecom>newArrayList(new Telecom("700", TelecomType.PHONE, "(08) 9377 6091")), LINKS_NONE));
        contacts.put("701", new Contact("701", "West Greenwood Primary School",
                new Address("", "101", "Coolibah Dr", "Greenwood", "WA", "6024", new Geocode("-31.827", "115.789927")), Lists.<Telecom>newArrayList(new Telecom("702", TelecomType.PHONE, "(08) 9246 8700")), LINKS_NONE));
        contacts.put("703", new Contact("703", "West Leederville Primary School",
                new Address("", "58", "Northwood St", "West Leederville", "WA", "6007", new Geocode("-31.93929", "115.832287")), Lists.<Telecom>newArrayList(new Telecom("704", TelecomType.PHONE, "(08) 9381 1655")), LINKS_NONE));
        contacts.put("705", new Contact("705", "West Leeming Primary School",
                new Address("", "", "Westall Tce", "Leeming", "WA", "6149", null), Lists.<Telecom>newArrayList(new Telecom("706", TelecomType.PHONE, "(08) 9310 1247")), LINKS_NONE));
        contacts.put("707", new Contact("707", "West Morley Pr.imary School",
                new Address("", "", "Fitzroy St", "Dianella", "WA", "6059", null), Lists.<Telecom>newArrayList(new Telecom("708", TelecomType.PHONE, "(08) 9375 2055")), LINKS_NONE));
        contacts.put("709", new Contact("709", "Westfield Park Primary School",
                new Address("", "", "Cammillo Rd (cnr Hemingway Drv)", "Westfield", "WA", "6111", null), Lists.<Telecom>newArrayList(new Telecom("710", TelecomType.PHONE, "(08) 9390 5555")), LINKS_NONE));
        contacts.put("711", new Contact("711", "Westminster Primary School",
                new Address("", "30", "Marloo Rd", "Westminster", "WA", "6061", new Geocode("-31.870296", "115.837502")), Lists.<Telecom>newArrayList(new Telecom("712", TelecomType.PHONE, "(08) 9349 1863")), LINKS_NONE));
        contacts.put("713", new Contact("713", "Westminister Junior Primary School",
                new Address("", "22", "Ungaroo Rd", "Westminster", "WA", "6061", new Geocode("-31.87175", "115.838076")), Lists.<Telecom>newArrayList(new Telecom("714", TelecomType.PHONE, "(08) 9349 4290")), LINKS_NONE));
        contacts.put("715", new Contact("715", "White Gum Valley Primary School",
                new Address("", "29", "Hope St", "White Gum Valley", "WA", "6162", new Geocode("-32.05851", "115.765302")), Lists.<Telecom>newArrayList(new Telecom("716", TelecomType.PHONE, "(08) 9335 2655")), LINKS_NONE));
        contacts.put("717", new Contact("717", "Willandra Primary School",
                new Address("", "", "Chidzey Drv", "Armadale", "WA", "6112", null), Lists.<Telecom>newArrayList(new Telecom("718", TelecomType.PHONE, "(08) 9497 1188")), LINKS_NONE));
        contacts.put("719", new Contact("719", "Willetton Primary School",
                new Address("", "14", "Woodpecker Av", "Willetton", "WA", "6155", new Geocode("-32.049178", "115.881522")), Lists.<Telecom>newArrayList(new Telecom("720", TelecomType.PHONE, "(08) 9354 2088")), LINKS_NONE));
        contacts.put("721", new Contact("721", "Wilson Primary School",
                new Address("", "60", "Armstrong Rd", "Wilson", "WA", "6107", new Geocode("-32.016873", "115.910914")), Lists.<Telecom>newArrayList(new Telecom("722", TelecomType.PHONE, "(08) 9458 1757")), LINKS_NONE));
        contacts.put("723", new Contact("723", "Winterfold Primary School",
                new Address("", "41", "Annie St", "Beaconsfield", "WA", "6162", new Geocode("-32.071603", "115.770882")), Lists.<Telecom>newArrayList(new Telecom("724", TelecomType.PHONE, "(08) 9337 2936")), LINKS_NONE));
        contacts.put("725", new Contact("725", "Winthrop Primary School",
                new Address("", "70-80", "Jackson Av", "Winthrop", "WA", "6150", new Geocode("-32.053769", "115.833232")), Lists.<Telecom>newArrayList(new Telecom("726", TelecomType.PHONE, "(08) 9310 6100")), LINKS_NONE));
        contacts.put("727", new Contact("727", "Wirrabirra Primary School",
                new Address("", "71", "Corfield St", "Gosnells", "WA", "6110", new Geocode("-32.074099", "115.980758")), Lists.<Telecom>newArrayList(new Telecom("728", TelecomType.PHONE, "(08) 9398 7233")), LINKS_NONE));
        contacts.put("729", new Contact("729", "Woodbridge Primary School",
                new Address("", "10", "Archer St", "West Midland", "WA", "6056", new Geocode("-31.893192", "115.996094")), Lists.<Telecom>newArrayList(new Telecom("730", TelecomType.PHONE, "(08) 9267 9900")), LINKS_NONE));
        contacts.put("731", new Contact("731", "Woodlands Primary School",
                new Address("", "7", "Bentwood Av", "Woodlands", "WA", "6018", new Geocode("-31.909828", "115.789869")), Lists.<Telecom>newArrayList(new Telecom("732", TelecomType.PHONE, "(08) 9446 3363")), LINKS_NONE));
        contacts.put("733", new Contact("733", "Woodlupine Primary School",
                new Address("", "29", "Solandra Wy", "Forrestfield", "WA", "6058", new Geocode("-31.985192", "116.003359")), Lists.<Telecom>newArrayList(new Telecom("734", TelecomType.PHONE, "(08) 9453 6928")), LINKS_NONE));
        contacts.put("735", new Contact("735", "Woodvale Primary School",
                new Address("", "44", "Keatley Cr", "Woodvale", "WA", "6026", new Geocode("-31.793608", "115.793901")), Lists.<Telecom>newArrayList(new Telecom("736", TelecomType.PHONE, "(08) 9409 6929")), LINKS_NONE));
        contacts.put("737", new Contact("737", "Wooroloo Primary School",
                new Address("", "", "Wade Rd", "Wooroloo", "WA", "6558", null), Lists.<Telecom>newArrayList(new Telecom("738", TelecomType.PHONE, "(08) 9573 1144")), LINKS_NONE));
        contacts.put("739", new Contact("739", "Wundowie Primary & Pre-Primary School",
                new Address("", "", "Boronia Ave (cnr Hawke Ave)", "Wundowie", "WA", "6560", null), Lists.<Telecom>newArrayList(new Telecom("740", TelecomType.PHONE, "(08) 9573 6239")), LINKS_NONE));
        contacts.put("741", new Contact("741", "Yale Primary School",
                new Address("", "", "Sage Rd", "Thornlie", "WA", "6108", null), Lists.<Telecom>newArrayList(new Telecom("742", TelecomType.PHONE, "(08) 9493 2088")), LINKS_NONE));
        contacts.put("743", new Contact("743", "Yanchep Primary School",
                new Address("", "15", "Primary Rd", "Yanchep", "WA", "6035", new Geocode("-31.551062", "115.63561")), Lists.<Telecom>newArrayList(new Telecom("744", TelecomType.PHONE, "(08) 9561 1155")), LINKS_NONE));
        contacts.put("745", new Contact("745", "Yangebup Primary School",
                new Address("", "55", "Moorhen Dr", "Yangebup", "WA", "6164", new Geocode("-32.120308", "115.819752")), Lists.<Telecom>newArrayList(new Telecom("746", TelecomType.PHONE, "(08) 9417 1210")), LINKS_NONE));
        contacts.put("747", new Contact("747", "Yokine Primary School",
                new Address("", "39", "Woodrow Av", "Yokine", "WA", "6060", new Geocode("-31.901861", "115.859314")), Lists.<Telecom>newArrayList(new Telecom("748", TelecomType.PHONE, "(08) 9242 2726")), LINKS_NONE));
        contacts.put("749", new Contact("749", "Yuluma Primary School",
                new Address("", "21", "Ambrose St", "Innaloo", "WA", "6018", new Geocode("-31.891285", "115.789998")), Lists.<Telecom>newArrayList(new Telecom("750", TelecomType.PHONE, "(08) 9244 5422")), LINKS_NONE));
        contacts.put("752", new Contact("752", "Applecross Senior High School",
                new Address("", "", "Links Rd", "Ardross", "WA", "6153", null), Lists.<Telecom>newArrayList(new Telecom("753", TelecomType.PHONE, "(08) 9314 9393")), LINKS_NONE));
        contacts.put("754", new Contact("754", "Armadale Senior High School",
                new Address("", "169", "South Western Hwy", "Armadale", "WA", "6112", new Geocode("-32.162136", "116.017092")), Lists.<Telecom>newArrayList(new Telecom("755", TelecomType.PHONE, "(08) 9497 6400")), LINKS_NONE));
        contacts.put("756", new Contact("756", "Ashdale Secondary College",
                new Address("", "75", "Westport Pde", "Darch", "WA", "6065", new Geocode("-31.810017", "115.84151")), Lists.<Telecom>newArrayList(new Telecom("757", TelecomType.PHONE, "(08) 9302 7100")), LINKS_NONE));
        contacts.put("758", new Contact("758", "Atwell College",
                new Address("", "201", "Brenchley Dr", "Atwell", "WA", "6164", new Geocode("-32.14435", "115.86528")), Lists.<Telecom>newArrayList(new Telecom("759", TelecomType.PHONE, "(08) 9414 4300")), LINKS_NONE));
        contacts.put("760", new Contact("760", "Balcatta Senior High School",
                new Address("", "", "Poincaire St", "Balcatta", "WA", "6021", null), Lists.<Telecom>newArrayList(new Telecom("761", TelecomType.PHONE, "(08) 9345 8200")), LINKS_NONE));
        contacts.put("762", new Contact("762", "Baldivis Secondary College",
                new Address("", "", "Stillwater Drv", "Baldivis", "WA", "6171", null), Lists.<Telecom>newArrayList(new Telecom("763", TelecomType.PHONE, "(08) 9523 3600")), LINKS_NONE));
        contacts.put("764", new Contact("764", "Balga Senior High School",
                new Address("", "2", "Markham Wy", "Balga", "WA", "6061", new Geocode("-31.851314", "115.844895")), Lists.<Telecom>newArrayList(new Telecom("765", TelecomType.PHONE, "(08) 9247 0222")), LINKS_NONE));
        contacts.put("766", new Contact("766", "Ballajura Community College",
                new Address("", "", "Illawarra Crs South", "Ballajura", "WA", "6066", null), Lists.<Telecom>newArrayList(new Telecom("767", TelecomType.PHONE, "(08) 9262 7777")), LINKS_NONE));
        contacts.put("768", new Contact("768", "Belmont City College",
                new Address("", "106", "Fisher St", "Belmont", "WA", "6104", new Geocode("-31.957869", "115.935312")), Lists.<Telecom>newArrayList(new Telecom("769", TelecomType.PHONE, "(08) 9479 2200")), LINKS_NONE));
        contacts.put("770", new Contact("770", "Belridge Senior High School",
                new Address("", "17", "Gwendoline Dr", "Beldon", "WA", "6027", new Geocode("-31.770446", "115.764627")), Lists.<Telecom>newArrayList(new Telecom("771", TelecomType.PHONE, "(08) 9408 8000")), LINKS_NONE));
        contacts.put("772", new Contact("772", "Bullsbrook District High School",
                new Address("", "", "Chittering Rd", "Bullsbrook", "WA", "6084", null), Lists.<Telecom>newArrayList(new Telecom("773", TelecomType.PHONE, "(08) 9571 1220")), LINKS_NONE));
        contacts.put("774", new Contact("774", "Butler College",
                new Address("", "38", "Bradman Dr", "Butler", "WA", "6036", new Geocode("-31.652192", "115.706868")), Lists.<Telecom>newArrayList(new Telecom("775", TelecomType.PHONE, "(08) 9285 3600")), LINKS_NONE));
        contacts.put("776", new Contact("776", "Cannington Community College",
                new Address("", "147", "Wharf St", "Cannington", "WA", "6107", new Geocode("-32.013164", "115.936424")), Lists.<Telecom>newArrayList(new Telecom("777", TelecomType.PHONE, "(08) 9351 2400")), LINKS_NONE));
        contacts.put("778", new Contact("778", "Canning College",
                new Address("", "", "Marquis St", "Bentley", "WA", "6102", null), Lists.<Telecom>newArrayList(new Telecom("779", TelecomType.PHONE, "(08) 9351 5600")), LINKS_NONE));
        contacts.put("780", new Contact("780", "Canning Vale College",
                new Address("", "26", "Dumbarton Rd", "Canning Vale", "WA", "6155", new Geocode("-32.083371", "115.921978")), Lists.<Telecom>newArrayList(new Telecom("781", TelecomType.PHONE, "(08) 9334 9000")), LINKS_NONE));
        contacts.put("782", new Contact("782", "Carine Senior High School",
                new Address("", "51", "Everingham St", "Carine", "WA", "6020", new Geocode("-31.853008", "115.777604")), Lists.<Telecom>newArrayList(new Telecom("783", TelecomType.PHONE, "(08) 9243 9100")), LINKS_NONE));
        contacts.put("784", new Contact("784", "Cecil Andrews Senior High School",
                new Address("", "", "Seville Drv", "Armadale", "WA", "6112", null), Lists.<Telecom>newArrayList(new Telecom("785", TelecomType.PHONE, "(08) 9497 0200")), LINKS_NONE));
        contacts.put("786", new Contact("786", "Christmas Island District High School",
                new Address("", "", "Murray Rd", "Christmas Island", "WA", "6798", null), Lists.<Telecom>newArrayList(new Telecom("787", TelecomType.PHONE, "(08) 9164 8546")), LINKS_NONE));
        contacts.put("788", new Contact("788", "Churchlands Senior High School",
                new Address("", "20", "Lucca St", "Churchlands", "WA", "6018", new Geocode("-31.917285", "115.788081")), Lists.<Telecom>newArrayList(new Telecom("789", TelecomType.PHONE, "(08) 9441 1700")), LINKS_NONE));
        contacts.put("790", new Contact("790", "Clarkson Community High School",
                new Address("", "16", "Walyunga Bvd", "Clarkson", "WA", "6030", new Geocode("-31.676083", "115.725638")), Lists.<Telecom>newArrayList(new Telecom("791", TelecomType.PHONE, "(08) 9400 1777")), LINKS_NONE));
        contacts.put("792", new Contact("792", "Cocos Island District High School",
                new Address("", "", "", "Cocos Islands", "WA", "6799", null), Lists.<Telecom>newArrayList(new Telecom("793", TelecomType.PHONE, "(08) 9162 6650")), LINKS_NONE));
        contacts.put("794", new Contact("794", "Comet Bay College",
                new Address("", "", "Allatoona Drv", "Secret Harbour", "WA", "6173", null), Lists.<Telecom>newArrayList(new Telecom("795", TelecomType.PHONE, "(08) 9553 8100")), LINKS_NONE));
        contacts.put("796", new Contact("796", "Como Secondary College",
                new Address("", "20", "Bruce St", "Como", "WA", "6152", new Geocode("-32.003652", "115.869091")), Lists.<Telecom>newArrayList(new Telecom("797", TelecomType.PHONE, "(08) 9365 2000")), LINKS_NONE));
        contacts.put("798", new Contact("798", "Coodanup Community College",
                new Address("", "", "Wanjeep St", "Mandurah", "WA", "6210", null), Lists.<Telecom>newArrayList(new Telecom("799", TelecomType.PHONE, "(08) 9581 0900")), LINKS_NONE));
        contacts.put("800", new Contact("800", "Cyril Jackson Senior Campus",
                new Address("", "53", "Reid St", "Bassendean", "WA", "6054", new Geocode("-31.913931", "115.946503")), Lists.<Telecom>newArrayList(new Telecom("801", TelecomType.PHONE, "(08) 9379 5122")), LINKS_NONE));
        contacts.put("802", new Contact("802", "Darling Range Sports College",
                new Address("", "117", "Berkshire Rd", "Forrestfield", "WA", "6058", new Geocode("-31.976234", "116.008769")), Lists.<Telecom>newArrayList(new Telecom("803", TelecomType.PHONE, "(08) 9453 0100")), LINKS_NONE));
        contacts.put("804", new Contact("804", "Duncraig Senior High School",
                new Address("", "27", "Readshaw Rd", "Duncraig", "WA", "6023", new Geocode("-31.823491", "115.766718")), Lists.<Telecom>newArrayList(new Telecom("805", TelecomType.PHONE, "(08) 6241 5000")), LINKS_NONE));
        contacts.put("806", new Contact("806", "Eastern Hills Senior High School",
                new Address("", "", "Keane St East", "Mt Helena", "WA", "6082", null), Lists.<Telecom>newArrayList(new Telecom("807", TelecomType.PHONE, "(08) 9573 0200")), LINKS_NONE));
        contacts.put("808", new Contact("808", "Ellenbrook Secondary College (Ellenbrook)",
                new Address("", "100", "Main St", "Ellenbrook", "WA", "6069", new Geocode("-31.784738", "115.965528")), Lists.<Telecom>newArrayList(new Telecom("809", TelecomType.PHONE, "(08) 9297 9700")), LINKS_NONE));
        contacts.put("810", new Contact("810", "Fremantle Fast Track",
                new Address("", "", "Cantonment St", "Fremantle", "WA", "6160", null), Lists.<Telecom>newArrayList(new Telecom("811", TelecomType.PHONE, "(08) 9430 7376")), LINKS_NONE));
        contacts.put("812", new Contact("812", "Gilmore College",
                new Address("", "", "Meares Ave", "Medina", "WA", "6167", null), Lists.<Telecom>newArrayList(new Telecom("813", TelecomType.PHONE, "(08) 9411 1811")), LINKS_NONE));
        contacts.put("814", new Contact("814", "Gingin District High School",
                new Address("", "1", "Daw St", "Gingin", "WA", "6503", new Geocode("-31.344584", "115.911382")), Lists.<Telecom>newArrayList(new Telecom("815", TelecomType.PHONE, "(08) 9575 5300")), LINKS_NONE));
        contacts.put("816", new Contact("816", "Girrawheen Senior High School",
                new Address("", "39", "Calvert Wy", "Girrawheen", "WA", "6064", new Geocode("-31.83804", "115.841868")), Lists.<Telecom>newArrayList(new Telecom("817", TelecomType.PHONE, "(08) 9247 0555")), LINKS_NONE));
        contacts.put("818", new Contact("818", "Governor Stirling Senior High School",
                new Address("", "", "William St", "Midland", "WA", "6056", null), Lists.<Telecom>newArrayList(new Telecom("819", TelecomType.PHONE, "(08) 6274 0300")), LINKS_NONE));
        contacts.put("820", new Contact("820", "Greenwood Senior High School",
                new Address("", "79", "Coolibah Dr", "Greenwood", "WA", "6024", new Geocode("-31.827", "115.789927")), Lists.<Telecom>newArrayList(new Telecom("821", TelecomType.PHONE, "(08) 9243 9200")), LINKS_NONE));
        contacts.put("822", new Contact("822", "Halls Head Community College",
                new Address("", "", "Casuarina Drv", "Halls Head", "WA", "6210", null), Lists.<Telecom>newArrayList(new Telecom("823", TelecomType.PHONE, "(08) 9535 5195")), LINKS_NONE));
        contacts.put("824", new Contact("824", "Hamilton Senior High School",
                new Address("", "", "Purvis St", "Hamilton Hill", "WA", "6163", null), Lists.<Telecom>newArrayList(new Telecom("825", TelecomType.PHONE, "(08) 9314 0314")), LINKS_NONE));
        contacts.put("826", new Contact("826", "Hampton Senior High School",
                new Address("", "", "Morley Drv East", "Morley", "WA", "6062", null), Lists.<Telecom>newArrayList(new Telecom("827", TelecomType.PHONE, "(08) 9270 5700")), LINKS_NONE));
        contacts.put("828", new Contact("828", "John Curtin College of The Arts",
                new Address("", "90", "Ellen St", "Fremantle", "WA", "6160", new Geocode("-32.050135", "115.756712")), Lists.<Telecom>newArrayList(new Telecom("829", TelecomType.PHONE, "(08) 9433 7200")), LINKS_NONE));
        contacts.put("830", new Contact("830", "John Forrest Secondary College",
                new Address("", "180", "Drake St", "Morley", "WA", "6062", new Geocode("-31.905786", "115.900072")), Lists.<Telecom>newArrayList(new Telecom("831", TelecomType.PHONE, "(08) 9473 4000")), LINKS_NONE));
        contacts.put("833", new Contact("833", "",
                new Address("", "", "Education Drv", "Mandurah", "WA", "6210", null), Lists.<Telecom>newArrayList(new Telecom("834", TelecomType.PHONE, "(08) 9583 7373")), LINKS_NONE));
        contacts.put("835", new Contact("835", "",
                new Address("", "35", "Gibla St", "Mandurah", "WA", "6210", new Geocode("-32.516504", "115.738112")), Lists.<Telecom>newArrayList(new Telecom("836", TelecomType.PHONE, "(08) 9535 3800")), LINKS_NONE));
        contacts.put("837", new Contact("837", "Kalamunda Senior High School",
                new Address("", "12", "Cotherstone Rd", "Kalamunda", "WA", "6076", new Geocode("-31.978805", "116.056208")), Lists.<Telecom>newArrayList(new Telecom("838", TelecomType.PHONE, "(08) 9293 6400")), LINKS_NONE));
        contacts.put("839", new Contact("839", "Kelmscott Senior High School",
                new Address("", "50", "Third Av (cnr Cammillo Rd)", "Kelmscott", "WA", "6111", new Geocode("-32.119904", "116.009718")), Lists.<Telecom>newArrayList(new Telecom("840", TelecomType.PHONE, "(08) 9495 7400")), LINKS_NONE));
        contacts.put("841", new Contact("841", "Kent Street Senior High School",
                new Address("", "", "Kent St", "East Victoria Park", "WA", "6101", null), Lists.<Telecom>newArrayList(new Telecom("842", TelecomType.PHONE, "(08) 9262 0500")), LINKS_NONE));
        contacts.put("843", new Contact("843", "Kinross College",
                new Address("", "", "Falkland Way", "Kinross", "WA", "6028", null), Lists.<Telecom>newArrayList(new Telecom("844", TelecomType.PHONE, "(08) 9306 6000")), LINKS_NONE));
        contacts.put("845", new Contact("845", "Lakeland Senior High School",
                new Address("", "", "South Lake Drv", "South Lake", "WA", "6164", null), Lists.<Telecom>newArrayList(new Telecom("846", TelecomType.PHONE, "(08) 9412 3100")), LINKS_NONE));
        contacts.put("847", new Contact("847", "Leeming Senior High School",
                new Address("", "", "Aulberry Pde", "Leeming", "WA", "6149", null), Lists.<Telecom>newArrayList(new Telecom("848", TelecomType.PHONE, "(08) 9310 1300")), LINKS_NONE));
        contacts.put("849", new Contact("849", "Lesmurdie Senior High School",
                new Address("", "21", "Reid Rd", "Lesmurdie", "WA", "6076", new Geocode("-32.01355", "116.051641")), Lists.<Telecom>newArrayList(new Telecom("850", TelecomType.PHONE, "(08) 9291 1200")), LINKS_NONE));
        contacts.put("851", new Contact("851", "Lockridge Senior High School",
                new Address("", "", "Benara Rd", "Kiara", "WA", "6054", null), Lists.<Telecom>newArrayList(new Telecom("852", TelecomType.PHONE, "(08) 9378 0200")), LINKS_NONE));
        contacts.put("853", new Contact("853", "Lynwood Senior High School",
                new Address("", "436", "Metcalfe Rd", "Parkwood", "WA", "6147", new Geocode("-32.043052", "115.917128")), Lists.<Telecom>newArrayList(new Telecom("854", TelecomType.PHONE, "(08) 9354 0600")), LINKS_NONE));
        contacts.put("855", new Contact("855", "Mandurah High School",
                new Address("", "35", "Gibla St", "Mandurah", "WA", "6210", new Geocode("-32.516504", "115.738112")), Lists.<Telecom>newArrayList(new Telecom("856", TelecomType.PHONE, "(08) 9535 3800")), LINKS_NONE));
        contacts.put("857", new Contact("857", "Melville Senior High School",
                new Address("", "18", "Potts St", "Melville", "WA", "6156", new Geocode("-32.045256", "115.804126")), Lists.<Telecom>newArrayList(new Telecom("858", TelecomType.PHONE, "(08) 9330 0300")), LINKS_NONE));
        contacts.put("859", new Contact("859", "Mindarie Senior College",
                new Address("", "14", "Elliston Pde", "Mindarie", "WA", "6030", new Geocode("-31.677113", "115.707309")), Lists.<Telecom>newArrayList(new Telecom("860", TelecomType.PHONE, "(08) 9304 5800")), LINKS_NONE));
        contacts.put("861", new Contact("861", "Mirrabooka Senior High School",
                new Address("", "", "Nollamara Ave", "Dianella", "WA", "6059", null), Lists.<Telecom>newArrayList(new Telecom("862", TelecomType.PHONE, "(08) 9345 9200")), LINKS_NONE));
        contacts.put("863", new Contact("863", "Morley Senior High School",
                new Address("", "19-43", "Bramwell Rd", "Morley", "WA", "6062", new Geocode("-31.875564", "115.88368")), Lists.<Telecom>newArrayList(new Telecom("864", TelecomType.PHONE, "(08) 9376 5555")), LINKS_NONE));
        contacts.put("865", new Contact("865", "Mount Lawley Senior High School",
                new Address("", "65", "Woodsome St", "Mt Lawley", "WA", "6050", new Geocode("-31.922096", "115.870491")), Lists.<Telecom>newArrayList(new Telecom("866", TelecomType.PHONE, "(08) 9471 0300")), LINKS_NONE));
        contacts.put("867", new Contact("867", "North Lake Senior Campus",
                new Address("", "188", "Winterfold Rd", "Kardinya", "WA", "6163", new Geocode("-32.074669", "115.811902")), Lists.<Telecom>newArrayList(new Telecom("868", TelecomType.PHONE, "(08) 9314 0444")), LINKS_NONE));
        contacts.put("869", new Contact("869", "Ocean Reef Senior High School",
                new Address("", "21", "Venturi Dr", "Ocean Reef", "WA", "6027", new Geocode("-31.760454", "115.738734")), Lists.<Telecom>newArrayList(new Telecom("870", TelecomType.PHONE, "(08) 9307 0222")), LINKS_NONE));
        contacts.put("871", new Contact("871", "Padbury Senior High School",
                new Address("", "33", "Giles Av", "Padbury", "WA", "6025", new Geocode("-31.807071", "115.761593")), Lists.<Telecom>newArrayList(new Telecom("872", TelecomType.PHONE, "(08) 9402 6100")), LINKS_NONE));
        contacts.put("873", new Contact("873", "Perth Modern School",
                new Address("", "90", "Roberts Rd", "Subiaco", "WA", "6008", new Geocode("-31.945465", "115.836034")), Lists.<Telecom>newArrayList(new Telecom("874", TelecomType.PHONE, "(08) 9380 0555")), LINKS_NONE));
        contacts.put("875", new Contact("875", "Pinjarra Senior High School",
                new Address("", "16", "Mclarty Rd", "Pinjarra", "WA", "6208", new Geocode("-32.633045", "115.871536")), Lists.<Telecom>newArrayList(new Telecom("876", TelecomType.PHONE, "(08) 9531 7000")), LINKS_NONE));
        contacts.put("877", new Contact("877", "Rockingham Senior High School",
                new Address("", "15", "Read St", "Rockingham", "WA", "6168", new Geocode("-32.284212", "115.737752")), Lists.<Telecom>newArrayList(new Telecom("878", TelecomType.PHONE, "(08) 9527 0300")), LINKS_NONE));
        contacts.put("879", new Contact("879", "Roleystone Community College",
                new Address("", "90", "Raeburn Rd", "Roleystone", "WA", "6111", new Geocode("-32.104791", "116.085707")), Lists.<Telecom>newArrayList(new Telecom("880", TelecomType.PHONE, "(08) 9391 6222")), LINKS_NONE));
        contacts.put("881", new Contact("881", "Rossmoyne Senior High School",
                new Address("", "1", "Keith Rd", "Rossmoyne", "WA", "6148", new Geocode("-32.045165", "115.869448")), Lists.<Telecom>newArrayList(new Telecom("882", TelecomType.PHONE, "(08) 9259 2100")), LINKS_NONE));
        contacts.put("883", new Contact("883", "Safety Bay Senior High School",
                new Address("", "", "Malibu Rd", "Safety Bay", "WA", "6169", null), Lists.<Telecom>newArrayList(new Telecom("884", TelecomType.PHONE, "(08) 9527 0200")), LINKS_NONE));
        contacts.put("885", new Contact("885", "Schools of Isolated and Distance Education",
                new Address("", "164-194", "Oxford St", "Leederville", "WA", "6007", new Geocode("-31.935545", "115.841272")), Lists.<Telecom>newArrayList(new Telecom("886", TelecomType.PHONE, "(08) 9242 6300")), LINKS_NONE));
        contacts.put("887", new Contact("887", "Sevenoaks Senior College",
                new Address("", "275", "Sevenoaks St", "Cannington", "WA", "6107", new Geocode("-32.011848", "115.942793")), Lists.<Telecom>newArrayList(new Telecom("888", TelecomType.PHONE, "(08) 9356 4900")), LINKS_NONE));
        contacts.put("889", new Contact("889", "Shenton College",
                new Address("", "227", "Stubbs Tce", "Shenton Park", "WA", "6008", new Geocode("-31.960517", "115.804407")), Lists.<Telecom>newArrayList(new Telecom("890", TelecomType.PHONE, "(08) 9488 2100")), LINKS_NONE));
        contacts.put("891", new Contact("891", "South Fremantle Senior High",
                new Address("", "", "Lefroy Rd", "Beaconsfield", "WA", "6162", null), Lists.<Telecom>newArrayList(new Telecom("892", TelecomType.PHONE, "(08) 9337 0500")), LINKS_NONE));
        contacts.put("893", new Contact("893", "Southern River College",
                new Address("", "", "Southern River Rd", "Gosnells", "WA", "6110", null), Lists.<Telecom>newArrayList(new Telecom("894", TelecomType.PHONE, "(08) 9398 2300")), LINKS_NONE));
        contacts.put("895", new Contact("895", "Swan View Senior High",
                new Address("", "", "Gladstone Ave", "Swan View", "WA", "6056", null), Lists.<Telecom>newArrayList(new Telecom("896", TelecomType.PHONE, "(08) 9294 0100")), LINKS_NONE));
        contacts.put("897", new Contact("897", "Thornlie Senior High School",
                new Address("", "2", "Ovens Rd", "Thornlie", "WA", "6108", new Geocode("-32.064073", "115.959681")), Lists.<Telecom>newArrayList(new Telecom("898", TelecomType.PHONE, "(08) 9376 2100")), LINKS_NONE));
        contacts.put("899", new Contact("899", "Tuart College",
                new Address("", "", "Banksia St", "Tuart Hill", "WA", "6060", null), Lists.<Telecom>newArrayList(new Telecom("900", TelecomType.PHONE, "(08) 9242 6222")), LINKS_NONE));
        contacts.put("901", new Contact("901", "Wanneroo Senior High School",
                new Address("", "56", "Quarkum St", "Wanneroo", "WA", "6065", new Geocode("-31.757913", "115.813238")), Lists.<Telecom>newArrayList(new Telecom("902", TelecomType.PHONE, "(08) 9206 6555")), LINKS_NONE));
        contacts.put("903", new Contact("903", "Warnbro Community High",
                new Address("", "2", "Swallowtail Pde", "Warnbro", "WA", "6169", new Geocode("-32.345569", "115.7575")), Lists.<Telecom>newArrayList(new Telecom("904", TelecomType.PHONE, "(08) 9593 4055")), LINKS_NONE));
        contacts.put("905", new Contact("905", "Waroona District High School",
                new Address("", "", "Millar St", "Waroona", "WA", "6215", null), Lists.<Telecom>newArrayList(new Telecom("906", TelecomType.PHONE, "(08) 9733 7000")), LINKS_NONE));
        contacts.put("907", new Contact("907", "Warwick Senior High",
                new Address("", "355", "Erindale Rd", "Warwick", "WA", "6024", new Geocode("-31.838384", "115.813822")), Lists.<Telecom>newArrayList(new Telecom("908", TelecomType.PHONE, "(08) 6240 4400")), LINKS_NONE));
        contacts.put("909", new Contact("909", "Willetton Senior High",
                new Address("", "", "Pinetree Gully Rd", "Willetton", "WA", "6155", null), Lists.<Telecom>newArrayList(new Telecom("910", TelecomType.PHONE, "(08) 9334 7200")), LINKS_NONE));
        contacts.put("911", new Contact("911", "Woodvale Secondary College",
                new Address("", "110", "Woodvale Dr", "Woodvale", "WA", "6026", new Geocode("-31.791507", "115.801586")), Lists.<Telecom>newArrayList(new Telecom("912", TelecomType.PHONE, "(08) 9309 0808")), LINKS_NONE));
        contacts.put("913", new Contact("913", "Yanchep District High",
                new Address("", "15", "Primary Rd", "Yanchep", "WA", "6035", new Geocode("-31.551062", "115.63561")), Lists.<Telecom>newArrayList(new Telecom("914", TelecomType.PHONE, "(08) 9561 1155")), LINKS_NONE));
        contacts.put("915", new Contact("915", "Yule Brook College",
                new Address("", "61", "Dellar Rd", "Maddington", "WA", "6109", new Geocode("-32.047305", "116.008451")), Lists.<Telecom>newArrayList(new Telecom("916", TelecomType.PHONE, "(08) 9251 8333")), LINKS_NONE));
        contacts.put("918", new Contact("918", "Armadale Education Support Centre",
                new Address("", "169", "South Western Hwy", "Armadale", "WA", "6112", new Geocode("-32.162136", "116.017092")), Lists.<Telecom>newArrayList(new Telecom("919", TelecomType.PHONE, "(08) 9497 6435")), LINKS_NONE));
        contacts.put("920", new Contact("920", "Beldon Education Support Centre",
                new Address("", "10", "Pacific Wy", "Beldon", "WA", "6027", new Geocode("-31.773852", "115.758033")), Lists.<Telecom>newArrayList(new Telecom("921", TelecomType.PHONE, "(08) 9402 3544")), LINKS_NONE));
        contacts.put("922", new Contact("922", "Belridge Education Support Centre",
                new Address("", "17", "Gwendoline Dr", "Beldon", "WA", "6027", new Geocode("-31.770446", "115.764627")), Lists.<Telecom>newArrayList(new Telecom("923", TelecomType.PHONE, "(08) 9408 8050")), LINKS_NONE));
        contacts.put("924", new Contact("924", "Burbridge School",
                new Address("", "46", "Burbridge Av", "Koondoola", "WA", "6064", new Geocode("-31.837554", "115.861699")), Lists.<Telecom>newArrayList(new Telecom("925", TelecomType.PHONE, "(08) 9342 1633")), LINKS_NONE));
        contacts.put("926", new Contact("926", "Canning Vale Education Support Centre",
                new Address("", "", "The Ramble", "Canning Vale", "WA", "6155", null), Lists.<Telecom>newArrayList(new Telecom("927", TelecomType.PHONE, "(08) 9455 7500")), LINKS_NONE));
        contacts.put("928", new Contact("928", "Cannington Community Education Support Centre",
                new Address("", "147", "Wharf St", "Cannington", "WA", "6107", new Geocode("-32.013164", "115.936424")), Lists.<Telecom>newArrayList(new Telecom("929", TelecomType.PHONE, "(08) 9351 2480")), LINKS_NONE));
        contacts.put("1059", new Contact("1059", "Career Enterprise Centre",
                new Address("", "", "Education Drv", "Mandurah", "WA", "6210", null), Lists.<Telecom>newArrayList(new Telecom("1060", TelecomType.PHONE, "(08) 9583 7333")), LINKS_NONE));
        contacts.put("1061", new Contact("1061", "Carson Street Primary School",
                new Address("", "19", "Carson St", "East Victoria Park", "WA", "6101", new Geocode("-31.992577", "115.906591")), Lists.<Telecom>newArrayList(new Telecom("1062", TelecomType.PHONE, "(08) 9361 7500")), LINKS_NONE));
        contacts.put("1063", new Contact("1063", "Castlereagh School",
                new Address("", "", "Castlereagh Cl", "Willetton", "WA", "6155", null), Lists.<Telecom>newArrayList(new Telecom("1064", TelecomType.PHONE, "(08) 9332 3000")), LINKS_NONE));
        contacts.put("1065", new Contact("1065", "Cloverdale Education Support Centre",
                new Address("", "180", "Fisher St", "St Cloverdale", "WA", "6105", new Geocode("-31.957869", "115.935312")), Lists.<Telecom>newArrayList(new Telecom("1066", TelecomType.PHONE, "(08) 9277 4888")), LINKS_NONE));
        contacts.put("1067", new Contact("1067", "Coolbellup Learning Centre",
                new Address("", "15", "Waverley Rd", "Coolbellup", "WA", "6163", new Geocode("-32.080407", "115.808703")), Lists.<Telecom>newArrayList(new Telecom("1068", TelecomType.PHONE, "(08) 9337 7343")), LINKS_NONE));
        contacts.put("1069", new Contact("1069", "Cyril Jackson Senior Campus Education Support Centre",
                new Address("", "53", "Reid St", "St Bassendean", "WA", "6054", new Geocode("-31.913931", "115.946503")), Lists.<Telecom>newArrayList(new Telecom("1070", TelecomType.PHONE, "(08) 9378 2469")), LINKS_NONE));
        contacts.put("1071", new Contact("1071", "Duncraig Senior High School Education Support Centre",
                new Address("", "27", "Readshaw Rd", "Duncraig", "WA", "6023", new Geocode("-31.823491", "115.766718")), Lists.<Telecom>newArrayList(new Telecom("1072", TelecomType.PHONE, "(08) 9203 6522")), LINKS_NONE));
        contacts.put("1073", new Contact("1073", "Durham Road School",
                new Address("", "37", "Durham Rd", "Bayswater", "WA", "6053", new Geocode("-31.916084", "115.919105")), Lists.<Telecom>newArrayList(new Telecom("1074", TelecomType.PHONE, "(08) 9271 0422")), LINKS_NONE));
        contacts.put("1075", new Contact("1075", "East Victoria Park Education Support Centre",
                new Address("", "30", "Beatty Av", "East Victoria Park", "WA", "6101", new Geocode("-31.979374", "115.90755")), Lists.<Telecom>newArrayList(new Telecom("1076", TelecomType.PHONE, "(08) 9470 3624")), LINKS_NONE));
        contacts.put("1077", new Contact("1077", "Endeavour Education Support Centre",
                new Address("", "38", "Endeavour Dr", "Port Kennedy", "WA", "6172", new Geocode("-32.370155", "115.752185")), Lists.<Telecom>newArrayList(new Telecom("1078", TelecomType.PHONE, "(08) 9524 5000")), LINKS_NONE));
        contacts.put("1079", new Contact("1079", "Gladys Newton School",
                new Address("", "93", "Balga Av", "Balga", "WA", "6061", new Geocode("-31.856122", "115.846592")), Lists.<Telecom>newArrayList(new Telecom("1080", TelecomType.PHONE, "(08) 9349 6499")), LINKS_NONE));
        contacts.put("1081", new Contact("1081", "Gwynne Park Education Support Centre",
                new Address("", "", "Tijuana Rd", "Armadale", "WA", "6112", null), Lists.<Telecom>newArrayList(new Telecom("1082", TelecomType.PHONE, "(08) 9497 3122")), LINKS_NONE));
        contacts.put("1083", new Contact("1083", "Halls Head Community College Education Support Centre",
                new Address("", "", "Causarina Drv", "Halls Head", "WA", "6210", null), Lists.<Telecom>newArrayList(new Telecom("1084", TelecomType.PHONE, "(08) 9535 9419")), LINKS_NONE));
        contacts.put("1085", new Contact("1085", "Hospital School Services",
                new Address("", "", "Thomas St", "Subiaco", "WA", "6008", null), Lists.<Telecom>newArrayList(new Telecom("1086", TelecomType.PHONE, "(08) 9340 8529")), LINKS_NONE));
        contacts.put("1087", new Contact("1087", "Joondalup Education Support Centre",
                new Address("", "150", "Blue Mountain Dr", "Joondalup", "WA", "6027", new Geocode("-31.723106", "115.761054")), Lists.<Telecom>newArrayList(new Telecom("1088", TelecomType.PHONE, "(08) 9300 0188")), LINKS_NONE));
        contacts.put("1089", new Contact("1089", "Kalamunda Education Support Centre",
                new Address("", "32", "Heath Rd", "Kalamunda", "WA", "6076", new Geocode("-31.971738", "116.051153")), Lists.<Telecom>newArrayList(new Telecom("1090", TelecomType.PHONE, "(08) 9293 4798")), LINKS_NONE));
        contacts.put("1091", new Contact("1091", "Kalamunda Senior High School Education Support Centre",
                new Address("", "12", "Cotherstone Rd", "Kalamunda", "WA", "6076", new Geocode("-31.978805", "116.056208")), Lists.<Telecom>newArrayList(new Telecom("1092", TelecomType.PHONE, "(08) 9293 6490")), LINKS_NONE));
        contacts.put("1093", new Contact("1093", "Kensington Secondary School",
                new Address("", "31", "George St", "Kensington", "WA", "6151", new Geocode("-31.984174", "115.886839")), Lists.<Telecom>newArrayList(new Telecom("1094", TelecomType.PHONE, "(08) 9367 3620")), LINKS_NONE));
        contacts.put("1095", new Contact("1095", "Kenwick School",
                new Address("", "1", "Moore St", "Kenwick", "WA", "6107", new Geocode("-32.037544", "115.96699")), Lists.<Telecom>newArrayList(new Telecom("1096", TelecomType.PHONE, "(08) 9459 1888")), LINKS_NONE));
        contacts.put("1097", new Contact("1097", "Koorana Education Support Centre",
                new Address("", "109", "Coronata Dr", "Warnbro", "WA", "6169", new Geocode("-32.341714", "115.765291")), Lists.<Telecom>newArrayList(new Telecom("1098", TelecomType.PHONE, "(08) 9593 4060")), LINKS_NONE));
        contacts.put("1099", new Contact("1099", "Landsdale Farm School",
                new Address("", "80", "Landsdale Rd", "Darch", "WA", "6065", new Geocode("-31.818122", "115.845762")), Lists.<Telecom>newArrayList(new Telecom("1100", TelecomType.PHONE, "(08) 9343 1222")), LINKS_NONE));
        contacts.put("1101", new Contact("1101", "Leda Education Support Centre",
                new Address("", "", "Feilman Drv", "Leda", "WA", "6170", null), Lists.<Telecom>newArrayList(new Telecom("1102", TelecomType.PHONE, "(08) 9439 2508")), LINKS_NONE));
        contacts.put("1103", new Contact("1103", "Leeming Senior High School Education Support Centre",
                new Address("", "", "Aulberry Pde", "Leeming", "WA", "6149", null), Lists.<Telecom>newArrayList(new Telecom("1104", TelecomType.PHONE, "(08) 9313 5408")), LINKS_NONE));
        contacts.put("1105", new Contact("1105", "Maddington Education Support Centre",
                new Address("", "1951", "Albany Hwy", "Maddington", "WA", "6109", new Geocode("-32.054041", "115.987446")), Lists.<Telecom>newArrayList(new Telecom("1106", TelecomType.PHONE, "(08) 9459 5910")), LINKS_NONE));
        contacts.put("1107", new Contact("1107", "Malibu School",
                new Address("", "104", "Georgetown Dr", "Safety Bay", "WA", "6169", new Geocode("-32.301346", "115.743233")), Lists.<Telecom>newArrayList(new Telecom("1108", TelecomType.PHONE, "(08) 9527 9009")), LINKS_NONE));
        contacts.put("1109", new Contact("1109", "Meadow Springs Education Support Centre",
                new Address("(cnr Bellerive Pass)", "320", "Oakmont Ave", "Meadow Springs", "WA", "6210", null), Lists.<Telecom>newArrayList(new Telecom("1110", TelecomType.PHONE, "(08) 9537 0450")), LINKS_NONE));
        contacts.put("1111", new Contact("1111", "Merriwa Education Support Centre",
                new Address("", "", "Baltimore Pde", "Merriwa", "WA", "6030", null), Lists.<Telecom>newArrayList(new Telecom("1112", TelecomType.PHONE, "(08) 9305 9897")), LINKS_NONE));
        contacts.put("1113", new Contact("1113", "Mirrabooka Senior High School Education Support Centre",
                new Address("", "180", "Nollamara Av", "Dianella", "WA", "6059", new Geocode("-31.876934", "115.853656")), Lists.<Telecom>newArrayList(new Telecom("1114", TelecomType.PHONE, "(08) 9344 4060")), LINKS_NONE));
        contacts.put("1115", new Contact("1115", "Mosman Park School for Deaf Children",
                new Address("", "91", "Victoria St", "Mosman Park", "WA", "6012", new Geocode("-32.012175", "115.762905")), Lists.<Telecom>newArrayList(new Telecom("1116", TelecomType.PHONE, "(08) 9384 2088")), LINKS_NONE));
        contacts.put("1117", new Contact("1117", "Mount Hawthorn Education Support Centre",
                new Address("", "", "Matlock St", "Mt Hawthorn", "WA", "6016", null), Lists.<Telecom>newArrayList(new Telecom("1118", TelecomType.PHONE, "(08) 9443 4022")), LINKS_NONE));
        contacts.put("1119", new Contact("1119", "Riverside; Education Support Centre",
                new Address("", "", "Taranca Rd", "Greenfields", "WA", "6210", null), Lists.<Telecom>newArrayList(new Telecom("1120", TelecomType.PHONE, "(08) 9534 0328")), LINKS_NONE));
        contacts.put("1121", new Contact("1121", "Riverton Education Support Centre East Riverton East Riverton",
                new Address("", "255", "Corinthian Rd", "Riverton", "WA", "6148", new Geocode("-32.033856", "115.900241")), Lists.<Telecom>newArrayList(new Telecom("1122", TelecomType.PHONE, "(08) 9457 8307")), LINKS_NONE));
        contacts.put("1123", new Contact("1123", "Rockingham Beach Education Support Centre",
                new Address("", "30", "Bay View St", "Rockingham", "WA", "6168", new Geocode("-32.282179", "115.723095")), Lists.<Telecom>newArrayList(new Telecom("1124", TelecomType.PHONE, "(08) 9528 2912")), LINKS_NONE));
        contacts.put("1125", new Contact("1125", "Rockingham Senior High School Education Support Centre",
                new Address("", "15", "Read St", "Rockingham", "WA", "6168", new Geocode("-32.284212", "115.737752")), Lists.<Telecom>newArrayList(new Telecom("1126", TelecomType.PHONE, "(08) 9592 9273")), LINKS_NONE));
        contacts.put("1127", new Contact("1127", "Roseworth Education Support Centre",
                new Address("", "30", "Stebbing Wy", "Girrawheen", "WA", "6064", new Geocode("-31.841436", "115.852692")), Lists.<Telecom>newArrayList(new Telecom("1128", TelecomType.PHONE, "(08) 6240 4040")), LINKS_NONE));
        contacts.put("1129", new Contact("1129", "Shenton Park Shenton College Deaf Education Centre",
                new Address("", "227", "Stubbs Tce", "Shenton Park", "WA", "6008", new Geocode("-31.960517", "115.804407")), Lists.<Telecom>newArrayList(new Telecom("1130", TelecomType.PHONE, "(08) 9488 2100")), LINKS_NONE));
        contacts.put("1131", new Contact("1131", "Sir David Brand School",
                new Address("", "", "Glick Rd", "Coolbinia", "WA", "6050", null), Lists.<Telecom>newArrayList(new Telecom("1132", TelecomType.PHONE, "(08) 9271 3576")), LINKS_NONE));
        contacts.put("1133", new Contact("1133", "South Ballajura Education Support Centre",
                new Address("", "", "Wyperfeld Gardns", "Ballajura", "WA", "6066", null), Lists.<Telecom>newArrayList(new Telecom("1134", TelecomType.PHONE, "(08) 9249 8912")), LINKS_NONE));
        contacts.put("1135", new Contact("1135", "The WA Institute for Deaf Education",
                new Address("", "53", "Curtin Av", "Cottesloe", "WA", "6011", new Geocode("-32.009758", "115.755467")), Lists.<Telecom>newArrayList(new Telecom("1136", TelecomType.PHONE, "(08) 9286 7000")), LINKS_NONE));
        contacts.put("1137", new Contact("1137", "Warnbro Community High School Education Support Centre",
                new Address("", "2", "Swallowtail Pde", "Warnbro", "WA", "6169", new Geocode("-32.345569", "115.7575")), Lists.<Telecom>newArrayList(new Telecom("1138", TelecomType.PHONE, "(08) 9553 0122")), LINKS_NONE));
        contacts.put("1139", new Contact("1139", "Westminster Education Support Centre",
                new Address("", "", "Marloo Rd", "Westminster", "WA", "6061", null), Lists.<Telecom>newArrayList(new Telecom("1140", TelecomType.PHONE, "(08) 9349 1344")), LINKS_NONE));
        contacts.put("1141", new Contact("1141", "Wirrabirra Education Support Centre",
                new Address("", "71", "Corfield St", "Gosnells", "WA", "6110", new Geocode("-32.074099", "115.980758")), Lists.<Telecom>newArrayList(new Telecom("1142", TelecomType.PHONE, "(08) 9398 1936")), LINKS_NONE));
        contacts.put("1144", new Contact("1144", "Camp School",
                new Address("", "", "Point Peron Rd", "Rockingham", "WA", "6168", null), Lists.<Telecom>newArrayList(new Telecom("1145", TelecomType.PHONE, "(08) 9527 9222")), LINKS_NONE));
        contacts.put("1148", new Contact("1148", "Balga Senior High School",
                new Address("", "", "Markham Way", "Balga", "WA", "6061", null), Lists.<Telecom>newArrayList(new Telecom("1149", TelecomType.PHONE, "(08) 9343 6169")), LINKS_NONE));
        contacts.put("1150", new Contact("1150", "Beaconsfield PrimarySchool Intensive English Centre",
                null, Lists.<Telecom>newArrayList(new Telecom("1151", TelecomType.PHONE, "(08) 9335 5806")), LINKS_NONE));
        contacts.put("1152", new Contact("1152", "Bassendean Cyril Jackson Senior Campus Intensive English Centre",
                new Address("", "53", "Reid St", "Bassendean", "WA", "6054", new Geocode("-31.913931", "115.946503")), Lists.<Telecom>newArrayList(new Telecom("1153", TelecomType.PHONE, "(08) 9379 5156")), LINKS_NONE));
        contacts.put("1154", new Contact("1154", "Greenwood Senior High School Intensive English Centre",
                new Address("", "79", "Coolibah Dr", "Greenwood", "WA", "6024", new Geocode("-31.827", "115.789927")), Lists.<Telecom>newArrayList(new Telecom("1155", TelecomType.PHONE, "(08) 9243 9200")), LINKS_NONE));
        contacts.put("1156", new Contact("1156", "Melville Senior High School Intensive English Centre",
                new Address("", "18", "Potts St", "Melville", "WA", "6156", new Geocode("-32.045256", "115.804126")), Lists.<Telecom>newArrayList(new Telecom("1157", TelecomType.PHONE, "(08) 9330 0341")), LINKS_NONE));
        contacts.put("1158", new Contact("1158", "Koondoola Primary School Intensive English Centre",
                new Address("", "50", "Burbridge Av", "Koondoola", "WA", "6064", new Geocode("-31.837539", "115.861763")), Lists.<Telecom>newArrayList(new Telecom("1159", TelecomType.PHONE, "(08) 9343 4617")), LINKS_NONE));
        contacts.put("1160", new Contact("1160", "HighgatePrimary School Intensive Language Centre",
                null, Lists.<Telecom>newArrayList(new Telecom("1161", TelecomType.PHONE, "(08) 9328 3725")), LINKS_NONE));
        contacts.put("1162", new Contact("1162", "Eddystone Primary School Intensive English Centre",
                new Address("", "", "Littorina Ave", "Heathridge", "WA", "6027", null), Lists.<Telecom>newArrayList(new Telecom("1163", TelecomType.PHONE, "(08) 9401 2235")), LINKS_NONE));
        contacts.put("1164", new Contact("1164", "Thornlie Primary School Intensive English Centre",
                new Address("", "85", "Thornlie Av", "Thornlie", "WA", "6108", new Geocode("-32.054195", "115.963444")), Lists.<Telecom>newArrayList(new Telecom("1165", TelecomType.PHONE, "(08) 9459 4304")), LINKS_NONE));
        contacts.put("1166", new Contact("1166", "Mirrabook Primary School Intensive English Centre",
                new Address("", "", "Laythorne St", "Dianella", "WA", "6059", null), Lists.<Telecom>newArrayList(new Telecom("1167", TelecomType.PHONE, "(08) 9440 7777")), LINKS_NONE));
        contacts.put("1168", new Contact("1168", "Nollamara Primary School Intensive English Centre",
                new Address("", "101", "Harrison St", "Nollamara", "WA", "6061", new Geocode("-31.885167", "115.840127")), Lists.<Telecom>newArrayList(new Telecom("1169", TelecomType.PHONE, "(08) 9349 5866")), LINKS_NONE));
        contacts.put("1170", new Contact("1170", "North Lake Senior Campus Intensive English Centre",
                new Address("", "188", "Winterfold Rd", "Kardinya", "WA", "6163", new Geocode("-32.074669", "115.811902")), Lists.<Telecom>newArrayList(new Telecom("1171", TelecomType.PHONE, "(08) 9314 0410")), LINKS_NONE));
        contacts.put("1172", new Contact("1172", "Parkwood Primary School Intensive English Centre",
                new Address("", "9", "Zelkova Wy", "Parkwood", "WA", "6147", new Geocode("-32.042775", "115.913567")), Lists.<Telecom>newArrayList(new Telecom("1173", TelecomType.PHONE, "(08) 9354 3014")), LINKS_NONE));
        contacts.put("1175", new Contact("1175", "Fremantle Language Development Centre",
                new Address("", "24", "Winnacott St", "Willagee", "WA", "6156", new Geocode("-32.049391", "115.80544")), Lists.<Telecom>newArrayList(new Telecom("1176", TelecomType.PHONE, "(08) 9331 8602")), LINKS_NONE));
        contacts.put("1177", new Contact("1177", "North East Metropolitan Language Development Centre",
                new Address("", "18", "View St", "Dianella", "WA", "6059", new Geocode("-31.889745", "115.885817")), Lists.<Telecom>newArrayList(new Telecom("1178", TelecomType.PHONE, "(08) 9275 5511")), LINKS_NONE));
        contacts.put("1179", new Contact("1179", "South East Language Development Centre",
                new Address("", "276", "Epsom Av", "Cloverdale", "WA", "6105", new Geocode("-31.949571", "115.947766")), Lists.<Telecom>newArrayList(new Telecom("1180", TelecomType.PHONE, "(08) 9277 3200")), LINKS_NONE));
        contacts.put("1181", new Contact("1181", "West Coast Language Development Centre",
                new Address("", "56", "Ridgewood Bvd", "Ridgewood", "WA", "6030", new Geocode("-31.665706", "115.7264")), Lists.<Telecom>newArrayList(new Telecom("1182", TelecomType.PHONE, "(08) 9304 4274")), LINKS_NONE));
        contacts.put("1183", new Contact("1183", "Peel Language Development School",
                new Address("", "", "Laguardia Loop", "Port Kennedy", "WA", "6172", null), Lists.<Telecom>newArrayList(new Telecom("1184", TelecomType.PHONE, "(08) 9593 9030")), LINKS_NONE));

        return contacts;
    }

    private ArrayList<Tab> createTabs(Map<String, Contact> contacts)
    {
        return Lists.<Tab>newArrayList(
                new ContactTab("101", "Contacts",
                        Lists.<Category>newArrayList(
                                new Category("100002", "General", Lists.<Association>newArrayList(
                                        new Association(contacts.get("1"))
                                ))
                        )),
                new FindUsTab("102", "Find Us", filterOnlyAddressedContacts(contacts.values()))
        );
    }
}

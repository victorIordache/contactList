package ro.jademy.contactlist;

import ro.jademy.contactlist.model.Contact;
import ro.jademy.contactlist.model.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class main {

    private static final String FILE_NAME = "contacts.txt";

    public static <Phone> void main(String[] args) {

        ArrayList<Contact> contactArrayList = new ArrayList<>();
        contactArrayList.add(new Contact("Victor","Iordache"));
        contactArrayList.add(new Contact("Ionut","Meran"));
        contactArrayList.add(new Contact("George","Iordache"));
        Smartphone phone = new Smartphone();
        phone.setContactList(contactArrayList);
        phone.showContacts();
        Contact c1 = new Contact("George","Iordache");
    }
}

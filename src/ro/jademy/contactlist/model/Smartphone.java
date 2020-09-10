package ro.jademy.contactlist.model;

import java.util.ArrayList;
import java.util.List;

public class Smartphone {
    private Owner owner;
    private int password;
    private List<Contact> contactList = new ArrayList<>();

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(ArrayList<Contact> contactList) {
        this.contactList = contactList;
    }

    public void showContacts(){
        contactList.forEach(Contact -> Contact.showData());
    }
}

package main.java.ro.jademy.contactlist.model;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import

public class Smartphone {
    private ro.jademy.contactlist.model.Owner owner;
    private int password;
    private List<Contact> contactList = new ArrayList<>();
    private static final String FILE_NAME = "contacts.csv";

    public Smartphone(Owner owner, int password) {
        this.owner = owner;
        this.password = password;
    }

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

    @Override
    public String toString() {
        return "Smartphone{" +
                "contactList=" + contactList +
                '}';
    }

    public void showMenu(){

    }

    public void showContacts(){
        contactList.forEach(Contact -> System.out.println(contactList));
    }

    public void getContacts() {
        try{
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            String header = reader.readLine();
            System.out.println(header);
            String line;
            while((line= reader.readLine()) != null){
                String lineSplitter[] = line.split(",");
                ro.jademy.contactlist.model.Contact contact = new Contact(lineSplitter[0],lineSplitter[1],lineSplitter[2],lineSplitter[3],lineSplitter[4], LocalDate.parse(lineSplitter[5]));
                contactList.add(contact);
            }
        }catch(FileNotFoundException ex) {
            // File contacts = new File("C:\\Users\\Victor\\IdeaProjects\\contactList\\contacts.csv");
            System.out.println("File not found!");
        }catch(IOException ex) {
            System.out.println("Empty file/Permission denied");
        }
    }

    public void unlock(){
        Scanner sc = new Scanner(System.in);
        try{
            int guesses=0;
            do{
                System.out.println("Welcome! What's your password?");
                int password = Integer.parseInt(sc.nextLine());
                if(password == this.password){
                    System.out.println("Welcome, " + this.owner.getFirstName() + "!");
                    getContacts();

                    showContacts();
                    break;
                }else{
                    guesses++;
                }
                if(guesses == 3){ throw new InvalidPasswordException(); }
            }while(guesses<3);
        }catch(InvalidPasswordException ex){
            System.out.println("Phone blocked!");
        }

    }

}

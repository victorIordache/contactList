package main.java.ro.jademy.contactlist;

import main.java.ro.jademy.contactlist.model.Smartphone;
import ro.jademy.contactlist.model.Menu;
import ro.jademy.contactlist.model.Owner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class main {


    public static void main(String[] args) {

        Owner Victor = new Owner("Victor","Iordache","victor.iordach@gmail.com", LocalDate.of(1998,02,24));
        Smartphone smartphone = new Smartphone(Victor,1234);
        smartphone.unlock();
        Menu menu = new Menu();
        menu.Test();
    }
}

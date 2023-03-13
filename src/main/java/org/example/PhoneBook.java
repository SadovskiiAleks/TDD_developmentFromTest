package org.example;

import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    private int quantityOfContacts = 0;

    private HashMap<String,String> phoneBook = new HashMap<>();
    public int add(String name, String number){
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name,number);
            return ++quantityOfContacts;
        } else {
            return quantityOfContacts;
        }
    }
}

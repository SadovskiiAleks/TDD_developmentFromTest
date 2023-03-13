package org.example;

import java.util.*;
import java.util.stream.Collectors;

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

    public String findByNumber(String number) {
        Map<String, String> contactWithNumber = phoneBook.entrySet().stream()
                .filter(x -> x.getValue() == number)
                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
        String name = null;
        for(Map.Entry<String, String> item : contactWithNumber.entrySet()){
            name = item.getKey();
            break;
        }
        return name;
    }

    public String findByName(String name) {
        return phoneBook.get(name);
    }

}

package com.example.designpatterns.patterns.iterator;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("John", "Doe");
        User user2 = new User("Jane", "Doe");
        User user3 = new User("Alis", "Doe");
        User user4 = new User("Bob", "Doe");
        User user5 = new User("Markus", "Doe");

        List<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        UserRepository userRepository = new UserRepository();
        userRepository.setUsers(users);
        userRepository.add(user4);
        userRepository.add(user5);

        Iterator<User> userIterator = userRepository.createIterator();
        while (userIterator.hasNext()) {
            User user = userIterator.next();
            System.out.println(user);
        }
    }
}

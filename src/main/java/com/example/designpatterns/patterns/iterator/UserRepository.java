package com.example.designpatterns.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class UserRepository implements Container<User> {

    List<User> users = new ArrayList<User>();

    @Override
    public Iterator<User> createIterator() {
        return new UserIterator();
    }
    public void add(User user) {
        users.add(user);
    }
    public void remove(User user) {
        users.remove(user);
    }
    public void setUsers(List<User> users) {
        this.users = users;
    }

    private class UserIterator implements Iterator<User> {
        int index = 0;
        @Override
        public boolean hasNext() {
            return index < users.size();
        }

        @Override
        public User next() {
            return hasNext() ?  users.get(index++) : null;
        }
    }

}

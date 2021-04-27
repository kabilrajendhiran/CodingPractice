package com.company.demo;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class FriendOfFriend {
    public static void fof(Friend friend)
    {
        Set<String> keySet = friend.getFriends().keySet();
        for (String key:keySet) {
            Friend friend1 = friend.getFriends().get(key);
            for(String k:keySet)
            {
                if(friend1.getFriends().containsKey(k))
                {
                    friend1.getFriends().put(k,friend.getFriends().get(k));
                }
            }
        }
        removeDuplicates(friend);
        //System.out.println(friend.getFriends().get("Murali").getFriends().keySet());
    }

    public static void removeDuplicates(Friend friend)
    {
        Set<String> set = new TreeSet();
        for (String key : friend.getFriends().keySet())
        {
            for (String key1: friend.getFriends().get(key).getFriends().keySet()) {
                set.add(key1);
            }
            set.remove(key);
        }
        System.out.println(set);
    }
}

class Friend {
    private String name;
    private HashMap<String,Friend> friends;

    @Override
    public String toString() {
        return name+" "+ friends;

    }

    public Friend(String name) {
        this.name = name;
        this.friends = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Friend> getFriends() {
        return friends;
    }

    public void setFriends(HashMap<String, Friend> friends) {
        this.friends = friends;
    }


}

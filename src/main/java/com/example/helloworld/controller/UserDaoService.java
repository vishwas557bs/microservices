package com.example.helloworld.controller;

import com.example.helloworld.bean.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();


    static
    {
        users.add( new User(1,"john",new Date()));
        users.add( new User(2,"smith",new Date()));
        users.add( new User(3,"hilton",new Date()));
    }
    private static int userCount = users.size();

    public List<User> findAll(){
        return users;
    }

    public User save(User user){
        if (user.getId()==null){
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id){
        for (User user:users){
            if (user.getId() == id ){
                return user;
            }
        }
        return null;
    }

    public User deleteById(int id){
        Iterator<User> iterator = users.iterator();
        while(iterator.hasNext()){
            User user = iterator.next();
            if (user.getId() == id){
                iterator.remove();
                return user;
            }
        }
        return null;
    }

}

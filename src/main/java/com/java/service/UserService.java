package com.java.service;

import com.java.repository.Userdao;
import com.java.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService  {

    @Autowired(required=true)
    private Userdao userdao;


    public User findByUserName(String name){
        User entity =null;
        try {
             entity =userdao.findByUserName(name);

        }catch (Exception e){}

        return entity;
    }
//    public Userdao findUserByName(String name){
//
//        return null;
//    }
//        Userdao user = null;
//        try{
//            user = userRepositoty.findByUserName(name);
//        System.out.println(user1);
//        }catch (Exception e){}
//
//        return user;
//    }
}
//@Service
//public class UserService {
//    @Autowired
//    private UserRepositoty userRepositoty;
//
//    public User findUserByName(String name){
//        User user = null;
//        try{
//            user = userRepositoty.findByUserName(name);
//        }catch (Exception e){}
//        return user;
//    }
//}

package com.java.repository;

import com.java.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Song on 2017/2/15.
 * User表操作接口
 */
@Repository
public interface Userdao extends JpaRepository<User,String>{

    @Query("select name from User  where id = :name")
    User findByUserName(@Param("name") String name);
}

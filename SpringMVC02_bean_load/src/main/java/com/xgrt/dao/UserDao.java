package com.xgrt.dao;

import com.xgrt.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    @Insert("insert into tb1_user(name,age) values (#{name},#{age})")
    void save(User user);
}

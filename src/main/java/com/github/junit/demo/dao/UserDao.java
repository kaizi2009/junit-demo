package com.github.junit.demo.dao;

import com.github.junit.demo.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    @Select("select * from users where id = #{id}")
    @Results(id = "BaseResultMap", value = {
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name"),
    })
    User getById(Long id);

    @Delete("delete from users where id = #{id}")
    void delete(Integer id);

}

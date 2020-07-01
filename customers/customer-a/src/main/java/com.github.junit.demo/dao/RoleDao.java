package com.github.junit.demo.dao;

import com.github.junit.demo.entity.Role;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao {
    @Select("select * from role where id = #{id}")
    @Results(id = "BaseResultMap", value = {
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name"),
    })
    Role getById(Integer id);
}

package com.github.junit.demo.dao;

import com.github.junit.demo.entity.UserRole;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRoleDao {
    @Select("select * from user_role where userId = #{userId}")
    @Results(id = "BaseResultMap", value = {
            @Result(column = "id", property = "id"),
            @Result(column = "user_id", property = "userId"),
            @Result(column = "role_id", property = "roleId"),
    })
    List<UserRole> getByUserId(Long userId);

}

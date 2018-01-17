package cn.amos.boot.dao.mappers;

import cn.amos.boot.dao.entity.UserEntity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * PROJECT: first
 * DATE: 2018/1/14
 *
 * @author DaoYuanWang
 */
@Repository
public interface UserMapper {

    @Select("select * from user where id=#{id}")
    UserEntity selectById(Long id);

    @Select("select * from user")
    List<UserEntity> selectAll();

}

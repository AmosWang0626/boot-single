package cn.amos.boot.dao.mappers;

import cn.amos.boot.dao.entity.ApplyEntity;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * PROJECT: first
 * DATE: 2018/1/14
 *
 * @author DaoYuanWang
 */
@Repository
public interface ApplyMapper {

    @Select("select * from apply where APPLY_NO=#{applyNo}")
    @Results({
            @Result(property = "applyNo", column = "APPLY_NO"),
            @Result(property = "userId", column = "USER_ID"),
            @Result(property = "applyAmt", column = "APPLY_AMT"),
            @Result(property = "applyTime", column = "APPLY_TIME"),
            @Result(property = "applyType", column = "APPLY_TYPE"),
            @Result(property = "applyStatus", column = "APPLY_STATUS"),
            @Result(property = "reason", column = "REASON")})
    ApplyEntity selectByApplyNo(String applyNo);

}

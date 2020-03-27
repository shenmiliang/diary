package com.hl.diary.mapper;

import com.hl.diary.pojo.Release;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ReleaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Release record);

    int insertSelective(Release record);

    Release selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Release record);

    int updateByPrimaryKey(Release record);
}
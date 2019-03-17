package com.mt.mapper;

import com.mt.domain.MituXsxx;
import com.mt.domain.MituXsxxExample;

import java.util.List;

import com.mt.domain.QueryBean;
import org.apache.ibatis.annotations.Param;

public interface MituXsxxMapper {
    long countByExample(MituXsxxExample example);

    int deleteByExample(MituXsxxExample example);

    int insert(MituXsxx record);

    List<MituXsxx> selectByPage(QueryBean bean);

    int insertSelective(MituXsxx record);

    List<MituXsxx> selectByExample(MituXsxxExample example);

    int updateByExampleSelective(@Param("record") MituXsxx record, @Param("example") MituXsxxExample example);

    int updateByExample(@Param("record") MituXsxx record, @Param("example") MituXsxxExample example);
}
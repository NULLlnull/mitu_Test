package com.mt.mapper.impl;

import com.mt.domain.DataConnection;
import com.mt.domain.MituXsxx;
import com.mt.domain.MituXsxxExample;
import com.mt.domain.QueryBean;
import com.mt.mapper.MituXsxxMapper;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class MituXsxxMapperImpl implements MituXsxxMapper {
    private static final String NAMEBASE = "com.mt.mapper.MituXsxxMapper.";
    private static final int INSERT = 1, UPDATE = 2, DELETE = 3;
    private SqlSession sqlSession = null;
    private DataConnection dataConnection = null;

    private String getName(String name) {
        return NAMEBASE + name;
    }

    public MituXsxxMapperImpl() {
        dataConnection = new DataConnection();
    }

    @Override
    public long countByExample(MituXsxxExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(MituXsxxExample example) {
        return 0;
    }

    @Override
    public int insert(MituXsxx record) {
        return 0;
    }

    @Override
    public List<MituXsxx> selectByPage(QueryBean bean) {
        return selectMore("selectByPage", bean);
    }

    @Override
    public int insertSelective(MituXsxx record) {
        return 0;
    }

    @Override
    public List<MituXsxx> selectByExample(MituXsxxExample example) {
        return null;
    }

    @Override
    public int updateByExampleSelective(MituXsxx record, MituXsxxExample example) {
        return 0;
    }

    @Override
    public int updateByExample(MituXsxx record, MituXsxxExample example) {
        return 0;
    }

    private List<MituXsxx> selectMore(String mapper, Object bean) {
        List<MituXsxx> datas = null;
        try {
            sqlSession = dataConnection.getSqlSession();
            datas = sqlSession.selectList(mapper, bean);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return datas;
    }
}

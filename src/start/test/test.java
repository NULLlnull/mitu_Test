package start.test;

import com.google.gson.Gson;
import com.mt.dao.TableDao;
import com.mt.domain.DataConnection;
import com.mt.domain.MituXsxx;
import com.mt.domain.QueryBean;
import com.mt.mapper.MituXsxxMapper;
import com.mt.mapper.impl.MituXsxxMapperImpl;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class test {
    SqlSession sqlSession = null;
    DataConnection dataConnection = new DataConnection();

    @Test
    public void Query() {
        MituXsxxMapper mituXsxxMapper = new MituXsxxMapperImpl();
        Gson gson = new Gson();
        TableDao dao = new TableDao();
        List<MituXsxx> datas = mituXsxxMapper.selectByPage(new QueryBean(2, 10));
        dao.setData(datas);
        dao.setDraw(1);
        dao.setRecordsFiltered(datas.size());
        dao.setRecordsTotal(datas.size());
        System.out.println(gson.toJson(dao));
    }
}

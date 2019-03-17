package service;

import com.google.gson.Gson;
import com.mt.dao.TableDao;
import com.mt.domain.MituXsxx;
import com.mt.domain.QueryBean;
import com.mt.mapper.MituXsxxMapper;
import com.mt.mapper.impl.MituXsxxMapperImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Server
 */
@WebServlet(name = "StuInfoServlet", urlPatterns = "/StuInfo")
public class StuInfoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
//        request.setCharacterEncoding("UTF-8");
//        response.setCharacterEncoding("UTF-8");
        String page = request.getParameter("page");
        String pageNum = request.getParameter("pageNum");

        MituXsxxMapper mituXsxxMapper = new MituXsxxMapperImpl();
        Gson gson = new Gson();
        TableDao dao = new TableDao();
        List<MituXsxx> datas = mituXsxxMapper.selectByPage(new QueryBean(Integer.valueOf(page), Integer.valueOf(pageNum)));
        dao.setData(datas);
        dao.setDraw(Integer.parseInt(page));
        dao.setRecordsFiltered(datas.size());
        dao.setRecordsTotal(datas.size());
//        System.out.println(gson.toJson(dao));
        response.getWriter().print(gson.toJson(dao));
    }
}

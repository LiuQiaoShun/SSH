package com.tz.tan;


import com.tz.util.TransApi;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/trans")
public class Translate extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        String text=req.getParameter("text");
        String from=req.getParameter("from");
        String to=req.getParameter("to");
        String result=getResult(text,from,to);
        resp.getWriter().print(result);
    }

    public static String getResult(String text,String from,String to){
//        String APPID="20180423000149424";
        String APPID="3307824998@qq.com";
        String key="v9Na8fAWukifWuyXCnTk";
        TransApi pai=new TransApi(APPID,key);
        String result=pai.getTransResult(text,from,to);
        return result;
    }
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("utf-8");
//        resp.setCharacterEncoding("utf-8");
//        String text=req.getParameter("text");
//        String from=req.getParameter("from");
//        String to=req.getParameter("to");
//        String result=getResult(text,from,to);
//        resp.getWriter().print(result);
//    }
}

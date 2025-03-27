package com.jjanggu.section01.xml;

import com.jjanggu.dto.MenuDto;
import org.apache.ibatis.session.SqlSession;

import static com.jjanggu.section01.xml.Template.getSqlSession;

public class MenuService {

    private MenuDao menuDao = new MenuDao();

    public int insertMenu(MenuDto menu){
        SqlSession sqlSession = getSqlSession();
        int result = menuDao.insertMenu(sqlSession,menu);
        if(result > 0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result;

    }
}

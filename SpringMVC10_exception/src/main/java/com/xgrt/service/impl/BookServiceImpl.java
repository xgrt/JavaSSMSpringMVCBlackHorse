package com.xgrt.service.impl;

import com.xgrt.controller.Code;
import com.xgrt.dao.BookDao;
import com.xgrt.domain.Book;
import com.xgrt.exception.BusinessException;
import com.xgrt.exception.SystemException;
import com.xgrt.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    @Override
    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    @Override
    public List<Book> selectAll() {
        return bookDao.selectAll();
    }

    @Override
    public Book selectById(Integer id) {

        //将可能出现的异常进行包装。转换成自定义异常

        /*if(id==1){//模拟不规范的输入操作
            throw new BusinessException(Code.BUSINESS_ERR,"请不要用你的技术挑战我的耐心");
        }

        //最原始的方法
        try {
            int i=1/0;//模拟数据库异常
        }catch (ArithmeticException e){
            throw new SystemException(Code.SYSTEM_ERR,"服务访问超时，请重试");//转换成自定义异常
        }*/



        return bookDao.selectById(id);
    }
}

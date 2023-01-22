package com.xgrt.service;

import com.xgrt.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional//加上事务
public interface BookService {
    /**
     * 保存书本
     */
    boolean save(Book book);

    /**
     * 修改书本信息
     */
    boolean update(Book book);


    /**
     * 按id删除书本
     */
    boolean delete(Integer id);

    /**
     * 查询所有书本
     */
    List<Book> selectAll();

    /**
     * 按id查询书本
     */
    Book selectById(Integer id);
}

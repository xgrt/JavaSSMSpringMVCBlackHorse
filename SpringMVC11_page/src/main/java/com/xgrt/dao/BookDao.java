package com.xgrt.dao;

import com.xgrt.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao {
    //    @Insert("insert into tbl_book values (null,#{type},#{name},#{description})")
    @Insert("insert into tbl_book(type,name,description) values (#{type},#{name},#{description})")
    int save(Book book);

    @Update("UPDATE tbl_book set type=#{type}, name=#{name}, description=#{description} where id=#{id}")
    int update(Book book);

    @Delete("DELETE from tbl_book where id=#{id}")
    int delete(Integer id);

    @Select("select * from tbl_book")
    List<Book> selectAll();

    @Select("select * from tbl_book where id=#{id}")
    Book selectById(Integer id);
}

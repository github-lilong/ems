package com.baizhi.dao;
import com.baizhi.entity.Emp;
import java.util.List;
public interface EmpDAO {
    void delete(Integer id);
    void insert(Emp emp);
    Emp select(String username);
    List<Emp> selectAll();
    Emp selectById(Integer id);
    void update(Emp emp);
}
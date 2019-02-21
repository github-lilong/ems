package com.baizhi.service;
import com.baizhi.entity.Emp;
import java.util.List;
public interface EmpService {
    Emp getByUsername(String username);
    List<Emp> getAll();
    void add(Emp emp);
    void remove(Integer id);
    Emp getById(Integer id);
    void modify(Emp emp);
}

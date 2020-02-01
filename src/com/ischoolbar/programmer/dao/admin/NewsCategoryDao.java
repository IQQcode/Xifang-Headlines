package com.ischoolbar.programmer.dao.admin;


import com.ischoolbar.programmer.entity.admin.NewsCategory;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author: Mr.Q
 * @Date: 2020-02-01 10:02
 * @Description:新闻分类Dao层
 */
@Repository
public interface NewsCategoryDao {
    public int add(NewsCategory newsCategory);
    public int edit(NewsCategory newsCategory);
    public int delete(Long id);
    public List<NewsCategory> findList(Map<String,Object> queryMap);
    public int getTotal(Map<String,Object> queryMap);
}

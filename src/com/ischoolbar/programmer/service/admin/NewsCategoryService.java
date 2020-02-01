package com.ischoolbar.programmer.service.admin;


import com.ischoolbar.programmer.entity.admin.NewsCategory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: Mr.Q
 * @Date: 2020-02-01 09:59
 * @Description:新闻分类接口
 */
@Service
public interface NewsCategoryService {
    /**
     * CRUT
     * @param newsCategory
     * @return
     */
    public int add(NewsCategory newsCategory);
    public int edit(NewsCategory newsCategory);
    public int delete(Long id);
    public List<NewsCategory> findList(Map<String,Object> queryMap);
    public int getTotal(Map<String,Object> queryMap);

}

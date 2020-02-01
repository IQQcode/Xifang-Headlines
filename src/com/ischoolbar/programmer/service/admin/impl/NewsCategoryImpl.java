package com.ischoolbar.programmer.service.admin.impl;


import com.ischoolbar.programmer.dao.admin.NewsCategoryDao;
import com.ischoolbar.programmer.entity.admin.NewsCategory;
import com.ischoolbar.programmer.service.admin.NewsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: Mr.Q
 * @Date: 2020-02-01 10:03
 * @Description:新闻分类Service实现类
 */
@Service
public class NewsCategoryImpl implements NewsCategoryService {
    @Autowired
    private NewsCategoryDao newsCategoryDao;

    @Override
    public int add(NewsCategory newsCategory) {
        return newsCategoryDao.add(newsCategory);
    }

    @Override
    public int edit(NewsCategory newsCategory) {
        return newsCategoryDao.edit(newsCategory);
    }

    @Override
    public int delete(Long id) {
        return newsCategoryDao.delete(id);
    }

    @Override
    public List<NewsCategory> findList(Map<String, Object> queryMap) {
        return newsCategoryDao.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return newsCategoryDao.getTotal(queryMap);
    }
}

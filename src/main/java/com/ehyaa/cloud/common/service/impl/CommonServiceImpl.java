package com.ehyaa.cloud.common.service.impl;

import com.ehyaa.cloud.common.repository.CommonRepository;
import com.ehyaa.cloud.common.service.CommonService;

import java.util.List;

/**
 * @author 李泽阳 on 2019/12/10 17:09
 */
public class CommonServiceImpl implements CommonService {

    public CommonRepository getRepository() {
        return repository;
    }

    public void setRepository(CommonRepository repository) {
        this.repository = repository;
    }

    protected CommonRepository repository;


    @Override
    public void save(Object entity) throws Exception {
        this.repository.save(entity);
    }

    @Override
    public void saveOrUpdate(Object entity) throws Exception {

    }

    @Override
    public void update(Object entity) throws Exception {

    }

    @Override
    public List<Object> getAll() throws Exception {
        return null;
    }

    @Override
    public void delete(Object entity) throws Exception {

    }

    @Override
    public void deleteById(String id) throws Exception {

    }

    @Override
    public void deleteAll(Object entity) throws Exception {

    }

    @Override
    public <T> T findById(String id) throws Exception {
        return null;
    }

    @Override
    public <T> T findAll(String id) throws Exception {
        return null;
    }

    @Override
    public <T> T findAllById() throws Exception {
        return null;
    }
}

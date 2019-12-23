package com.ehyaa.cloud.common.service.impl;

import com.ehyaa.cloud.common.repository.CommonRepository;
import com.ehyaa.cloud.common.service.CommonService;

import java.io.Serializable;
import java.util.List;

/**
 * @author 李泽阳 on 2019/12/10 17:09
 */
public class CommonServiceImpl implements CommonService {
    protected CommonRepository repository;

    public CommonRepository getRepository() {
        return repository;
    }

    public void setRepository(CommonRepository repository) {
        this.repository = repository;
    }


    @Override
    public <T> void save(T entity) throws Exception {
        this.repository.save(entity);
    }

    @Override
    public <T> void saveOrUpdate(T entity) throws Exception {
        this.repository.saveAndFlush(entity);
    }

    @Override
    public void update(Object entity) throws Exception {


    }

    @Override
    public List<Object> getAll() throws Exception {
        return repository.findAll();
    }

    @Override
    public void delete(Object entity) throws Exception {
        this.repository.delete(entity);
    }

    @Override
    public void deleteById(String id) throws Exception {
        this.repository.deleteById(id);
    }

    @Override
    public void deleteAll() throws Exception {
        this.repository.deleteAll();
    }

    @Override
    public <T> T get(String id) throws Exception {
        return (T) this.repository.findById(id).get();
    }


    @Override
    public <T> List<T> findAllByListId(List<T> listVarIds) throws Exception {
        return this.repository.findAllById(listVarIds);
    }
}

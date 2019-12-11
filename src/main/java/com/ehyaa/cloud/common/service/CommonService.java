package com.ehyaa.cloud.common.service;

import java.util.List;

/**
 * @author 李泽阳 on 2019/12/10 17:08
 */
public interface CommonService {

    public void save(Object entity) throws Exception;

    public void saveOrUpdate(Object entity) throws Exception;

    public void update(Object entity) throws Exception;

    public List<Object> getAll() throws Exception;

    public void delete(Object entity) throws Exception;

    public void deleteById(String id) throws Exception;

    public void deleteAll(Object entity) throws Exception;

    public <T> T findById(String id) throws Exception;

    public <T> T findAll(String id) throws Exception;

    public <T> T findAllById() throws Exception;


}

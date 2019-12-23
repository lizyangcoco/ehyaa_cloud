package com.ehyaa.cloud.common.service;

import java.io.Serializable;
import java.util.List;

/**
 * @author 李泽阳 on 2019/12/10 17:08
 */
public interface CommonService {
    /**
     * 保存对象实体
     * (未返回实体存储对象Id)
     *
     * @param entity
     * @param <T>
     * @return
     * @throws Exception
     */
    public <T> void save(T entity) throws Exception;

    /**
     * 保存并更新实体
     *
     * @param entity
     * @param <T>
     * @throws Exception
     */
    public <T> void saveOrUpdate(T entity) throws Exception;

    public void update(Object entity) throws Exception;

    /**
     * 获取全部实体
     *
     * @return
     * @throws Exception
     */
    public List<Object> getAll() throws Exception;

    /**
     * 删除指定实体
     *
     * @param entity
     * @throws Exception
     */
    public void delete(Object entity) throws Exception;

    /**
     * 根据Id删除实体对象
     *
     * @param id
     * @throws Exception
     */
    public void deleteById(String id) throws Exception;

    /**
     * 删除全部
     *
     * @throws Exception
     */
    public void deleteAll() throws Exception;

    /**
     * 根据Id查找实体对象
     *
     * @param id
     * @param <T>
     * @return
     * @throws Exception
     */
    public <T> T get(String id) throws Exception;

    /**
     * 根据IdList查询集合
     *
     * @param listVarIds
     * @param <T>
     * @return
     * @throws Exception
     */
    public <T> List<T> findAllByListId(List<T> listVarIds) throws Exception;


}

package com.ehyaa.cloud.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.awt.print.Book;

/**
 * @author 李泽阳 on 2019/12/10 17:16
 */
@NoRepositoryBean
public interface CommonRepository<T,D>extends JpaRepository<T,D>, JpaSpecificationExecutor<Book> {
}

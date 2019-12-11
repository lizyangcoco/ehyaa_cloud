package com.ehyaa.cloud.common.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 类描述：分页参数对象
 * @author 李泽阳 on 2019/12/10 17:24
 */
@Getter
@Setter
public class PageVo {
    private int page = 1;//当前页
    private int rows = 10;//每页显示记录数
    private int pageNumber = 1;// 当前页
    private int pageSize = 10;// 每页显示记录数
}

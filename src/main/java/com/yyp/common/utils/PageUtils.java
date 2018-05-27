package com.yyp.common.utils;

import com.baomidou.mybatisplus.plugins.Page;
import lombok.Getter;
import lombok.Setter;
import sun.rmi.runtime.Log;

import java.io.Serializable;
import java.util.List;

/**
 * 分页工具类
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年11月4日 下午12:59:00
 *
 */
@Setter
@Getter
public class PageUtils implements Serializable {
    private static final long serialVersionUID = 1L;
    //总记录数
    private Long totalCount;
    //每页记录数
    private int pageSize;
    //总页数
    private Long totalPage;
    //当前页数
    private int currPage;
    //列表数据
    private List<?> list;

    /**
     * 分页
     * @param list        列表数据
     * @param totalCount  总记录数
     * @param pageSize    每页记录数
     * @param currPage    当前页数
     */
    public PageUtils(List<?> list, Long totalCount, int pageSize, int currPage) {
        this.list = list;
        this.totalCount = totalCount;
        this.pageSize = pageSize;
        this.currPage = currPage;
        this.totalPage = Double.doubleToLongBits(Math.ceil(totalCount/pageSize));
    }

    /**
     * 分页
     */
    public PageUtils(Page<?> page) {
        this.list = page.getRecords();
        this.totalCount = page.getTotal();
        this.pageSize = page.getSize();
        this.currPage = page.getCurrent();
        this.totalPage = page.getPages();
    }

}

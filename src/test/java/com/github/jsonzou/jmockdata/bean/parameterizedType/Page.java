package com.github.jsonzou.jmockdata.bean.parameterizedType;

import java.util.List;

/**
 * @author yinyg
 * @date 2023/4/18
 */
public abstract class Page<C> {

    /** 页码 */
    int pageNum;

    /** 每页数量 */
    int pageSize;

    /** 总数 */
    long total;

    /** 结果集 */
    List<C> list;

    public int getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(final int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(final int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotal() {
        return this.total;
    }

    public void setTotal(final long total) {
        this.total = total;
    }

    public List<C> getList() {
        return this.list;
    }

    public void setList(final List<C> list) {
        this.list = list;
    }

}

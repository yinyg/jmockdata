package com.github.jsonzou.jmockdata.bean.parameterizedType;

/**
 * 统一返回结果
 * @author yinyg
 * @date 2023/4/17
 */
public class ResponseBean<A> {

    /** 编码 */
    private String code;

    /** 返回结果 */
    private A data;

    public String getCode() {
        return this.code;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    public A getData() {
        return this.data;
    }

    public void setData(final A data) {
        this.data = data;
    }

}

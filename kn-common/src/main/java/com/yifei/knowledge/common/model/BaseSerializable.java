package com.yifei.knowledge.common.model;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * @author luqs
 * @version v1.0
 * @date 2020/6/4 00:22
 */
public class BaseSerializable implements Serializable {
    private static final long serialVersionUID = 8905778925622238681L;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}

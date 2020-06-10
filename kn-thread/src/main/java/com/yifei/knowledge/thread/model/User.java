package com.yifei.knowledge.thread.model;

import com.yifei.knowledge.common.model.BaseSerializable;
import lombok.Data;

/**
 * @author luqs
 * @version v1.0
 * @date 2020/6/10 15:12
 */
@Data
public class User extends BaseSerializable {
    private static final long serialVersionUID = 8905778925622238681L;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
}

package com.yifei.knowledge.thread.test;

import com.yifei.knowledge.thread.ThreadLocalUtils;
import com.yifei.knowledge.thread.model.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author luqs
 * @version v1.0
 * @date 2020/6/10 16:03
 */
@Slf4j
public class ThreadLocalUtilsTest {

    @Before
    public void init() {
        User user = new User();
        user.setName("毅飞");
        user.setAge(28);
        ThreadLocalUtils.setThreadLocalUser(user);

        User inheritableUser = new User();
        inheritableUser.setName("毅飞666");
        inheritableUser.setAge(28);
        ThreadLocalUtils.setInheritableThreadLocalUser(inheritableUser);
    }

    @After
    public void destroy() {
        // 释放线程变量内存，防止内存溢出
        ThreadLocalUtils.removeThreadLocalUser();
        ThreadLocalUtils.removeInheritableThreadLocalUser();
    }

    @Test
    public void threadLocalTest() {
        log.info("ThreadLocal user：【{}】", ThreadLocalUtils.getThreadLocalUser());
        log.info("InheritableThreadLocal user：【{}】", ThreadLocalUtils.getInheritableThreadLocalUser());

        new Thread(() -> {
            log.info("子线程-ThreadLocal user：【{}】", ThreadLocalUtils.getThreadLocalUser());
            log.info("子线程-InheritableThreadLocal user：【{}】", ThreadLocalUtils.getInheritableThreadLocalUser());
        }).start();
    }

}

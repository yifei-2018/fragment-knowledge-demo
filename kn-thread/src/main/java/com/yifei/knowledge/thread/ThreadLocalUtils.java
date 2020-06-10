package com.yifei.knowledge.thread;

import com.yifei.knowledge.thread.model.User;
import lombok.extern.slf4j.Slf4j;

/**
 * @author luqs
 * @version v1.0
 * @date 2020/6/10 15:07
 */
@Slf4j
public class ThreadLocalUtils {
    /**
     * ThreadLocal 不支持子线程继承
     */
    private static final ThreadLocal<User> USER_THREAD_LOCAL = new ThreadLocal<>();
    /**
     * InheritableThreadLocal 支持子线程继承
     */
    private static final ThreadLocal<User> USER_INHERITABLE_THREAD_LOCAL = new InheritableThreadLocal<>();

    public static void setThreadLocalUser(User user) {
        USER_THREAD_LOCAL.set(user);
    }

    public static User getThreadLocalUser() {
        return USER_THREAD_LOCAL.get();
    }

    public static void removeThreadLocalUser() {
        USER_THREAD_LOCAL.remove();
    }

    public static void setInheritableThreadLocalUser(User user) {
        USER_INHERITABLE_THREAD_LOCAL.set(user);
    }

    public static User getInheritableThreadLocalUser() {
        return USER_INHERITABLE_THREAD_LOCAL.get();
    }

    public static void removeInheritableThreadLocalUser() {
        USER_INHERITABLE_THREAD_LOCAL.remove();
    }
}

# ThreadLocal
&emsp;&emsp;多线程访问同一个共享变量的时候容易出现并发问题，特别是多个线程对一个变量进行写入的时候，为了保证线程安全，一般使用者在访问共享变量的时候需要进行额外的同步措施才能保证线程安全性。ThreadLocal是除了加锁这种同步方式之外的一种规避多线程访问出现线程不安全的方法，当我们在创建一个变量后，如果每个线程对其进行访问的时候访问的都是线程自己的变量这样就不会存在线程不安全问题。  
&emsp;&emsp;ThreadLocal是JDK包提供的，它提供线程本地变量，如果创建一乐ThreadLocal变量，那么访问这个变量的每个线程都会有这个变量的一个副本，在实际多线程操作的时候，操作的是自己本地内存中的变量，从而规避了线程安全问题。  

#### 拓展1：Map扩容
* [HashMap扩容机制、线程安全](https://blog.csdn.net/u010558660/article/details/50926227)
* [HashMap扩容全过程](https://www.cnblogs.com/zhuoqingsen/p/8577646.html)

##### 参考
[1].[Java中的ThreadLocal详解](https://www.cnblogs.com/fsmly/p/11020641.html)  
[2].[Java ThreadLocal](https://www.jianshu.com/p/e200e96a41a0)  
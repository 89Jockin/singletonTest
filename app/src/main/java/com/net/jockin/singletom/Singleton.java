package com.net.jockin.singletom;

/**
 * Created by jockin on 2017/12/4.
 * 单例模式
 */

public class Singleton {
    /**
     * 私有化构造函数
     */
    private Singleton() {
    }

    /**
     * 使用volatie 修饰符，防止指令重排引起的初始化问题
     */
    private volatile static Singleton instance = null;

    /**
     * 双重检验
     *
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

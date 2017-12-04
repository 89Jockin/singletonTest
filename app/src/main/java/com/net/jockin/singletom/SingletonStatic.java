package com.net.jockin.singletom;

/**
 * Created by jockin on 2017/12/4.
 * 使用静态内部类实现单例模式
 * 外部无法访问静态内部类，只能调用SingletonStatic.getInstance
 * 利用classloader 的加载机制来实现懒加载，并保证构建单例的线程安全
 */

public class SingletonStatic {
    private static class LazyHolder {
        private static final SingletonStatic INSTANCE = new SingletonStatic();
    }

    private SingletonStatic() {
    }

    public static SingletonStatic getInstance() {
        return LazyHolder.INSTANCE;
    }
}

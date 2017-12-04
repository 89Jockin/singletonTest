package com.net.jockin.singletom;

/**
 * Created by jockin on 2017/12/4.
 * 用枚举结合内部类实现单例模式；
 * JVM会保证enum不能被反射并且构造器方法只执行一次,因此该单例是线程安全的。
 */

public class SingletonEnum {
    private enum MySingletonEnum {
        INSTANCE;
        private SingletonEnum singletonEnum;

        private MySingletonEnum() {
            singletonEnum = new SingletonEnum();
        }

        public SingletonEnum getInstance() {
            return singletonEnum;
        }
    }

    public static SingletonEnum getInstance() {
        return MySingletonEnum.INSTANCE.getInstance();
    }

}

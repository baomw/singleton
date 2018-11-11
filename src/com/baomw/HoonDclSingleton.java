package com.baomw;

/**
 * 描述:
 * 单例模式-懒汉模式（DCL双重检查）
 *
 * @author baomw
 * @create 2018-09-18 下午 10:38
 */
public class HoonDclSingleton {

    //使用volatitle，避免代码的重排序导致的线程安全问题
    private volatile static HoonDclSingleton instance;

    private HoonDclSingleton(){

    }

    /**
     * 双重检查锁，解决现场不安全问题
     * @return
     */
    public static HoonDclSingleton getInstance(){
        if (instance == null)
            synchronized (HoonDclSingleton.class){
                if (instance == null)
                    instance = new HoonDclSingleton();
            }
         return instance;
    }
}

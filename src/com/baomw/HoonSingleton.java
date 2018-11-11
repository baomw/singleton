package com.baomw;

/**
 * 描述:
 * 单例模式-懒汉模式（懒加载）
 *
 * @author baomw
 * @create 2018-09-18 下午 10:33
 */
public class HoonSingleton {
    private static HoonSingleton instance = null;

    private HoonSingleton(){

    }

    public static HoonSingleton getInstance(){
        if (instance == null)
            instance = new HoonSingleton();
        return instance;
    }
}

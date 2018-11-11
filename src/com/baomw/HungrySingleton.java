package com.baomw;

/**
 * 描述:
 * 单例模式-恶汉模式
 *
 * @author baomw
 * @create 2018-09-18 下午 10:30
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return instance;
    }
}

package com.baomw;

/**
 * 描述:
 * 单例模式-Holder模式
 *
 * @author baomw
 * @create 2018-09-18 下午 10:45
 */
public class HolderSingleton {

    private HolderSingleton(){

    }

    /**
     * 使用内部类保证延迟加载，同时保证了线程安全问题
     */
    private static class Holder{
        private static HolderSingleton instance = new HolderSingleton();
    }

    public static HolderSingleton getInstance(){
        return Holder.instance;
    }
}

package com.baomw;

/**
 * 描述:
 * 单例模式-懒汉模式（synchronized）
 *
 * @author baomw
 * @create 2018-09-18 下午 10:35
 */
public class HoonSyncSingleton {
    private static HoonSyncSingleton instance = null;

    private HoonSyncSingleton(){

    }

    /**
     * 并行改串行了，效率低
     * @return
     */
    public synchronized HoonSyncSingleton getInstance(){
        if (instance == null)
            instance = new HoonSyncSingleton();
            return instance;
    }
}

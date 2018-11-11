package com.baomw;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import sun.security.jca.GetInstance;

/**
 * 描述:
 * 单例模式-枚举模式
 *
 * @author baomw
 * @create 2018-09-18 下午 10:51
 */
public class EnumSinglton {

    private EnumSinglton(){

    }

    private enum Enum{
        INSTANCE;
        private EnumSinglton instance = null;
        Enum(){
            instance = new EnumSinglton();
        }
        private EnumSinglton getInstance(){
            return instance;
        }
    }

    public static EnumSinglton getInstance(){
        return Enum.INSTANCE.getInstance();
    }
}

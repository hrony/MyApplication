package com.example.administrator.myapplication.design.pattern;

/**
 * Created by Administrator on 2017/6/2.
 */

public class Singleton
{
    private static Singleton instance;
    //私有化
    private Singleton(){}

    public static synchronized Singleton getInstance()
    {
        if (instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }

    public static Singleton getInstance2()
    {
        if (instance == null)
        {
            synchronized (Singleton.class)
            {
                instance = new Singleton();
            }
        }
        return instance;
    }

    public static Singleton getInstance3()
    {
        return SingletonHolder.sInstance;
    }

    private static class SingletonHolder{
        private static final Singleton sInstance = new Singleton();
    }


}

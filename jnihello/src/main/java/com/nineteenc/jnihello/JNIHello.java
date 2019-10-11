package com.nineteenc.jnihello;

/**
 * Author    zhengchengbin
 * Describe:
 * Data:      2019/10/11 14:10
 * Modify by:
 * Modification date:
 * Modify content:
 */
public class JNIHello {

    static {
        try {
            System.loadLibrary("hellojni");
        } catch (Exception e) {
        }
    }

    private volatile static JNIHello mInstance;

    private JNIHello() {}

    public static JNIHello getInstance() {
        if (mInstance == null) {
            synchronized (JNIHello.class) {
                if (mInstance == null) {
                    mInstance = new JNIHello();
                }
            }
        }
        return mInstance;
    }

    public native String nativeGetString();
}

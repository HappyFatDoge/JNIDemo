//
// Created by Administrator on 2019/10/11.
//
#include <jni.h>

JNIEXPORT jstring JNICALL Java_com_nineteenc_jnihello_JNIHello_nativeGetString
        (JNIEnv *env, jobject obj) {
    return (*env) -> NewStringUTF(env, "ndk hello");
}
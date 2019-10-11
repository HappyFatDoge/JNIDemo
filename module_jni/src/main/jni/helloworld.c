//
// Created by Administrator on 2019/10/11.
//

#include "HelloWorld.h"

JNIEXPORT jstring JNICALL Java_HelloWorld_nativeGetString
  (JNIEnv *env, jobject obj) {
    return (*env) -> NewStringUTF(env, "ndk hello");
}
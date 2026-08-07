package com.facebook.react.bridge;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
@in.a
public class ReactCxxErrorHandler {
    private static Method mHandleErrorFunc;
    private static Object mObject;

    @in.a
    private static void handleError(String str) {
        if (mHandleErrorFunc != null) {
            try {
                mHandleErrorFunc.invoke(mObject, new Exception(str));
            } catch (Exception e11) {
                qk.a.n("ReactCxxErrorHandler", "Failed to invoke error handler function", e11);
            }
        }
    }

    @in.a
    public static void setHandleErrorFunc(Object obj, Method method) {
        mObject = obj;
        mHandleErrorFunc = method;
    }
}

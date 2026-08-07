package net.time4j.android.spi;

import android.os.SystemClock;
import fp0.e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.time4j.base.c;

/* JADX INFO: loaded from: classes9.dex */
class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class[] f93947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object[] f93948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Method f93949c;

    static {
        Class[] clsArr = new Class[0];
        f93947a = clsArr;
        Object[] objArr = new Object[0];
        f93948b = objArr;
        Method method = null;
        try {
            Method method2 = SystemClock.class.getMethod("elapsedRealtimeNanos", clsArr);
            method2.invoke(null, objArr);
            method = method2;
        } catch (IllegalAccessException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
        }
        f93949c = method;
    }

    a() {
    }

    @Override // fp0.e
    public String a() {
        return "Dalvik";
    }

    @Override // fp0.e
    public long getNanos() {
        Method method = f93949c;
        if (method != null) {
            try {
                return ((Long) method.invoke(null, f93948b)).longValue();
            } catch (IllegalAccessException e11) {
                e11.printStackTrace(System.err);
            } catch (InvocationTargetException e12) {
                e12.printStackTrace(System.err);
            }
        }
        return c.i(SystemClock.elapsedRealtime(), 1000000L);
    }
}

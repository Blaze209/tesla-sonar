package com.learnium.RNDeviceInfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Class<?> f45649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Class<?> f45650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Class<?> f45651f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f45652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f45653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f45654c;

    private class a implements InvocationHandler {
        public void a() {
            Log.d("RNInstallReferrerClient", "InstallReferrerService disconnected");
        }

        public void b(int i11) {
            if (i11 != 0) {
                if (i11 == 1) {
                    Log.d("InstallReferrerState", "SERVICE_UNAVAILABLE");
                    return;
                } else {
                    if (i11 != 2) {
                        return;
                    }
                    Log.d("InstallReferrerState", "FEATURE_NOT_SUPPORTED");
                    return;
                }
            }
            try {
                Log.d("InstallReferrerState", "OK");
                String str = (String) c.f45651f.getMethod("getInstallReferrer", null).invoke(c.f45649d.getMethod("getInstallReferrer", null).invoke(c.this.f45653b, null), null);
                SharedPreferences.Editor editorEdit = c.this.f45652a.edit();
                editorEdit.putString("installReferrer", str);
                editorEdit.apply();
                c.f45649d.getMethod("endConnection", null).invoke(c.this.f45653b, null);
            } catch (Exception e11) {
                System.err.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e11.getMessage());
                e11.printStackTrace(System.err);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            try {
                if (name.equals("onInstallReferrerSetupFinished") && objArr != null) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof Integer) {
                        b(((Integer) obj2).intValue());
                        return null;
                    }
                }
                if (!name.equals("onInstallReferrerServiceDisconnected")) {
                    return null;
                }
                a();
                return null;
            } catch (Exception e11) {
                throw new RuntimeException("unexpected invocation exception: " + e11.getMessage());
            }
        }

        private a() {
        }
    }

    static {
        try {
            f45649d = fi.a.class;
            f45650e = fi.c.class;
            f45651f = fi.d.class;
        } catch (Exception unused) {
            System.err.println("RNInstallReferrerClient exception. 'installreferrer' APIs are unavailable.");
        }
    }

    c(Context context) {
        this.f45652a = context.getSharedPreferences("react-native-device-info", 0);
        Class<?> cls = f45649d;
        if (cls == null || f45650e == null || f45651f == null) {
            return;
        }
        try {
            Object objInvoke = cls.getMethod("newBuilder", Context.class).invoke(null, context);
            this.f45653b = objInvoke.getClass().getMethod("build", null).invoke(objInvoke, null);
            this.f45654c = Proxy.newProxyInstance(f45650e.getClassLoader(), new Class[]{f45650e}, new a());
            f45649d.getMethod("startConnection", f45650e).invoke(this.f45653b, this.f45654c);
        } catch (Exception e11) {
            System.err.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e11.getMessage());
            e11.printStackTrace(System.err);
        }
    }
}

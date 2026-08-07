package com.alipay.android.phone.mrpc.core;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.ResetCookie;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<Object> f19974a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<Map<String, Object>> f19975b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte f19976c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AtomicInteger f19977d = new AtomicInteger();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private y f19978e;

    public aa(y yVar) {
        this.f19978e = yVar;
    }

    public com.alipay.android.phone.mrpc.core.a.c a(Type type, byte[] bArr) {
        return new com.alipay.android.phone.mrpc.core.a.d(type, bArr);
    }

    public com.alipay.android.phone.mrpc.core.a.f a(int i11, String str, Object[] objArr) {
        return new com.alipay.android.phone.mrpc.core.a.e(i11, str, objArr);
    }

    public w a(Method method, int i11, String str, byte[] bArr, boolean z11) {
        return new j(this.f19978e.a(), method, i11, str, bArr, z11);
    }

    public Object a(Object obj, Class<?> cls, Method method, Object[] objArr) {
        String str;
        Object[] objArr2;
        Method method2;
        Class<?> cls2;
        byte[] bArr;
        Object obj2;
        aa aaVar;
        if (ac.a()) {
            throw new IllegalThreadStateException("can't in main thread call rpc .");
        }
        OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
        boolean z11 = method.getAnnotation(ResetCookie.class) != null;
        Type genericReturnType = method.getGenericReturnType();
        Annotation[] annotations = method.getAnnotations();
        ThreadLocal<Object> threadLocal = f19974a;
        byte[] bArrA = null;
        threadLocal.set(null);
        f19975b.set(null);
        if (operationType == null) {
            throw new IllegalStateException("OperationType must be set.");
        }
        String strValue = operationType.value();
        int iIncrementAndGet = this.f19977d.incrementAndGet();
        a(obj, cls, method, objArr, annotations);
        try {
            if (this.f19976c == 0) {
                str = strValue;
                try {
                    bArrA = a(method, objArr, str, iIncrementAndGet, z11);
                    Object objA = a(genericReturnType, bArrA).a();
                    if (genericReturnType != Void.TYPE) {
                        threadLocal.set(objA);
                    }
                } catch (RpcException e11) {
                    e = e11;
                    RpcException rpcException = e;
                    bArr = bArrA;
                    rpcException.setOperationType(str);
                    aaVar = this;
                    obj2 = obj;
                    cls2 = cls;
                    method2 = method;
                    objArr2 = objArr;
                    aaVar.a(obj2, bArr, cls2, method2, objArr2, annotations, rpcException);
                }
            }
            aaVar = this;
            obj2 = obj;
            cls2 = cls;
            method2 = method;
            objArr2 = objArr;
            bArr = bArrA;
        } catch (RpcException e12) {
            e = e12;
            str = strValue;
        }
        aaVar.a(obj2, bArr, cls2, method2, objArr2, annotations);
        return f19974a.get();
    }

    private void a(Object obj, Class<?> cls, Method method, Object[] objArr, Annotation[] annotationArr) {
    }

    private void a(Object obj, byte[] bArr, Class<?> cls, Method method, Object[] objArr, Annotation[] annotationArr) {
    }

    private void a(Object obj, byte[] bArr, Class<?> cls, Method method, Object[] objArr, Annotation[] annotationArr, RpcException rpcException) {
        throw rpcException;
    }

    private byte[] a(Method method, Object[] objArr, String str, int i11, boolean z11) {
        com.alipay.android.phone.mrpc.core.a.f fVarA = a(i11, str, objArr);
        ThreadLocal<Map<String, Object>> threadLocal = f19975b;
        if (threadLocal.get() != null) {
            fVarA.a(threadLocal.get());
        }
        byte[] bArr = (byte[]) a(method, i11, str, fVarA.a(), z11).a();
        threadLocal.set(null);
        return bArr;
    }
}

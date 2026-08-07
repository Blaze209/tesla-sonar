package com.facebook.react.views.view;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0003R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/views/view/a;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "", "enable", "Ljn0/h0;", "a", "(Landroid/graphics/Canvas;Z)V", "b", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "reorderBarrierMethod", "c", "inorderBarrierMethod", DateTokenConverter.CONVERTER_KEY, "Z", "orderMethodsFetched", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f23860a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static Method reorderBarrierMethod;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static Method inorderBarrierMethod;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static boolean orderMethodsFetched;

    private a() {
    }

    @SuppressLint({"SoonBlockedPrivateApi", "PrivateApi"})
    public static final void a(Canvas canvas, boolean enable) {
        Method method;
        s.k(canvas, "canvas");
        if (Build.VERSION.SDK_INT >= 29) {
            if (enable) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        f23860a.b();
        if (enable) {
            try {
                Method method2 = reorderBarrierMethod;
                if (method2 != null) {
                    if (method2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    method2.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return;
            }
        }
        if (enable || (method = inorderBarrierMethod) == null) {
            return;
        }
        if (method == null) {
            throw new IllegalStateException("Required value was null.");
        }
        method.invoke(canvas, null);
    }

    private final void b() {
        if (orderMethodsFetched) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT == 28) {
                Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Object[].class);
                Object objInvoke = declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                s.i(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
                reorderBarrierMethod = (Method) objInvoke;
                Object objInvoke2 = declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                s.i(objInvoke2, "null cannot be cast to non-null type java.lang.reflect.Method");
                inorderBarrierMethod = (Method) objInvoke2;
            } else {
                reorderBarrierMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                inorderBarrierMethod = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
            }
            Method method = reorderBarrierMethod;
            if (method != null && inorderBarrierMethod != null) {
                if (method != null) {
                    method.setAccessible(true);
                }
                Method method2 = inorderBarrierMethod;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                orderMethodsFetched = true;
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}

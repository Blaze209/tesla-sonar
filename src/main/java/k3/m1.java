package k3;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lk3/m1;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "", "enable", "Ljn0/h0;", "a", "(Landroid/graphics/Canvas;Z)V", "Ljava/lang/reflect/Method;", "b", "Ljava/lang/reflect/Method;", "reorderBarrierMethod", "c", "inorderBarrierMethod", DateTokenConverter.CONVERTER_KEY, "Z", "orderMethodsFetched", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m1 f84825a = new m1();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static Method reorderBarrierMethod;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static Method inorderBarrierMethod;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static boolean orderMethodsFetched;

    private m1() {
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public final void a(Canvas canvas, boolean enable) {
        Method method;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            n1.f84834a.a(canvas, enable);
            return;
        }
        if (!orderMethodsFetched) {
            try {
                if (i11 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    reorderBarrierMethod = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    inorderBarrierMethod = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    reorderBarrierMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    inorderBarrierMethod = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = reorderBarrierMethod;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = inorderBarrierMethod;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            orderMethodsFetched = true;
        }
        if (enable) {
            try {
                Method method4 = reorderBarrierMethod;
                if (method4 != null) {
                    p013kotlin.jvm.internal.s.h(method4);
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (enable || (method = inorderBarrierMethod) == null) {
            return;
        }
        p013kotlin.jvm.internal.s.h(method);
        method.invoke(canvas, null);
    }
}

package com.fourthline.orca.internal;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public abstract class U3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f27994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f27995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Method f27996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Method f27997d;

    static {
        try {
            f27994a = ((Integer) Canvas.class.getField("MATRIX_SAVE_FLAG").get(null)).intValue();
            f27995b = ((Integer) Canvas.class.getField("ALL_SAVE_FLAG").get(null)).intValue();
            Class cls = Integer.TYPE;
            f27996c = Canvas.class.getMethod("save", cls);
            f27997d = Canvas.class.getMethod("saveLayer", RectF.class, Paint.class, cls);
        } catch (Throwable th2) {
            throw a(th2);
        }
    }

    public static void a(Canvas canvas, int i11) {
        try {
            f27996c.invoke(canvas, Integer.valueOf(i11));
        } catch (Throwable th2) {
            throw a(th2);
        }
    }

    private static RuntimeException a(Throwable th2) {
        if (th2 != null) {
            return (RuntimeException) b(th2);
        }
        throw new NullPointerException("t");
    }

    public static void a(Canvas canvas, RectF rectF, Paint paint, int i11) {
        try {
            f27997d.invoke(canvas, rectF, paint, Integer.valueOf(i11));
        } catch (Throwable th2) {
            throw a(th2);
        }
    }

    private static Throwable b(Throwable th2) throws Throwable {
        throw th2;
    }
}

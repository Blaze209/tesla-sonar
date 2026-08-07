package io.sentry.android.replay;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.lang.reflect.Field;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR!\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lio/sentry/android/replay/x;", "", "<init>", "()V", "Landroid/view/View;", "maybeDecorView", "Landroid/view/Window;", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/View;)Landroid/view/Window;", "Ljava/lang/Class;", "b", "Lkotlin/Lazy;", "()Ljava/lang/Class;", "decorViewClass", "Ljava/lang/reflect/Field;", "c", "()Ljava/lang/reflect/Field;", "windowField", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"PrivateApi"})
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f80267a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Lazy decorViewClass;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Lazy windowField;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f80270d;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/lang/Class;", "b", "()Ljava/lang/Class;"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<Class<?>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f80271c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Class<?> invoke() {
            try {
                return Class.forName("com.android.internal.policy.DecorView");
            } catch (Throwable th2) {
                Log.d("WindowSpy", "Unexpected exception loading DecorView on API " + Build.VERSION.SDK_INT, th2);
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/lang/reflect/Field;", "b", "()Ljava/lang/reflect/Field;"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<Field> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f80272c = new b();

        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Field invoke() {
            Class clsB = x.f80267a.b();
            if (clsB == null) {
                return null;
            }
            try {
                Field declaredField = clsB.getDeclaredField("mWindow");
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException e11) {
                Log.d("WindowSpy", "Unexpected exception retrieving " + clsB + "#mWindow on API " + Build.VERSION.SDK_INT, e11);
                return null;
            }
        }
    }

    static {
        jn0.p pVar = jn0.p.NONE;
        decorViewClass = jn0.m.a(pVar, a.f80271c);
        windowField = jn0.m.a(pVar, b.f80272c);
        f80270d = 8;
    }

    private x() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> b() {
        return (Class) decorViewClass.getValue();
    }

    private final Field c() {
        return (Field) windowField.getValue();
    }

    public final Window d(View maybeDecorView) throws IllegalAccessException {
        Field fieldC;
        p013kotlin.jvm.internal.s.k(maybeDecorView, "maybeDecorView");
        Class<?> clsB = b();
        if (clsB == null || !clsB.isInstance(maybeDecorView) || (fieldC = f80267a.c()) == null) {
            return null;
        }
        Object obj = fieldC.get(maybeDecorView);
        p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type android.view.Window");
        return (Window) obj;
    }
}

package io.sentry.android.replay;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\n\u001a\u00020\t22\u0010\b\u001a.\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bR!\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\r\u0010\u0016¨\u0006\u0018"}, d2 = {"Lio/sentry/android/replay/v;", "", "<init>", "()V", "Lkotlin/Function1;", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "swap", "Ljn0/h0;", "e", "(Lwn0/l;)V", "Ljava/lang/Class;", "b", "Lkotlin/Lazy;", "c", "()Ljava/lang/Class;", "windowManagerClass", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Object;", "windowManagerInstance", "Ljava/lang/reflect/Field;", "()Ljava/lang/reflect/Field;", "mViewsField", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f80190a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Lazy windowManagerClass;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Lazy windowManagerInstance;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final Lazy mViewsField;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f80194e;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/lang/reflect/Field;", "b", "()Ljava/lang/reflect/Field;"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<Field> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f80195c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Field invoke() throws NoSuchFieldException {
            Class clsC = v.f80190a.c();
            if (clsC == null) {
                return null;
            }
            Field declaredField = clsC.getDeclaredField("mViews");
            declaredField.setAccessible(true);
            return declaredField;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/lang/Class;", "b", "()Ljava/lang/Class;"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<Class<?>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f80196c = new b();

        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Class<?> invoke() {
            try {
                return Class.forName("android.view.WindowManagerGlobal");
            } catch (Throwable th2) {
                Log.w("WindowManagerSpy", th2);
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends p013kotlin.jvm.internal.u implements wn0.a<Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f80197c = new c();

        c() {
            super(0);
        }

        @Override // wn0.a
        public final Object invoke() {
            Method method;
            Class clsC = v.f80190a.c();
            if (clsC == null || (method = clsC.getMethod("getInstance", null)) == null) {
                return null;
            }
            return method.invoke(null, null);
        }
    }

    static {
        jn0.p pVar = jn0.p.NONE;
        windowManagerClass = jn0.m.a(pVar, b.f80196c);
        windowManagerInstance = jn0.m.a(pVar, c.f80197c);
        mViewsField = jn0.m.a(pVar, a.f80195c);
        f80194e = 8;
    }

    private v() {
    }

    private final Field b() {
        return (Field) mViewsField.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> c() {
        return (Class) windowManagerClass.getValue();
    }

    private final Object d() {
        return windowManagerInstance.getValue();
    }

    @SuppressLint({"PrivateApi", "ObsoleteSdkInt", "DiscouragedPrivateApi"})
    public final void e(wn0.l<? super ArrayList<View>, ? extends ArrayList<View>> swap) {
        Field fieldB;
        p013kotlin.jvm.internal.s.k(swap, "swap");
        try {
            Object objD = d();
            if (objD == null || (fieldB = f80190a.b()) == null) {
                return;
            }
            Object obj = fieldB.get(objD);
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type java.util.ArrayList<android.view.View>{ kotlin.collections.TypeAliasesKt.ArrayList<android.view.View> }");
            fieldB.set(objD, swap.invoke((ArrayList) obj));
        } catch (Throwable th2) {
            Log.w("WindowManagerSpy", th2);
        }
    }
}

package k7;

import androidx.p003lifecycle.LifecycleOwner;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import jn0.e;
import jn0.s;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.g2;
import p020r2.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\"#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\b"}, d2 = {"Lr2/g2;", "Landroidx/lifecycle/LifecycleOwner;", "a", "Lr2/g2;", "()Lr2/g2;", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "lifecycle-runtime-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g2<LifecycleOwner> f85176a;

    /* JADX INFO: renamed from: k7.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/LifecycleOwner;", "b", "()Landroidx/lifecycle/LifecycleOwner;"}, k = 3, mv = {1, 8, 0})
    static final class C1807a extends u implements wn0.a<LifecycleOwner> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1807a f85177c = new C1807a();

        C1807a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LifecycleOwner invoke() {
            throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
        }
    }

    static {
        Object objB;
        g2 g2Var;
        try {
            s.Companion companion = s.INSTANCE;
            ClassLoader classLoader = LifecycleOwner.class.getClassLoader();
            p013kotlin.jvm.internal.s.h(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof g2) {
                        g2Var = (g2) objInvoke;
                        break;
                    }
                } else if (!(annotations[i11] instanceof e)) {
                    i11++;
                }
                g2Var = null;
                break;
            }
            objB = s.b(g2Var);
        } catch (Throwable th2) {
            s.Companion companion2 = s.INSTANCE;
            objB = s.b(t.a(th2));
        }
        g2<LifecycleOwner> g2VarF = (g2) (s.g(objB) ? null : objB);
        if (g2VarF == null) {
            g2VarF = w.f(C1807a.f85177c);
        }
        f85176a = g2VarF;
    }

    public static final g2<LifecycleOwner> a() {
        return f85176a;
    }
}

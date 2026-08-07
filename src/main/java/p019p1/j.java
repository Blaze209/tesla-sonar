package p019p1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u001a;\u0010\u0005\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a5\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0019\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a@\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#\"\u0004\b\u0000\u0010\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a%\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b'\u0010(\u001a1\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000)\"\u0004\b\u0000\u0010\u00002\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"T", "Lp1/q;", "V", "Lp1/p1;", "data", "b", "(Lp1/p1;Ljava/lang/Object;)Lp1/q;", "", "durationMillis", "delayMillis", "Lp1/d0;", "easing", "Lp1/o1;", "k", "(IILp1/d0;)Lp1/o1;", "", "dampingRatio", "stiffness", "visibilityThreshold", "Lp1/e1;", IntegerTokenConverter.CONVERTER_KEY, "(FFLjava/lang/Object;)Lp1/e1;", "Lkotlin/Function1;", "Lp1/r0$b;", "Ljn0/h0;", "init", "Lp1/r0;", "f", "(Lwn0/l;)Lp1/r0;", "Lp1/c0;", "animation", "Lp1/y0;", "repeatMode", "Lp1/h1;", "initialStartOffset", "Lp1/m0;", DateTokenConverter.CONVERTER_KEY, "(Lp1/c0;Lp1/y0;J)Lp1/m0;", "Lp1/a1;", "g", "(I)Lp1/a1;", "Lp1/i;", "animationSpec", "", "startDelayNanos", "c", "(Lp1/i;J)Lp1/i;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends q> V b(p1<T, V> p1Var, T t11) {
        if (t11 == null) {
            return null;
        }
        return p1Var.a().invoke(t11);
    }

    public static final <T> i<T> c(i<T> iVar, long j11) {
        return new f1(iVar, j11);
    }

    public static final <T> m0<T> d(c0<T> c0Var, y0 y0Var, long j11) {
        return new m0<>(c0Var, y0Var, j11, null);
    }

    public static /* synthetic */ m0 e(c0 c0Var, y0 y0Var, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            y0Var = y0.Restart;
        }
        if ((i11 & 4) != 0) {
            j11 = h1.c(0, 0, 2, null);
        }
        return d(c0Var, y0Var, j11);
    }

    public static final <T> r0<T> f(l<? super r0.b<T>, h0> lVar) {
        r0.b bVar = new r0.b();
        lVar.invoke(bVar);
        return new r0<>(bVar);
    }

    public static final <T> a1<T> g(int i11) {
        return new a1<>(i11);
    }

    public static /* synthetic */ a1 h(int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return g(i11);
    }

    public static final <T> e1<T> i(float f11, float f12, T t11) {
        return new e1<>(f11, f12, t11);
    }

    public static /* synthetic */ e1 j(float f11, float f12, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 1500.0f;
        }
        if ((i11 & 4) != 0) {
            obj = null;
        }
        return i(f11, f12, obj);
    }

    public static final <T> o1<T> k(int i11, int i12, d0 d0Var) {
        return new o1<>(i11, i12, d0Var);
    }

    public static /* synthetic */ o1 l(int i11, int i12, d0 d0Var, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 300;
        }
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        if ((i13 & 4) != 0) {
            d0Var = f0.c();
        }
        return k(i11, i12, d0Var);
    }
}

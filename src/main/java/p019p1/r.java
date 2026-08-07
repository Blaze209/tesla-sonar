package p019p1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u0011*\u00028\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u0011*\u00028\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u0017\"\b\b\u0000\u0010\u0012*\u00020\u0011*\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"", "v1", "Lp1/m;", "a", "(F)Lp1/m;", "v2", "Lp1/n;", "b", "(FF)Lp1/n;", "v3", "Lp1/o;", "c", "(FFF)Lp1/o;", "v4", "Lp1/p;", DateTokenConverter.CONVERTER_KEY, "(FFFF)Lp1/p;", "Lp1/q;", "T", "g", "(Lp1/q;)Lp1/q;", "e", "source", "Ljn0/h0;", "f", "(Lp1/q;Lp1/q;)V", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class r {
    public static final m a(float f11) {
        return new m(f11);
    }

    public static final n b(float f11, float f12) {
        return new n(f11, f12);
    }

    public static final o c(float f11, float f12, float f13) {
        return new o(f11, f12, f13);
    }

    public static final p d(float f11, float f12, float f13, float f14) {
        return new p(f11, f12, f13, f14);
    }

    public static final <T extends q> T e(T t11) {
        T t12 = (T) g(t11);
        int size = t12.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            t12.e(i11, t11.a(i11));
        }
        return t12;
    }

    public static final <T extends q> void f(T t11, T t12) {
        int size = t11.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            t11.e(i11, t12.a(i11));
        }
    }

    public static final <T extends q> T g(T t11) {
        T t12 = (T) t11.c();
        s.i(t12, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return t12;
    }
}

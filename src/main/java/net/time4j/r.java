package net.time4j;

import net.time4j.engine.q;

/* JADX INFO: loaded from: classes9.dex */
final class r<T extends net.time4j.engine.q<T>> implements net.time4j.engine.u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f94716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f94717b;

    r(char c11, boolean z11) {
        this.f94716a = c11;
        this.f94717b = z11;
    }

    @Override // net.time4j.engine.u
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public T apply(T t11) {
        if (this.f94716a == '9') {
            return t11;
        }
        k0<Integer, h0> k0Var = h0.C;
        int iIntValue = ((Integer) t11.s(k0Var)).intValue();
        int iIntValue2 = ((Integer) t11.o(k0Var)).intValue();
        char c11 = this.f94716a;
        if (c11 == '3') {
            return (T) t11.z(k0Var, Math.min(iIntValue2, ((iIntValue / 1000000) * 1000000) + (this.f94717b ? 999999 : 0)));
        }
        if (c11 == '6') {
            return (T) t11.z(k0Var, Math.min(iIntValue2, ((iIntValue / 1000) * 1000) + (this.f94717b ? 999 : 0)));
        }
        throw new UnsupportedOperationException("Unknown: " + this.f94716a);
    }
}

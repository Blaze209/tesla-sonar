package p013kotlin.jvm.internal;

import co0.c;
import co0.p;

/* JADX INFO: loaded from: classes9.dex */
public abstract class g0 extends i0 implements p {
    public g0() {
    }

    @Override // p013kotlin.jvm.internal.f
    protected c computeReflected() {
        return o0.l(this);
    }

    @Override // wn0.p
    public Object invoke(Object obj, Object obj2) {
        return n(obj, obj2);
    }

    public g0(Class cls, String str, String str2, int i11) {
        super(f.NO_RECEIVER, cls, str, str2, i11);
    }

    @Override // co0.m
    public p.a getGetter() {
        return ((p) getReflected()).getGetter();
    }
}

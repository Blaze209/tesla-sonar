package p013kotlin.jvm.internal;

import co0.c;
import co0.o;

/* JADX INFO: loaded from: classes9.dex */
public abstract class e0 extends i0 implements o {
    public e0() {
    }

    @Override // p013kotlin.jvm.internal.f
    protected c computeReflected() {
        return o0.k(this);
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    public e0(Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, i11);
    }

    @Override // co0.m
    public o.a getGetter() {
        return ((o) getReflected()).getGetter();
    }
}

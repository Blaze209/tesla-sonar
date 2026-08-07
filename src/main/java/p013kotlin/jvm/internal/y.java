package p013kotlin.jvm.internal;

import co0.c;
import co0.k;
import co0.o;

/* JADX INFO: loaded from: classes9.dex */
public abstract class y extends a0 implements k {
    public y() {
    }

    @Override // p013kotlin.jvm.internal.f
    protected c computeReflected() {
        return o0.f(this);
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    public y(Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, i11);
    }

    @Override // co0.m
    public o.a getGetter() {
        return ((k) getReflected()).getGetter();
    }

    @Override // co0.i
    public k.a getSetter() {
        return ((k) getReflected()).getSetter();
    }
}

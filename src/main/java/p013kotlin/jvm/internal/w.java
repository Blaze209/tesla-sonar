package p013kotlin.jvm.internal;

import co0.c;
import co0.j;
import co0.n;

/* JADX INFO: loaded from: classes9.dex */
public abstract class w extends a0 implements j {
    public w() {
    }

    @Override // p013kotlin.jvm.internal.f
    protected c computeReflected() {
        return o0.e(this);
    }

    @Override // co0.n
    public Object getDelegate() {
        return ((j) getReflected()).getDelegate();
    }

    @Override // wn0.a
    public Object invoke() {
        return get();
    }

    public w(Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, i11);
    }

    @Override // co0.m
    public n.a getGetter() {
        return ((j) getReflected()).getGetter();
    }

    @Override // co0.i
    public j.a getSetter() {
        return ((j) getReflected()).getSetter();
    }
}

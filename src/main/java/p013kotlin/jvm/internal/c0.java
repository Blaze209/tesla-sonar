package p013kotlin.jvm.internal;

import co0.c;
import co0.n;

/* JADX INFO: loaded from: classes9.dex */
public abstract class c0 extends i0 implements n {
    public c0() {
    }

    @Override // p013kotlin.jvm.internal.f
    protected c computeReflected() {
        return o0.j(this);
    }

    @Override // co0.n
    public Object getDelegate() {
        return ((n) getReflected()).getDelegate();
    }

    @Override // wn0.a
    public Object invoke() {
        return get();
    }

    public c0(Object obj) {
        super(obj);
    }

    @Override // co0.m
    public n.a getGetter() {
        return ((n) getReflected()).getGetter();
    }

    public c0(Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, i11);
    }
}

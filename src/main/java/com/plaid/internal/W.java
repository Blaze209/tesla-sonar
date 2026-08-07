package com.plaid.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E5 f46781a;

    public W(E5 plaidRetrofitFactory) {
        p013kotlin.jvm.internal.s.k(plaidRetrofitFactory, "plaidRetrofitFactory");
        this.f46781a = plaidRetrofitFactory;
    }

    public final S6 a(String str) {
        if (p013kotlin.jvm.internal.s.f(str, S6.class.getSimpleName())) {
            return new S6(this.f46781a);
        }
        throw new IllegalArgumentException("Unknown crash api class: " + str);
    }
}

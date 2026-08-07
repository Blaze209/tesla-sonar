package com.google.firebase.sessions;

import vw.w0;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements xw.b<w0> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final f f44813a = new f();
    }

    public static f a() {
        return a.f44813a;
    }

    public static w0 c() {
        return (w0) xw.d.d(b.InterfaceC0699b.INSTANCE.p());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w0 get() {
        return c();
    }
}

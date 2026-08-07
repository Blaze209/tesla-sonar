package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class W implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f29380a;

    public W(O o11) {
        this.f29380a = o11;
    }

    public static P5 b(O o11) {
        return (P5) qj0.h.d(o11.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public P5 get() {
        return b(this.f29380a);
    }

    public static W a(O o11) {
        return new W(o11);
    }
}

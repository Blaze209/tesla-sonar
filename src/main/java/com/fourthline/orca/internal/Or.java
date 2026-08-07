package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class Or implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Hr f27214a;

    public Or(Hr hr2) {
        this.f27214a = hr2;
    }

    public static Oq b(Hr hr2) {
        return (Oq) qj0.h.d(hr2.c());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Oq get() {
        return b(this.f27214a);
    }

    public static Or a(Hr hr2) {
        return new Or(hr2);
    }
}

package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.rx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3790rx implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3662ox f35174a;

    public C3790rx(C3662ox c3662ox) {
        this.f35174a = c3662ox;
    }

    public static Wf b(C3662ox c3662ox) {
        return (Wf) qj0.h.d(c3662ox.c());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Wf get() {
        return b(this.f35174a);
    }

    public static C3790rx a(C3662ox c3662ox) {
        return new C3790rx(c3662ox);
    }
}

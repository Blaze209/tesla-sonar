package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4115zd implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4072yd f37255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f37256b;

    public C4115zd(C4072yd c4072yd, Provider provider) {
        this.f37255a = c4072yd;
        this.f37256b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3092bi get() {
        return a(this.f37255a, (C3438jo) this.f37256b.get());
    }

    public static C4115zd a(C4072yd c4072yd, Provider provider) {
        return new C4115zd(c4072yd, provider);
    }

    public static C3092bi a(C4072yd c4072yd, C3438jo c3438jo) {
        return (C3092bi) qj0.h.d(c4072yd.a(c3438jo));
    }
}

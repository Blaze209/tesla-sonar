package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Ye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3018Ye implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2977Ve f29870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29871b;

    public C3018Ye(C2977Ve c2977Ve, Provider provider) {
        this.f29870a = c2977Ve;
        this.f29871b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3785rs get() {
        return a(this.f29870a, (C3438jo) this.f29871b.get());
    }

    public static C3018Ye a(C2977Ve c2977Ve, Provider provider) {
        return new C3018Ye(c2977Ve, provider);
    }

    public static C3785rs a(C2977Ve c2977Ve, C3438jo c3438jo) {
        return (C3785rs) qj0.h.d(c2977Ve.b(c3438jo));
    }
}

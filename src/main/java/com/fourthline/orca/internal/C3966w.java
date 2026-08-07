package com.fourthline.orca.internal;

import com.fourthline.core.internal.TimestampProvider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3966w implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3152d f36314a;

    public C3966w(C3152d c3152d) {
        this.f36314a = c3152d;
    }

    public static TimestampProvider b(C3152d c3152d) {
        return (TimestampProvider) qj0.h.d(c3152d.o());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public TimestampProvider get() {
        return b(this.f36314a);
    }

    public static C3966w a(C3152d c3152d) {
        return new C3966w(c3152d);
    }
}

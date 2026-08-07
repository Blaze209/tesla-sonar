package com.fourthline.orca.internal;

import com.fourthline.core.location.LocationProvider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3665p implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3152d f34408a;

    public C3665p(C3152d c3152d) {
        this.f34408a = c3152d;
    }

    public static LocationProvider b(C3152d c3152d) {
        return (LocationProvider) qj0.h.d(c3152d.k());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LocationProvider get() {
        return b(this.f34408a);
    }

    public static C3665p a(C3152d c3152d) {
        return new C3665p(c3152d);
    }
}

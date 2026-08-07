package com.fourthline.orca.internal;

import androidx.p002activity.result.ActivityResultRegistry;

/* JADX INFO: renamed from: com.fourthline.orca.internal.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3280g implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3152d f31906a;

    public C3280g(C3152d c3152d) {
        this.f31906a = c3152d;
    }

    public static ActivityResultRegistry b(C3152d c3152d) {
        return (ActivityResultRegistry) qj0.h.d(c3152d.d());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ActivityResultRegistry get() {
        return b(this.f31906a);
    }

    public static C3280g a(C3152d c3152d) {
        return new C3280g(c3152d);
    }
}

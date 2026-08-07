package com.fourthline.orca.internal;

import android.content.ContentResolver;

/* JADX INFO: renamed from: com.fourthline.orca.internal.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3194e implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3152d f31279a;

    public C3194e(C3152d c3152d) {
        this.f31279a = c3152d;
    }

    public static ContentResolver b(C3152d c3152d) {
        return (ContentResolver) qj0.h.d(c3152d.c());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ContentResolver get() {
        return b(this.f31279a);
    }

    public static C3194e a(C3152d c3152d) {
        return new C3194e(c3152d);
    }
}

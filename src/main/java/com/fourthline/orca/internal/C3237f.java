package com.fourthline.orca.internal;

import android.app.Activity;

/* JADX INFO: renamed from: com.fourthline.orca.internal.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3237f implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3152d f31561a;

    public C3237f(C3152d c3152d) {
        this.f31561a = c3152d;
    }

    public static Activity b(C3152d c3152d) {
        return (Activity) qj0.h.d(c3152d.b());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Activity get() {
        return b(this.f31561a);
    }

    public static C3237f a(C3152d c3152d) {
        return new C3237f(c3152d);
    }
}

package com.fourthline.orca.internal;

import android.content.Context;

/* JADX INFO: renamed from: com.fourthline.orca.internal.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3407j implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3152d f32632a;

    public C3407j(C3152d c3152d) {
        this.f32632a = c3152d;
    }

    public static Context b(C3152d c3152d) {
        return (Context) qj0.h.d(c3152d.f());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return b(this.f32632a);
    }

    public static C3407j a(C3152d c3152d) {
        return new C3407j(c3152d);
    }
}

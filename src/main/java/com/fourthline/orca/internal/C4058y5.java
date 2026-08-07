package com.fourthline.orca.internal;

import android.content.Context;

/* JADX INFO: renamed from: com.fourthline.orca.internal.y5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4058y5 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4015x5 f36895a;

    public C4058y5(C4015x5 c4015x5) {
        this.f36895a = c4015x5;
    }

    public static Context b(C4015x5 c4015x5) {
        return (Context) qj0.h.d(c4015x5.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return b(this.f36895a);
    }

    public static C4058y5 a(C4015x5 c4015x5) {
        return new C4058y5(c4015x5);
    }
}

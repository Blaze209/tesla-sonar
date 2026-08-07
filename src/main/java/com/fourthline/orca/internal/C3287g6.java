package com.fourthline.orca.internal;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.g6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3287g6 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y5 f31942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31943b;

    public C3287g6(Y5 y11, Provider provider) {
        this.f31942a = y11;
        this.f31943b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3259ff get() {
        return a(this.f31942a, (Context) this.f31943b.get());
    }

    public static C3287g6 a(Y5 y11, Provider provider) {
        return new C3287g6(y11, provider);
    }

    public static C3259ff a(Y5 y11, Context context) {
        return (C3259ff) qj0.h.d(y11.a(context));
    }
}

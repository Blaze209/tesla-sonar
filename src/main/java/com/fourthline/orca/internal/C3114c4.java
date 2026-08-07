package com.fourthline.orca.internal;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.c4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3114c4 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f30783a;

    public C3114c4(Provider provider) {
        this.f30783a = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3072b4 get() {
        return a((Context) this.f30783a.get());
    }

    public static C3114c4 a(Provider provider) {
        return new C3114c4(provider);
    }

    public static C3072b4 a(Context context) {
        return new C3072b4(context);
    }
}

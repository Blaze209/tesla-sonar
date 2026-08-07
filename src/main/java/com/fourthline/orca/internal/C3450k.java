package com.fourthline.orca.internal;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3450k implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3152d f32859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32860b;

    public C3450k(C3152d c3152d, Provider provider) {
        this.f32859a = c3152d;
        this.f32860b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CoroutineScope get() {
        return a(this.f32859a, (androidx.p003lifecycle.f1) this.f32860b.get());
    }

    public static C3450k a(C3152d c3152d, Provider provider) {
        return new C3450k(c3152d, provider);
    }

    public static CoroutineScope a(C3152d c3152d, androidx.p003lifecycle.f1 f1Var) {
        return (CoroutineScope) qj0.h.d(c3152d.a(f1Var));
    }
}

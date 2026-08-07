package com.fourthline.orca.internal;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.p4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3670p4 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3498l4 f34435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f34436b;

    public C3670p4(C3498l4 c3498l4, Provider provider) {
        this.f34435a = c3498l4;
        this.f34436b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3954vo get() {
        return a(this.f34435a, (Context) this.f34436b.get());
    }

    public static C3670p4 a(C3498l4 c3498l4, Provider provider) {
        return new C3670p4(c3498l4, provider);
    }

    public static C3954vo a(C3498l4 c3498l4, Context context) {
        return (C3954vo) qj0.h.d(c3498l4.a(context));
    }
}

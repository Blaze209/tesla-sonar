package com.fourthline.orca.internal;

import java.util.List;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.l7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3501l7 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z6 f33235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f33236b;

    public C3501l7(Z6 z11, Provider provider) {
        this.f33235a = z11;
        this.f33236b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List get() {
        return a(this.f33235a, (ou.m) this.f33236b.get());
    }

    public static C3501l7 a(Z6 z11, Provider provider) {
        return new C3501l7(z11, provider);
    }

    public static List a(Z6 z11, ou.m mVar) {
        return (List) qj0.h.d(z11.b(mVar));
    }
}

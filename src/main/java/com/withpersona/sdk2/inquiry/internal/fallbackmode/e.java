package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.squareup.moshi.u;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements qj0.e<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<FallbackModeService> f57741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<u> f57742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qj0.i<i.a> f57743c;

    public e(qj0.i<FallbackModeService> iVar, qj0.i<u> iVar2, qj0.i<i.a> iVar3) {
        this.f57741a = iVar;
        this.f57742b = iVar2;
        this.f57743c = iVar3;
    }

    public static e a(qj0.i<FallbackModeService> iVar, qj0.i<u> iVar2, qj0.i<i.a> iVar3) {
        return new e(iVar, iVar2, iVar3);
    }

    public static d c(FallbackModeService fallbackModeService, u uVar, i.a aVar) {
        return new d(fallbackModeService, uVar, aVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f57741a.get(), this.f57742b.get(), this.f57743c.get());
    }
}

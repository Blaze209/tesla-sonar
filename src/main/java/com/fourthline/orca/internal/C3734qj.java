package com.fourthline.orca.internal;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.qj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3734qj implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3691pj f34845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f34846b;

    public C3734qj(C3691pj c3691pj, Provider provider) {
        this.f34845a = c3691pj;
        this.f34846b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2874Gc get() {
        return a(this.f34845a, (CoroutineScope) this.f34846b.get());
    }

    public static C3734qj a(C3691pj c3691pj, Provider provider) {
        return new C3734qj(c3691pj, provider);
    }

    public static C2874Gc a(C3691pj c3691pj, CoroutineScope coroutineScope) {
        return (C2874Gc) qj0.h.d(c3691pj.a(coroutineScope));
    }
}

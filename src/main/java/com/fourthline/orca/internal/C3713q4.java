package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.q4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3713q4 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3498l4 f34715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f34716b;

    public C3713q4(C3498l4 c3498l4, Provider provider) {
        this.f34715a = c3498l4;
        this.f34716b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public EA get() {
        return a(this.f34715a, (wn0.a) this.f34716b.get());
    }

    public static C3713q4 a(C3498l4 c3498l4, Provider provider) {
        return new C3713q4(c3498l4, provider);
    }

    public static EA a(C3498l4 c3498l4, wn0.a aVar) {
        return (EA) qj0.h.d(c3498l4.a(aVar));
    }
}

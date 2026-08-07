package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.zk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4122zk implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4079yk f37302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f37303b;

    public C4122zk(C4079yk c4079yk, Provider provider) {
        this.f37302a = c4079yk;
        this.f37303b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Fk get() {
        return a(this.f37302a, (p011ja.w) this.f37303b.get());
    }

    public static C4122zk a(C4079yk c4079yk, Provider provider) {
        return new C4122zk(c4079yk, provider);
    }

    public static Fk a(C4079yk c4079yk, p011ja.w wVar) {
        return (Fk) qj0.h.d(c4079yk.a(wVar));
    }
}

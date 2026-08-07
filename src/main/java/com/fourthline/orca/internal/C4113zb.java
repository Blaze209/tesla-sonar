package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4113zb implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3811sb f37251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f37252b;

    public C4113zb(C3811sb c3811sb, Provider provider) {
        this.f37251a = c3811sb;
        this.f37252b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3092bi get() {
        return a(this.f37251a, (C3438jo) this.f37252b.get());
    }

    public static C4113zb a(C3811sb c3811sb, Provider provider) {
        return new C4113zb(c3811sb, provider);
    }

    public static C3092bi a(C3811sb c3811sb, C3438jo c3438jo) {
        return (C3092bi) qj0.h.d(c3811sb.a(c3438jo));
    }
}

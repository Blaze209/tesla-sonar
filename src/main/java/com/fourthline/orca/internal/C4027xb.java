package com.fourthline.orca.internal;

import java.util.List;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4027xb implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3811sb f36700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f36701b;

    public C4027xb(C3811sb c3811sb, Provider provider) {
        this.f36700a = c3811sb;
        this.f36701b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public P5 get() {
        return a(this.f36700a, (List) this.f36701b.get());
    }

    public static C4027xb a(C3811sb c3811sb, Provider provider) {
        return new C4027xb(c3811sb, provider);
    }

    public static P5 a(C3811sb c3811sb, List list) {
        return (P5) qj0.h.d(c3811sb.a(list));
    }
}

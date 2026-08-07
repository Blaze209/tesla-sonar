package com.fourthline.orca.internal;

import java.util.List;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3897ub implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3811sb f35863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f35864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f35865c;

    public C3897ub(C3811sb c3811sb, Provider provider, Provider provider2) {
        this.f35863a = c3811sb;
        this.f35864b = provider;
        this.f35865c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Q5 get() {
        return a(this.f35863a, (List) this.f35864b.get(), (EA) this.f35865c.get());
    }

    public static C3897ub a(C3811sb c3811sb, Provider provider, Provider provider2) {
        return new C3897ub(c3811sb, provider, provider2);
    }

    public static Q5 a(C3811sb c3811sb, List list, EA ea2) {
        return (Q5) qj0.h.d(c3811sb.a(list, ea2));
    }
}

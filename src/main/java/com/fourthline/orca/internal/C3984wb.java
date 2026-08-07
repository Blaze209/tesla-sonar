package com.fourthline.orca.internal;

import java.util.List;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.wb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3984wb implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3811sb f36414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f36415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f36416c;

    public C3984wb(C3811sb c3811sb, Provider provider, Provider provider2) {
        this.f36414a = c3811sb;
        this.f36415b = provider;
        this.f36416c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public S7 get() {
        return a(this.f36414a, (C4104z8) this.f36415b.get(), (List) this.f36416c.get());
    }

    public static C3984wb a(C3811sb c3811sb, Provider provider, Provider provider2) {
        return new C3984wb(c3811sb, provider, provider2);
    }

    public static S7 a(C3811sb c3811sb, C4104z8 c4104z8, List list) {
        return (S7) qj0.h.d(c3811sb.a(c4104z8, list));
    }
}

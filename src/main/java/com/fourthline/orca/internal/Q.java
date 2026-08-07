package com.fourthline.orca.internal;

import java.util.List;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Q implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f27411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f27413c;

    public Q(O o11, Provider provider, Provider provider2) {
        this.f27411a = o11;
        this.f27412b = provider;
        this.f27413c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public G get() {
        return a(this.f27411a, (C4052y) this.f27412b.get(), (List) this.f27413c.get());
    }

    public static Q a(O o11, Provider provider, Provider provider2) {
        return new Q(o11, provider, provider2);
    }

    public static G a(O o11, C4052y c4052y, List list) {
        return (G) qj0.h.d(o11.a(c4052y, list));
    }
}

package com.fourthline.orca.internal;

import java.util.List;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class K9 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C9 f26556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26557b;

    public K9(C9 c11, Provider provider) {
        this.f26556a = c11;
        this.f26557b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List get() {
        return a(this.f26556a, (A9) this.f26557b.get());
    }

    public static K9 a(C9 c11, Provider provider) {
        return new K9(c11, provider);
    }

    public static List a(C9 c11, A9 a11) {
        return (List) qj0.h.d(c11.b(a11));
    }
}

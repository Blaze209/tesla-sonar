package com.fourthline.orca.internal;

import java.util.List;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class U implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f27986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f27988c;

    public U(O o11, Provider provider, Provider provider2) {
        this.f27986a = o11;
        this.f27987b = provider;
        this.f27988c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public O5 get() {
        return a(this.f27986a, (List) this.f27987b.get(), (InterfaceC4117zf) this.f27988c.get());
    }

    public static U a(O o11, Provider provider, Provider provider2) {
        return new U(o11, provider, provider2);
    }

    public static O5 a(O o11, List list, InterfaceC4117zf interfaceC4117zf) {
        return (O5) qj0.h.d(o11.a(list, interfaceC4117zf));
    }
}

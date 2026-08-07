package com.fourthline.orca.internal;

import com.fourthline.orca.qes.internal.error.WorkerErrorPopupClicksHandler;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Tt implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Et f27973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f27975c;

    public Tt(Et et2, Provider provider, Provider provider2) {
        this.f27973a = et2;
        this.f27974b = provider;
        this.f27975c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public WorkerErrorPopupClicksHandler get() {
        return a(this.f27973a, (InterfaceC3997wo) this.f27974b.get(), (C3104bu) this.f27975c.get());
    }

    public static Tt a(Et et2, Provider provider, Provider provider2) {
        return new Tt(et2, provider, provider2);
    }

    public static WorkerErrorPopupClicksHandler a(Et et2, InterfaceC3997wo interfaceC3997wo, C3104bu c3104bu) {
        return (WorkerErrorPopupClicksHandler) qj0.h.d(et2.a(interfaceC3997wo, c3104bu));
    }
}

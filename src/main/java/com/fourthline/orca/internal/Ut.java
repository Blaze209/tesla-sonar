package com.fourthline.orca.internal;

import com.fourthline.orca.qes.internal.error.WorkerErrorPopupStateBuilder;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Ut implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Et f28852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f28853b;

    public Ut(Et et2, Provider provider) {
        this.f28852a = et2;
        this.f28853b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public WorkerErrorPopupStateBuilder get() {
        return a(this.f28852a, (InterfaceC3732qh) this.f28853b.get());
    }

    public static Ut a(Et et2, Provider provider) {
        return new Ut(et2, provider);
    }

    public static WorkerErrorPopupStateBuilder a(Et et2, InterfaceC3732qh interfaceC3732qh) {
        return (WorkerErrorPopupStateBuilder) qj0.h.d(et2.e(interfaceC3732qh));
    }
}

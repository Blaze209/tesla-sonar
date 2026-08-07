package com.fourthline.orca.internal;

import com.fourthline.orca.qes.internal.error.WorkerErrorPopupClicksHandler;
import com.fourthline.orca.qes.internal.error.WorkerErrorPopupStateBuilder;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class St implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Et f27802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f27804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f27805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f27806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f27807f;

    public St(Et et2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f27802a = et2;
        this.f27803b = provider;
        this.f27804c = provider2;
        this.f27805d = provider3;
        this.f27806e = provider4;
        this.f27807f = provider5;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC2931Re get() {
        return a(this.f27802a, (WorkerErrorPopupClicksHandler) this.f27803b.get(), (Bs) this.f27804c.get(), (WorkerErrorPopupStateBuilder) this.f27805d.get(), (C3046af) this.f27806e.get(), (CoroutineScope) this.f27807f.get());
    }

    public static St a(Et et2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new St(et2, provider, provider2, provider3, provider4, provider5);
    }

    public static InterfaceC2931Re a(Et et2, WorkerErrorPopupClicksHandler workerErrorPopupClicksHandler, Bs bs2, WorkerErrorPopupStateBuilder workerErrorPopupStateBuilder, C3046af c3046af, CoroutineScope coroutineScope) {
        return (InterfaceC2931Re) qj0.h.d(et2.a(workerErrorPopupClicksHandler, bs2, workerErrorPopupStateBuilder, c3046af, coroutineScope));
    }
}

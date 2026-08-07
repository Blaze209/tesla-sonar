package com.fourthline.orca.internal;

import com.fourthline.orca.qes.internal.error.QesErrorPopupClicksHandler;
import com.fourthline.orca.qes.internal.error.QesErrorPopupStateBuilder;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class Lt implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Et f26852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f26854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f26855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f26856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f26857f;

    public Lt(Et et2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f26852a = et2;
        this.f26853b = provider;
        this.f26854c = provider2;
        this.f26855d = provider3;
        this.f26856e = provider4;
        this.f26857f = provider5;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC2931Re get() {
        return a(this.f26852a, (QesErrorPopupClicksHandler) this.f26853b.get(), (Bs) this.f26854c.get(), (QesErrorPopupStateBuilder) this.f26855d.get(), (C3046af) this.f26856e.get(), (CoroutineScope) this.f26857f.get());
    }

    public static Lt a(Et et2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new Lt(et2, provider, provider2, provider3, provider4, provider5);
    }

    public static InterfaceC2931Re a(Et et2, QesErrorPopupClicksHandler qesErrorPopupClicksHandler, Bs bs2, QesErrorPopupStateBuilder qesErrorPopupStateBuilder, C3046af c3046af, CoroutineScope coroutineScope) {
        return (InterfaceC2931Re) qj0.h.d(et2.a(qesErrorPopupClicksHandler, bs2, qesErrorPopupStateBuilder, c3046af, coroutineScope));
    }
}

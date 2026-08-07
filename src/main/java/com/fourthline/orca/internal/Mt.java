package com.fourthline.orca.internal;

import com.fourthline.orca.qes.internal.error.QesErrorPopupClicksHandler;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Mt implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Et f26965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26966b;

    public Mt(Et et2, Provider provider) {
        this.f26965a = et2;
        this.f26966b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public QesErrorPopupClicksHandler get() {
        return a(this.f26965a, (InterfaceC3997wo) this.f26966b.get());
    }

    public static Mt a(Et et2, Provider provider) {
        return new Mt(et2, provider);
    }

    public static QesErrorPopupClicksHandler a(Et et2, InterfaceC3997wo interfaceC3997wo) {
        return (QesErrorPopupClicksHandler) qj0.h.d(et2.a(interfaceC3997wo));
    }
}

package com.fourthline.orca.internal;

import com.fourthline.core.eid.EidServiceProvider;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Dd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2857Dd implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4072yd f25457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f25459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f25460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f25461e;

    public C2857Dd(C4072yd c4072yd, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f25457a = c4072yd;
        this.f25458b = provider;
        this.f25459c = provider2;
        this.f25460d = provider3;
        this.f25461e = provider4;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3991wi.e get() {
        return a(this.f25457a, (InterfaceC2869Fd) this.f25458b.get(), (C2899Lc) this.f25459c.get(), (CoroutineScope) this.f25460d.get(), (EidServiceProvider) this.f25461e.get());
    }

    public static C2857Dd a(C4072yd c4072yd, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C2857Dd(c4072yd, provider, provider2, provider3, provider4);
    }

    public static C3991wi.e a(C4072yd c4072yd, InterfaceC2869Fd interfaceC2869Fd, C2899Lc c2899Lc, CoroutineScope coroutineScope, EidServiceProvider eidServiceProvider) {
        return (C3991wi.e) qj0.h.d(c4072yd.a(interfaceC2869Fd, c2899Lc, coroutineScope, eidServiceProvider));
    }
}

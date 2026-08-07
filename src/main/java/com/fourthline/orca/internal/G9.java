package com.fourthline.orca.internal;

import java.util.List;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class G9 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C9 f25916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f25918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f25919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f25920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f25921f;

    public G9(C9 c11, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f25916a = c11;
        this.f25917b = provider;
        this.f25918c = provider2;
        this.f25919d = provider3;
        this.f25920e = provider4;
        this.f25921f = provider5;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3424ja get() {
        return a(this.f25916a, (W6) this.f25917b.get(), (E6) this.f25918c.get(), (A9) this.f25919d.get(), (List) this.f25920e.get(), ((Boolean) this.f25921f.get()).booleanValue());
    }

    public static G9 a(C9 c11, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new G9(c11, provider, provider2, provider3, provider4, provider5);
    }

    public static C3424ja a(C9 c11, W6 w11, E6 e11, A9 a11, List list, boolean z11) {
        return (C3424ja) qj0.h.d(c11.a(w11, e11, a11, list, z11));
    }
}

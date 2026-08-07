package com.fourthline.orca.internal;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.j5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3413j5 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3286g5 f32666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f32668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f32669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f32670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f32671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f32672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f32673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider f32674i;

    public C3413j5(C3286g5 c3286g5, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.f32666a = c3286g5;
        this.f32667b = provider;
        this.f32668c = provider2;
        this.f32669d = provider3;
        this.f32670e = provider4;
        this.f32671f = provider5;
        this.f32672g = provider6;
        this.f32673h = provider7;
        this.f32674i = provider8;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3030a5 get() {
        return a(this.f32666a, (H4) this.f32667b.get(), (C3714q5) this.f32668c.get(), (InterfaceC3988wf) this.f32669d.get(), (C3243f5) this.f32670e.get(), (ED) this.f32671f.get(), (J4) this.f32672g.get(), (InterfaceC4044xs) this.f32673h.get(), (CoroutineScope) this.f32674i.get());
    }

    public static C3413j5 a(C3286g5 c3286g5, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        return new C3413j5(c3286g5, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static C3030a5 a(C3286g5 c3286g5, H4 h11, C3714q5 c3714q5, InterfaceC3988wf interfaceC3988wf, C3243f5 c3243f5, ED ed2, J4 j11, InterfaceC4044xs interfaceC4044xs, CoroutineScope coroutineScope) {
        return (C3030a5) qj0.h.d(c3286g5.a(h11, c3714q5, interfaceC3988wf, c3243f5, ed2, j11, interfaceC4044xs, coroutineScope));
    }
}

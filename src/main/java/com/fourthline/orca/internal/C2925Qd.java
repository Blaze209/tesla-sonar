package com.fourthline.orca.internal;

import android.content.Context;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Qd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2925Qd implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2905Md f27456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f27458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f27459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f27460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f27461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f27462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f27463h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider f27464i;

    public C2925Qd(C2905Md c2905Md, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.f27456a = c2905Md;
        this.f27457b = provider;
        this.f27458c = provider2;
        this.f27459d = provider3;
        this.f27460e = provider4;
        this.f27461f = provider5;
        this.f27462g = provider6;
        this.f27463h = provider7;
        this.f27464i = provider8;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3007Wd get() {
        return a(this.f27456a, (Context) this.f27457b.get(), (C2976Vd) this.f27458c.get(), (C3343hd) this.f27459d.get(), (InterfaceC2930Rd) this.f27460e.get(), (C2885Id) this.f27461f.get(), (InterfaceC3732qh) this.f27462g.get(), (C4087ys) this.f27463h.get(), (CoroutineScope) this.f27464i.get());
    }

    public static C2925Qd a(C2905Md c2905Md, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        return new C2925Qd(c2905Md, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static C3007Wd a(C2905Md c2905Md, Context context, C2976Vd c2976Vd, C3343hd c3343hd, InterfaceC2930Rd interfaceC2930Rd, C2885Id c2885Id, InterfaceC3732qh interfaceC3732qh, C4087ys c4087ys, CoroutineScope coroutineScope) {
        return (C3007Wd) qj0.h.d(c2905Md.a(context, c2976Vd, c3343hd, interfaceC2930Rd, c2885Id, interfaceC3732qh, c4087ys, coroutineScope));
    }
}

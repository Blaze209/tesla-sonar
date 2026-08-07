package com.fourthline.orca.internal;

import com.fourthline.core.internal.TimestampProvider;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class R8 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K8 f27599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f27601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f27602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f27603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f27604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f27605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f27606h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider f27607i;

    public R8(K8 k11, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.f27599a = k11;
        this.f27600b = provider;
        this.f27601c = provider2;
        this.f27602d = provider3;
        this.f27603e = provider4;
        this.f27604f = provider5;
        this.f27605g = provider6;
        this.f27606h = provider7;
        this.f27607i = provider8;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3459k8 get() {
        return a(this.f27599a, (C4061y8) this.f27600b.get(), (InterfaceC3546m9) this.f27601c.get(), (InterfaceC3375i8) this.f27602d.get(), (Y7) this.f27603e.get(), (TimestampProvider) this.f27604f.get(), (ED) this.f27605g.get(), (InterfaceC4044xs) this.f27606h.get(), (CoroutineScope) this.f27607i.get());
    }

    public static R8 a(K8 k11, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        return new R8(k11, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static C3459k8 a(K8 k11, C4061y8 c4061y8, InterfaceC3546m9 interfaceC3546m9, InterfaceC3375i8 interfaceC3375i8, Y7 y11, TimestampProvider timestampProvider, ED ed2, InterfaceC4044xs interfaceC4044xs, CoroutineScope coroutineScope) {
        return (C3459k8) qj0.h.d(k11.a(c4061y8, interfaceC3546m9, interfaceC3375i8, y11, timestampProvider, ed2, interfaceC4044xs, coroutineScope));
    }
}

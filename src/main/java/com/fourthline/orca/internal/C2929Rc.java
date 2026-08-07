package com.fourthline.orca.internal;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Rc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2929Rc implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2909Nc f27614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f27616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f27617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f27618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f27619f;

    public C2929Rc(C2909Nc c2909Nc, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f27614a = c2909Nc;
        this.f27615b = provider;
        this.f27616c = provider2;
        this.f27617d = provider3;
        this.f27618e = provider4;
        this.f27619f = provider5;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3016Yc get() {
        return a(this.f27614a, (C3011Xc) this.f27615b.get(), (Q3) this.f27616c.get(), (C3737qm) this.f27617d.get(), (C3343hd) this.f27618e.get(), (CoroutineScope) this.f27619f.get());
    }

    public static C2929Rc a(C2909Nc c2909Nc, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new C2929Rc(c2909Nc, provider, provider2, provider3, provider4, provider5);
    }

    public static C3016Yc a(C2909Nc c2909Nc, C3011Xc c3011Xc, Q3 q11, C3737qm c3737qm, C3343hd c3343hd, CoroutineScope coroutineScope) {
        return (C3016Yc) qj0.h.d(c2909Nc.a(c3011Xc, q11, c3737qm, c3343hd, coroutineScope));
    }
}

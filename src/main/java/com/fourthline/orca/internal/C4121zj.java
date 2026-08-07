package com.fourthline.orca.internal;

import com.fourthline.core.DeviceMetadata;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.zj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4121zj implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3691pj f37293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f37294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f37295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f37296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f37297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f37298f;

    public C4121zj(C3691pj c3691pj, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f37293a = c3691pj;
        this.f37294b = provider;
        this.f37295c = provider2;
        this.f37296d = provider3;
        this.f37297e = provider4;
        this.f37298f = provider5;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ED get() {
        return a(this.f37293a, (wn0.a) this.f37294b.get(), (DeviceMetadata) this.f37295c.get(), (C3562mj) this.f37296d.get(), (Vf) this.f37297e.get(), (InterfaceC3645og) this.f37298f.get());
    }

    public static C4121zj a(C3691pj c3691pj, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new C4121zj(c3691pj, provider, provider2, provider3, provider4, provider5);
    }

    public static ED a(C3691pj c3691pj, wn0.a aVar, DeviceMetadata deviceMetadata, C3562mj c3562mj, Vf vf2, InterfaceC3645og interfaceC3645og) {
        return (ED) qj0.h.d(c3691pj.a(aVar, deviceMetadata, c3562mj, vf2, interfaceC3645og));
    }
}

package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.mj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3562mj implements Qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f33600a;

    public C3562mj(boolean z11) {
        this.f33600a = z11;
    }

    @Override // com.fourthline.orca.internal.Qf
    public List a() {
        return p013kotlin.collections.v.r(b() ? InterfaceC3519lj.d.f33337a : null, new InterfaceC3519lj.a(null, 1, null));
    }

    public boolean b() {
        return this.f33600a;
    }
}

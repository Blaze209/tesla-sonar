package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3158d5 implements Qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f31062a;

    public C3158d5(boolean z11) {
        this.f31062a = z11;
    }

    @Override // com.fourthline.orca.internal.Qf
    public List a() {
        return p013kotlin.collections.v.r(b() ? InterfaceC3115c5.b.f30787a : null, new InterfaceC3115c5.a(null, 1, null));
    }

    public boolean b() {
        return this.f31062a;
    }
}

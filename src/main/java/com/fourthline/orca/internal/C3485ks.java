package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ks, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3485ks implements Qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f33054a;

    public C3485ks(boolean z11) {
        this.f33054a = z11;
    }

    @Override // com.fourthline.orca.internal.Qf
    public List a() {
        return p013kotlin.collections.v.e(b() ? InterfaceC3442js.a.f32836a : new InterfaceC3442js.b(null, 1, null));
    }

    public boolean b() {
        return this.f33054a;
    }
}

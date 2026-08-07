package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class L implements Qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f26690a;

    public L(boolean z11) {
        this.f26690a = z11;
    }

    @Override // com.fourthline.orca.internal.Qf
    public List a() {
        return p013kotlin.collections.v.r(b() ? K.b.f26517a : null, new K.a(null, 1, null));
    }

    public boolean b() {
        return this.f26690a;
    }
}

package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Mp implements Qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f26961a;

    public Mp(boolean z11) {
        this.f26961a = z11;
    }

    @Override // com.fourthline.orca.internal.Qf
    public List a() {
        return p013kotlin.collections.v.r(b() ? Pp.c.f27378a : null, new Pp.a(null, 1, null));
    }

    public boolean b() {
        return this.f26961a;
    }
}

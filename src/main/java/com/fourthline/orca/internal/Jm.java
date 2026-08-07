package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Jm implements Qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f26483a;

    public Jm(boolean z11) {
        this.f26483a = z11;
    }

    @Override // com.fourthline.orca.internal.Qf
    public List a() {
        return p013kotlin.collections.v.e(b() ? Im.a.f26325a : new Im.b(null, 1, null));
    }

    public boolean b() {
        return this.f26483a;
    }
}

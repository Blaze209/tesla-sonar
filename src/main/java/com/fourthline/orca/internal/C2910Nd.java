package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2910Nd implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2905Md f27040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27041b;

    public C2910Nd(C2905Md c2905Md, Provider provider) {
        this.f27040a = c2905Md;
        this.f27041b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2885Id get() {
        return a(this.f27040a, (C3438jo) this.f27041b.get());
    }

    public static C2910Nd a(C2905Md c2905Md, Provider provider) {
        return new C2910Nd(c2905Md, provider);
    }

    public static C2885Id a(C2905Md c2905Md, C3438jo c3438jo) {
        return (C2885Id) qj0.h.d(c2905Md.a(c3438jo));
    }
}

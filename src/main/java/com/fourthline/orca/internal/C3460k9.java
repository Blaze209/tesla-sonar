package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.k9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3460k9 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K8 f32935a;

    public C3460k9(K8 k11) {
        this.f32935a = k11;
    }

    public static List b(K8 k11) {
        return (List) qj0.h.d(k11.d());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List get() {
        return b(this.f32935a);
    }

    public static C3460k9 a(K8 k11) {
        return new C3460k9(k11);
    }
}

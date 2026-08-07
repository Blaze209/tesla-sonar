package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3323h implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3152d f32138a;

    public C3323h(C3152d c3152d) {
        this.f32138a = c3152d;
    }

    public static List b(C3152d c3152d) {
        return (List) qj0.h.d(c3152d.e());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List get() {
        return b(this.f32138a);
    }

    public static C3323h a(C3152d c3152d) {
        return new C3323h(c3152d);
    }
}

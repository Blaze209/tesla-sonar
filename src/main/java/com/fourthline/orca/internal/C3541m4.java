package com.fourthline.orca.internal;

import android.content.ContentResolver;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3541m4 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3498l4 f33506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f33507b;

    public C3541m4(C3498l4 c3498l4, Provider provider) {
        this.f33506a = c3498l4;
        this.f33507b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3497l3 get() {
        return a(this.f33506a, (ContentResolver) this.f33507b.get());
    }

    public static C3541m4 a(C3498l4 c3498l4, Provider provider) {
        return new C3541m4(c3498l4, provider);
    }

    public static C3497l3 a(C3498l4 c3498l4, ContentResolver contentResolver) {
        return (C3497l3) qj0.h.d(c3498l4.a(contentResolver));
    }
}

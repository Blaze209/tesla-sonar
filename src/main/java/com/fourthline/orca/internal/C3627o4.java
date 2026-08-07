package com.fourthline.orca.internal;

import android.content.ContentResolver;
import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3627o4 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3498l4 f34069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f34070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f34071c;

    public C3627o4(C3498l4 c3498l4, Provider provider, Provider provider2) {
        this.f34069a = c3498l4;
        this.f34070b = provider;
        this.f34071c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3944vf get() {
        return a(this.f34069a, (Context) this.f34070b.get(), (ContentResolver) this.f34071c.get());
    }

    public static C3627o4 a(C3498l4 c3498l4, Provider provider, Provider provider2) {
        return new C3627o4(c3498l4, provider, provider2);
    }

    public static C3944vf a(C3498l4 c3498l4, Context context, ContentResolver contentResolver) {
        return (C3944vf) qj0.h.d(c3498l4.a(context, contentResolver));
    }
}

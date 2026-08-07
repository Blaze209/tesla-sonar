package com.fourthline.orca.internal;

import android.content.ContentResolver;
import androidx.p002activity.result.ActivityResultRegistry;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.eu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3231eu implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f31529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f31531c;

    public C3231eu(C3146cu c3146cu, Provider provider, Provider provider2) {
        this.f31529a = c3146cu;
        this.f31530b = provider;
        this.f31531c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3730qf get() {
        return a(this.f31529a, (ContentResolver) this.f31530b.get(), (ActivityResultRegistry) this.f31531c.get());
    }

    public static C3231eu a(C3146cu c3146cu, Provider provider, Provider provider2) {
        return new C3231eu(c3146cu, provider, provider2);
    }

    public static InterfaceC3730qf a(C3146cu c3146cu, ContentResolver contentResolver, ActivityResultRegistry activityResultRegistry) {
        return (InterfaceC3730qf) qj0.h.d(c3146cu.a(contentResolver, activityResultRegistry));
    }
}

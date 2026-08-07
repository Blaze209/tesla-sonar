package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.eid.EidServiceProvider;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Yd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3017Yd implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3012Xd f29867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f29869c;

    public C3017Yd(C3012Xd c3012Xd, Provider provider, Provider provider2) {
        this.f29867a = c3012Xd;
        this.f29868b = provider;
        this.f29869c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public EidServiceProvider get() {
        return a(this.f29867a, (Context) this.f29868b.get(), (CoroutineScope) this.f29869c.get());
    }

    public static C3017Yd a(C3012Xd c3012Xd, Provider provider, Provider provider2) {
        return new C3017Yd(c3012Xd, provider, provider2);
    }

    public static EidServiceProvider a(C3012Xd c3012Xd, Context context, CoroutineScope coroutineScope) {
        return (EidServiceProvider) qj0.h.d(c3012Xd.a(context, coroutineScope));
    }
}

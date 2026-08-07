package com.fourthline.orca.internal;

import android.content.Context;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3708q implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3152d f34694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f34695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f34696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f34697d;

    public C3708q(C3152d c3152d, Provider provider, Provider provider2, Provider provider3) {
        this.f34694a = c3152d;
        this.f34695b = provider;
        this.f34696c = provider2;
        this.f34697d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Zk get() {
        return a(this.f34694a, (Context) this.f34695b.get(), (InterfaceC3997wo) this.f34696c.get(), (CoroutineScope) this.f34697d.get());
    }

    public static C3708q a(C3152d c3152d, Provider provider, Provider provider2, Provider provider3) {
        return new C3708q(c3152d, provider, provider2, provider3);
    }

    public static Zk a(C3152d c3152d, Context context, InterfaceC3997wo interfaceC3997wo, CoroutineScope coroutineScope) {
        return (Zk) qj0.h.d(c3152d.a(context, interfaceC3997wo, coroutineScope));
    }
}

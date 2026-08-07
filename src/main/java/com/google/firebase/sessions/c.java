package com.google.firebase.sessions;

import javax.inject.Provider;
import vw.ApplicationInfo;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements xw.b<ApplicationInfo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<com.google.firebase.f> f44807a;

    public c(Provider<com.google.firebase.f> provider) {
        this.f44807a = provider;
    }

    public static ApplicationInfo a(com.google.firebase.f fVar) {
        return (ApplicationInfo) xw.d.d(b.InterfaceC0699b.INSTANCE.e(fVar));
    }

    public static c b(Provider<com.google.firebase.f> provider) {
        return new c(provider);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ApplicationInfo get() {
        return a(this.f44807a.get());
    }
}

package com.fourthline.orca.internal;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Ze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3023Ze implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2977Ve f30021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30022b;

    public C3023Ze(C2977Ve c2977Ve, Provider provider) {
        this.f30021a = c2977Ve;
        this.f30022b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Es get() {
        return a(this.f30021a, (CoroutineScope) this.f30022b.get());
    }

    public static C3023Ze a(C2977Ve c2977Ve, Provider provider) {
        return new C3023Ze(c2977Ve, provider);
    }

    public static Es a(C2977Ve c2977Ve, CoroutineScope coroutineScope) {
        return (Es) qj0.h.d(c2977Ve.a(coroutineScope));
    }
}

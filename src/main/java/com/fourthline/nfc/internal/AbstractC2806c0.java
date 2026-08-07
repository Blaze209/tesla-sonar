package com.fourthline.nfc.internal;

import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: com.fourthline.nfc.internal.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2806c0 implements qj0.e {
    public static CoroutineContext a(C2802a0 c2802a0) {
        return (CoroutineContext) qj0.h.d(c2802a0.b());
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}

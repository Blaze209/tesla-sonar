package com.fourthline.nfc.internal;

import com.fourthline.core.internal.TimestampProvider;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l0 implements qj0.e {
    public static TimestampProvider a(C2802a0 c2802a0) {
        return (TimestampProvider) qj0.h.d(c2802a0.g());
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}

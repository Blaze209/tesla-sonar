package com.fourthline.nfc.internal;

import androidx.p002activity.result.ActivityResultRegistry;

/* JADX INFO: renamed from: com.fourthline.nfc.internal.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2804b0 implements qj0.e {
    public static ActivityResultRegistry a(C2802a0 c2802a0) {
        return (ActivityResultRegistry) qj0.h.d(c2802a0.a());
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}

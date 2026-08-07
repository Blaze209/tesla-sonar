package com.fourthline.vision.internal;

import android.content.Context;

/* JADX INFO: renamed from: com.fourthline.vision.internal.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4193g0 implements qj0.e {
    public static InterfaceC4226k3 a(L l11, Context context) {
        return (InterfaceC4226k3) qj0.h.d(l11.provideVideoFilesManager(context));
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}

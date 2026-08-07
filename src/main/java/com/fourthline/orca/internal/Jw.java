package com.fourthline.orca.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class Jw {
    public final Iw a(InterfaceC3051ak mainRepository) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        return new Iw(mainRepository.e().getTenant().getRemoteAssets());
    }

    public final Uj b(Context context, Iw remoteAssetsFeature) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(remoteAssetsFeature, "remoteAssetsFeature");
        return remoteAssetsFeature.b(context);
    }

    public final Ln c(Context context, Iw remoteAssetsFeature) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(remoteAssetsFeature, "remoteAssetsFeature");
        return remoteAssetsFeature.c(context);
    }

    public final InterfaceC3732qh a(Context context, Iw remoteAssetsFeature) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(remoteAssetsFeature, "remoteAssetsFeature");
        return remoteAssetsFeature.a(context);
    }
}

package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.ContextExtensionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class Iw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RemoteAssetsConfig f26390a;

    public Iw(RemoteAssetsConfig remoteAssetsConfig) {
        p013kotlin.jvm.internal.s.k(remoteAssetsConfig, "remoteAssetsConfig");
        this.f26390a = remoteAssetsConfig;
    }

    public final InterfaceC3732qh a(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        return this.f26390a.getEnabled() ? new C3774rh(ContextExtensionsKt.getAssetsFourthlineDirectory(context)) : new C3817sh();
    }

    public final Uj b(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        return this.f26390a.getEnabled() ? new Vj(ContextExtensionsKt.getAssetsFourthlineDirectory(context)) : new Wj();
    }

    public final Ln c(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        return this.f26390a.getEnabled() ? new Mn(context, new CD(new AD(ContextExtensionsKt.getAssetsFourthlineDirectory(context)))) : new Nn(context);
    }
}

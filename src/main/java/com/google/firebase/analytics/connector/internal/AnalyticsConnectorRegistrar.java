package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import qw.h;
import yu.q;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@KeepForSdk
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ wu.a lambda$getComponents$0(yu.d dVar) {
        return wu.b.h((com.google.firebase.f) dVar.a(com.google.firebase.f.class), (Context) dVar.a(Context.class), (vv.d) dVar.a(vv.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    @KeepForSdk
    public List<yu.c<?>> getComponents() {
        return Arrays.asList(yu.c.c(wu.a.class).b(q.k(com.google.firebase.f.class)).b(q.k(Context.class)).b(q.k(vv.d.class)).f(a.f43850a).e().d(), h.b("fire-analytics", "23.0.0"));
    }
}

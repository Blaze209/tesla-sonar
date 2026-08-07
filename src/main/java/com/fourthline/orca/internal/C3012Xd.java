package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.eid.EidServiceProvider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3012Xd {
    public final EidServiceProvider a(Context context, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        try {
            Object objNewInstance = Class.forName("com.fourthline.eid.RealEidServiceProvider").getConstructor(Context.class, CoroutineScope.class).newInstance(context, coroutineScope);
            p013kotlin.jvm.internal.s.i(objNewInstance, "null cannot be cast to non-null type com.fourthline.core.eid.EidServiceProvider");
            return (EidServiceProvider) objNewInstance;
        } catch (Throwable unused) {
            return Vn.f29137a;
        }
    }
}

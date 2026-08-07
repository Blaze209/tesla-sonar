package com.plaid.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import java.lang.reflect.Method;
import p013kotlin.coroutines.SafeContinuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;

/* JADX INFO: loaded from: classes6.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f46412b;

    public L(Context context, J networkRequestProvider) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(networkRequestProvider, "networkRequestProvider");
        this.f46411a = context;
        this.f46412b = networkRequestProvider;
    }

    public final Object a(String str, M m11) throws Throwable {
        boolean zBooleanValue;
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(m11));
        Object systemService = this.f46411a.getSystemService("connectivity");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        try {
            Method declaredMethod = Class.forName(connectivityManager.getClass().getName()).getDeclaredMethod("getMobileDataEnabled", null);
            p013kotlin.jvm.internal.s.j(declaredMethod, "c.getDeclaredMethod(\"getMobileDataEnabled\")");
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(connectivityManager, null);
            if (objInvoke == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            zBooleanValue = ((Boolean) objInvoke).booleanValue();
            if (zBooleanValue) {
                connectivityManager.requestNetwork(new NetworkRequest.Builder().addTransportType(0).addCapability(12).build(), new K(this, str, safeContinuation, connectivityManager));
            } else {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                safeContinuation.resumeWith(jn0.s.b(jn0.t.a(AbstractC4525r7.a.f48094a)));
            }
            Object orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(m11);
            }
            return orThrow;
        } catch (Exception e11) {
            e11.printStackTrace();
            zBooleanValue = false;
        }
    }
}

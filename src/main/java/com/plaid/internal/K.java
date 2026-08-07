package com.plaid.internal;

import android.net.ConnectivityManager;
import android.net.Network;
import p013kotlin.coroutines.SafeContinuation;

/* JADX INFO: loaded from: classes6.dex */
public final class K extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L f46375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f46376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SafeContinuation f46377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ConnectivityManager f46378d;

    public K(L l11, String str, SafeContinuation safeContinuation, ConnectivityManager connectivityManager) {
        this.f46375a = l11;
        this.f46376b = str;
        this.f46377c = safeContinuation;
        this.f46378d = connectivityManager;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        p013kotlin.jvm.internal.s.k(network, "network");
        try {
            try {
                this.f46377c.resumeWith(jn0.s.b(this.f46375a.f46412b.a(this.f46376b, network)));
            } catch (AbstractC4525r7.c e11) {
                SafeContinuation safeContinuation = this.f46377c;
                jn0.s.Companion companion = jn0.s.INSTANCE;
                safeContinuation.resumeWith(jn0.s.b(jn0.t.a(e11)));
            }
        } finally {
            ta0.a.f(this);
        }
    }
}

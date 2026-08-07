package com.plaid.internal;

import android.net.ConnectivityManager;

/* JADX INFO: renamed from: com.plaid.internal.k4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC4460k4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConnectivityManager f47798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4469l4.b f47799b;

    public RunnableC4460k4(ConnectivityManager connectivityManager, C4469l4.b bVar) {
        this.f47798a = connectivityManager;
        this.f47799b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ta0.a.f(this.f47799b);
    }
}

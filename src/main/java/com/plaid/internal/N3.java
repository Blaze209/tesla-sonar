package com.plaid.internal;

import androidx.annotation.NonNull;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class N3 implements Callable<jn0.h0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P3 f46537b;

    public N3(P3 p11, String str) {
        this.f46537b = p11;
        this.f46536a = str;
    }

    @Override // java.util.concurrent.Callable
    @NonNull
    public final jn0.h0 call() {
        za.g gVarAcquire = this.f46537b.f46584c.acquire();
        gVarAcquire.R0(1, this.f46536a);
        try {
            this.f46537b.f46582a.beginTransaction();
            try {
                gVarAcquire.W();
                this.f46537b.f46582a.setTransactionSuccessful();
                jn0.h0 h0Var = jn0.h0.f84049a;
                this.f46537b.f46582a.endTransaction();
                this.f46537b.f46584c.release(gVarAcquire);
                return h0Var;
            } catch (Throwable th2) {
                this.f46537b.f46582a.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f46537b.f46584c.release(gVarAcquire);
            throw th3;
        }
    }
}

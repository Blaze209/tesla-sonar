package com.plaid.internal;

import androidx.annotation.NonNull;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class M3 implements Callable<jn0.h0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f46456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f46457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P3 f46458d;

    public M3(P3 p11, String str, String str2, String str3) {
        this.f46458d = p11;
        this.f46455a = str;
        this.f46456b = str2;
        this.f46457c = str3;
    }

    @Override // java.util.concurrent.Callable
    @NonNull
    public final jn0.h0 call() {
        za.g gVarAcquire = this.f46458d.f46583b.acquire();
        gVarAcquire.R0(1, this.f46455a);
        gVarAcquire.R0(2, this.f46456b);
        gVarAcquire.R0(3, this.f46457c);
        try {
            this.f46458d.f46582a.beginTransaction();
            try {
                gVarAcquire.F2();
                this.f46458d.f46582a.setTransactionSuccessful();
                jn0.h0 h0Var = jn0.h0.f84049a;
                this.f46458d.f46582a.endTransaction();
                this.f46458d.f46583b.release(gVarAcquire);
                return h0Var;
            } catch (Throwable th2) {
                this.f46458d.f46582a.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f46458d.f46583b.release(gVarAcquire);
            throw th3;
        }
    }
}

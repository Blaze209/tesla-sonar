package com.plaid.internal;

import androidx.annotation.NonNull;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class F4 implements Callable<jn0.h0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f46314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f46315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ H4 f46316d;

    public F4(H4 h11, String str, String str2, byte[] bArr) {
        this.f46316d = h11;
        this.f46313a = str;
        this.f46314b = str2;
        this.f46315c = bArr;
    }

    @Override // java.util.concurrent.Callable
    @NonNull
    public final jn0.h0 call() {
        za.g gVarAcquire = this.f46316d.f46334b.acquire();
        gVarAcquire.R0(1, this.f46313a);
        gVarAcquire.R0(2, this.f46314b);
        gVarAcquire.y(3, this.f46315c);
        try {
            this.f46316d.f46333a.beginTransaction();
            try {
                gVarAcquire.F2();
                this.f46316d.f46333a.setTransactionSuccessful();
                jn0.h0 h0Var = jn0.h0.f84049a;
                this.f46316d.f46333a.endTransaction();
                this.f46316d.f46334b.release(gVarAcquire);
                return h0Var;
            } catch (Throwable th2) {
                this.f46316d.f46333a.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f46316d.f46334b.release(gVarAcquire);
            throw th3;
        }
    }
}

package com.plaid.internal;

import androidx.annotation.NonNull;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class a8 implements Callable<jn0.h0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f46871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f46872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b8 f46873d;

    public a8(b8 b8Var, String str, String str2, byte[] bArr) {
        this.f46873d = b8Var;
        this.f46870a = str;
        this.f46871b = str2;
        this.f46872c = bArr;
    }

    @Override // java.util.concurrent.Callable
    @NonNull
    public final jn0.h0 call() {
        za.g gVarAcquire = this.f46873d.f46895c.acquire();
        gVarAcquire.R0(1, this.f46870a);
        gVarAcquire.R0(2, this.f46871b);
        gVarAcquire.y(3, this.f46872c);
        try {
            this.f46873d.f46893a.beginTransaction();
            try {
                gVarAcquire.F2();
                this.f46873d.f46893a.setTransactionSuccessful();
                jn0.h0 h0Var = jn0.h0.f84049a;
                this.f46873d.f46893a.endTransaction();
                this.f46873d.f46895c.release(gVarAcquire);
                return h0Var;
            } catch (Throwable th2) {
                this.f46873d.f46893a.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f46873d.f46895c.release(gVarAcquire);
            throw th3;
        }
    }
}

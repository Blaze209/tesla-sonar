package com.plaid.internal;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class Z7 implements Callable<jn0.h0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f46853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b8 f46854b;

    public Z7(b8 b8Var, ArrayList arrayList) {
        this.f46854b = b8Var;
        this.f46853a = arrayList;
    }

    @Override // java.util.concurrent.Callable
    @NonNull
    public final jn0.h0 call() {
        this.f46854b.f46893a.beginTransaction();
        try {
            this.f46854b.f46894b.handleMultiple(this.f46853a);
            this.f46854b.f46893a.setTransactionSuccessful();
            return jn0.h0.f84049a;
        } finally {
            this.f46854b.f46893a.endTransaction();
        }
    }
}
